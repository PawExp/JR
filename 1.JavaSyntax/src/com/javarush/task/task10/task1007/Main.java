package com.javarush.task.task10.task1007;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scholar scholar = new Scholar();
        ScholarSchedule schedule = new ScholarSchedule();
        schedule.setDayOfWeek(DayOfWeek.FRIDAY);
        VeryStrictDiet veryStrictDiet = new VeryStrictDiet();
        veryStrictDiet.takeLunch(DayOfWeek.SUNDAY);

        scholar.wakeUp();

    }

}
