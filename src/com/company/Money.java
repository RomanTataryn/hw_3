package com.company;

import java.util.Scanner;

public class Money {
    public static void kalk() {
        long hrn1, hrn2;
        byte kop1, kop2;
        double suma1, suma2, chyslo, rezult = 0.0;
        String diya;
        System.out.println("введіть кількість гривень: ");
        Scanner scan = new Scanner(System.in);
        hrn1 = scan.nextLong();
        System.out.println("введіть кількість копійок: ");
        kop1 = scan.nextByte();
        suma1 = hrn1 + (double) kop1 / 100;
        System.out.println("ваша сума: " + suma1);
        System.out.println("Введіть дію: (+-/*) або " + "?" + " для порівняння чисел");
        Scanner scan1 = new Scanner(System.in);
        diya = scan1.nextLine();
        switch (diya) {
            case "+": {
                System.out.println("введіть кількість гривень: ");
                hrn2 = scan.nextLong();
                System.out.println("введіть кількість копійок: ");
                kop2 = scan.nextByte();
                suma2 = hrn2 + (double) kop2 / 100;
                System.out.println("сума, яка додається: " + suma2);
                rezult = suma1 + suma2;
                System.out.println(rezult);
                Long hrn_rez = (long) rezult;
                byte kop_rez = (byte) (Math.round((rezult - hrn_rez) * 100));
                if (kop_rez < 10) {
                    System.out.println("результат додавання : " + hrn_rez + "," + "0" + (kop_rez));
                } else
                    System.out.println("результат додавання: " + hrn_rez + "," + kop_rez);
                break;
            }
            case "-": {
                System.out.println("введіть кількість гривень: ");
                hrn2 = scan.nextLong();
                System.out.println("введіть кількість копійок: ");
                kop2 = scan.nextByte();
                suma2 = hrn2 + (double) kop2 / 100;
                System.out.println("сума, яка віднімається: " + suma2);
                rezult = suma1 - suma2;
                Long hrn_rez = (long) rezult;
                byte kop_rez = (byte) Math.round((rezult - hrn_rez) * 100);
                if (kop_rez < 10) {
                    System.out.println("результат віднімання: " + hrn_rez + "," + "0" + +Math.abs(kop_rez));
                } else
                    System.out.println("результат віднімання: " + hrn_rez + "," + Math.abs(kop_rez));
                break;

            }
            case "/": {
                System.out.println("введіть число, на яке треба поділити: ");
                chyslo = scan.nextDouble();
                if (chyslo != 0) {
                    rezult = suma1 / chyslo;
                    Long hrn_rez = (long) rezult;
                    byte kop_rez = (byte) Math.round((rezult - hrn_rez) * 100);

                    //   System.out.println("результат ділення: " + hrn_rez + "," + kop_rez);
                    if (kop_rez < 10) {
                        System.out.println("результат ділення : " + hrn_rez + "," + "0" + (kop_rez));
                    } else
                        System.out.println("результат ділення: " + hrn_rez + "," + kop_rez);
                } else
                    System.out.println("На нуль ділити не можна!!!");
                break;
            }
            case "*": {
                System.out.println("введіть число, на яке треба помножити: ");
                chyslo = scan.nextDouble();
                rezult = suma1 * chyslo;
                Long hrn_rez = (long) rezult;
                byte kop_rez = (byte) Math.round((rezult - hrn_rez) * 100);
                if (kop_rez < 10) {
                    System.out.println("результат множення : " + hrn_rez + "," + "0" + (kop_rez));
                } else
                    System.out.println("результат множення: " + hrn_rez + "," + kop_rez);
                break;
                // System.out.println("результат множення: " + hrn_rez + "," + kop_rez);
                //break;
            }
            case "?": {
                System.out.println("введіть кількість гривень: ");
                hrn2 = scan.nextLong();
                System.out.println("введіть кількість копійок: ");
                kop2 = scan.nextByte();
                suma2 = hrn2 + (double) kop2 / 100;
                if (suma1 > suma2) {
                    System.out.println("сума " + suma1 + "більша " + "від суми " + suma2);
                } else if (suma1 < suma2) {
                    System.out.println("сума " + suma1 + "менша " + "від суми " + suma2);
                    ;
                } else {
                    System.out.println("сума  " + suma1 + "дорівнює " + "сумі " + suma2);
                    ;

                }
                break;
            }

            default:
                System.out.println("невідома дія");
                break;
        }

    }


}

