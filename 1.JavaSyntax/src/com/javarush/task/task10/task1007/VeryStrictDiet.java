package com.javarush.task.task10.task1007;

public class VeryStrictDiet {
    public void takeLunch(DayOfWeek dayOfWeek) {

        switch (dayOfWeek) {

            case SUNDAY:
                System.out.println("Воскресный обед! Сегодня можно даже немного сладкого");
            case MONDAY:
                System.out.println("Обед для понедельника: куриная лапша!");
            case TUESDAY:
                System.out.println("Вторник, сегодня суп из сельдерея :(");
                //...и так далее до конца
        }
    }
}
