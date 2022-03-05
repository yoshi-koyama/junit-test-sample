package com.raisetech.junittestsample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScheduleServiceImplTest {

    private ScheduleServiceImpl scheduleService;

    @BeforeEach
    void setUp() {
        scheduleService = new ScheduleServiceImpl();
    }

    @Test
    void お腹が減っていて1000円あるときには外食にするという値が返却されること() {
        String actual = scheduleService.createSchedule(true, 10000);
        assertThat(actual).isEqualTo("外食にする");
    }

    @Test
    void お腹が減っていて999円しかないときには寝るという値が返却されること() {
        String actual = scheduleService.createSchedule(true, 999);
        assertThat(actual).isEqualTo("就寝する");
    }

    @Test
    void お腹が減っていないが1000円あるときには寝るという値が返却されること() {
        String actual = scheduleService.createSchedule(false, 1000);
        assertThat(actual).isEqualTo("就寝する");
    }

    @Test
    void お腹が減っていないうえに999円しかないときには寝るという値が返却されること() {
        String actual = scheduleService.createSchedule(false, 999);
        assertThat(actual).isEqualTo("就寝する");
    }
}
