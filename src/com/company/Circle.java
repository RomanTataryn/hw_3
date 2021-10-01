package com.company;

import java.util.Scanner;

public class Circle {

    public static void Area() {
        System.out.println("Введіть радіус кола");
        Scanner scan = new Scanner(System.in);

        double radius = scan.nextDouble();

        if (radius < 0) {
            System.out.println("радіус не може бути від'ємним. введіть число з додатнім значенням ");
            System.out.println("Введіть радіус кола");

        } else {
            double Area = Math.PI * radius * radius;
            System.out.println("Площа круга дорівнює " + Area);

        }

    }
}