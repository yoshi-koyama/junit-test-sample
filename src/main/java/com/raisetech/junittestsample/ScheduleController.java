package com.raisetech.junittestsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/schedule")
    public String schedule(@RequestParam("isHungry") boolean isHungry, @RequestParam("money") int money) {
        return scheduleService.createSchedule(isHungry, money);
    }
}
