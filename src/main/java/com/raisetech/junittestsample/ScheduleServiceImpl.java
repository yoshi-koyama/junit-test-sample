package com.raisetech.junittestsample;

import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Override
    public String createSchedule(boolean isHungry, int money) {
        if (isHungry && money >= 1000) {
            return "外食にする";
        }
        // TODO: フローチャートに「寝る」の分岐を後で入れる。
        return "就寝する";
    }
}
