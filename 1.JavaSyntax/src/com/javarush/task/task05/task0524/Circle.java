package com.javarush.task.task05.task0524;

/* 
Основа колеса
*/

public class Circle {
    public double x;
    public double y;
    public double r;

    public Circle(double x, double y, double r) {
        if(x >0)this.x = x;

        this.y = y;
        this.r = r;
    }

    //напишите тут ваш код
    public static void main(String[] args) {
        Circle c1 = new Circle(-1,1,1);
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.r);

    }
}
