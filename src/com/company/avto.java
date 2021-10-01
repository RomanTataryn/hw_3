package com.company;

import java.util.Scanner;

public class avto {


    public static void zavesty_avto() {

        int starter;
        boolean avtozavedene = false;
        if (avtozavedene) {
            System.out.println("ваше авто вже заведене");
        } else {
            do {
                System.out.println("введіть 1 щоб завести авто");
                Scanner scan = new Scanner(System.in);
                starter = scan.nextInt();
                if (starter != 1) {
                    System.out.println("неправильне введення");
                }
            }
            while (starter != 1);

            if (starter == 1) {
                System.out.println("автомобіль завівся");
                // } else {
                //   ("неправильне введення. Введіть 1, якщо хочете завести авто");
            }

        }
    }

    public static void nabraty_shvydkist() {
        int speed = 0;
        int maxspeed = 330;
        int yourspeed;
        do {
            System.out.println("введіть бажану швидкість ");
            Scanner scan = new Scanner(System.in);
            yourspeed = scan.nextInt();
            System.out.println("введена швидкість" + yourspeed);

            System.out.println("ви ввели негативну швидкість, або таку, яка перевищує максимально допустиму");
        }
        while (yourspeed < 0 || yourspeed > maxspeed);
        if (yourspeed > 0 && yourspeed < maxspeed) {
            do {
                speed += 10;
                System.out.println("автомобіль рухається зі швидкістю    " + speed);
            }

            while (speed < yourspeed);
            if (speed > yourspeed)
                do {
                    speed--;
                }
                while (speed != yourspeed);
            System.out.println("автомобіль рухається із заданою вами швидкістю " + speed);
        }

    }

    public static void stop() {
        int starter;
        do {
            System.out.println("введіть 0 щоб зупинити авто");
            Scanner scan = new Scanner(System.in);
            starter = scan.nextInt();
            if (starter != 0) {
                System.out.println("неправильне введення.");
            }
        }
        while (starter != 0);

        System.out.println("автомобіль зупинився та заглушив мотор");
    }

}



