package com.javarush.task.task10.task1007;

public class Scholar {
    private ScholarSchedule schedule;
    private boolean goToSchool;

    public void wakeUp() {

        if (this.schedule.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Ура, можно поспать еще!");
        } else {
            System.out.println("Блин, опять в школу:(");
        }
    }
}
