package com.company;

import java.util.Scanner;

public class avto {

    public static void zavesty_avto() {
        System.out.println("введіть 1 щоб завести авто");
        Scanner scan = new Scanner(System.in);
        int starter = scan.nextInt();
        if (starter == 1) {
            System.out.println("автомобіль завівся");
        }
    }

    public static void nabraty_shvydkist() {
        int speed = 0;
        int yourspeed;
        System.out.println("введіть бажану швидкість ");
        Scanner scan = new Scanner(System.in);
        yourspeed = scan.nextInt();
        System.out.println("бажана швидкість" + yourspeed);
        if (yourspeed <= 330) {
            do {
                speed += 10;
                System.out.println("автомобіль рухається зі швидкістю    " + speed);
            }

            while (speed < yourspeed);
            if (speed > yourspeed)
                do {
                    speed--;
                    System.out.println("автомобіль рухається зі швидкістю    " + speed);
                }
                while (speed != yourspeed);
        } else
            System.out.println("це авто може розігнатися тільки до 330 км/год ");
    }

    public static void stop() {
        System.out.println("введіть 0 щоб зупинити авто");
        Scanner scan1 = new Scanner(System.in);
        int starter = scan1.nextInt();
        if (starter == 0) {
            System.out.println("автомобіль зупинився та заглушив мотор");
        }

    }

}

