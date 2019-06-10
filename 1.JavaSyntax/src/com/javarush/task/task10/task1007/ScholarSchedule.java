package com.javarush.task.task10.task1007;

import java.util.Objects;

public class ScholarSchedule {
    private DayOfWeek dayOfWeek;
    //...другие поля


    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScholarSchedule that = (ScholarSchedule) o;
        return dayOfWeek == that.dayOfWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayOfWeek);
    }
}
