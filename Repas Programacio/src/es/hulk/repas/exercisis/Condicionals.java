package es.hulk.repas.exercisis;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Condicionals {

    private static final Scanner scan = new Scanner(System.in);

    public static void positiveOrNegative(int num) {
        if (num < 0) {
            System.out.println("Numero Negatiu");
        } else {
            System.out.println("Numero Positiu");
        }
    }

    public static void multiple() {
        int num = scan.nextInt();
        int div = num / 2;
        int result = div % 0;

        if (num == result) {
            System.out.println("SI Multiple");
        } else {
            System.out.println("NO Multiple");
        }
    }

    public static void weekDaysIF(int day) {
        if (day == 1) {
            System.out.println("Dilluns");
        }
        if (day == 2) {
            System.out.println("Dimarts");
        }
        if (day == 3) {
            System.out.println("Dimecres");
        }
        if (day == 4) {
            System.out.println("Dijous");
        }
        if (day == 5) {
            System.out.println("Divendres");
        }
        if (day == 6) {
            System.out.println("Dissabte");
        }
        if (day == 7) {
            System.out.println("Diumenge");
        }
    }

    public static void weekDaysSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Dilluns");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres");
                break;
            case 4:
                System.out.println("Dijous");
                break;
            case 5:
                System.out.println("Divendres");
                break;
            case 6:
                System.out.println("Dissabte");
                break;
            case 7:
                System.out.println("Diumenge");
                break;
        }
    }

    public static void timeZone() {
        Date date = new Date();
        int hour = date.getHours();

        if (hour >= 8 && hour <= 12) {
            System.out.println("Demati");
        }
        if (hour >= 12 && hour <= 17) {
            System.out.println("Migdia");
        }
        if (hour >= 17 && hour <= 20) {
            System.out.println("Horabaixa");
        }
        if (hour >= 20 && hour <= 23) {
            System.out.println("Vespre");
        }
    }

    public static void getNote(int nota) {
        if (nota >= 0 && nota <= 4) {
            System.out.println("Suspes");
        }
        if (nota == 5) {
            System.out.println("Suficient");
        }
        if (nota == 6) {
            System.out.println("Esta be, pero es millorable");
        }
        if (nota >= 7 && nota <= 8) {
            System.out.println("Notable");
        }
        if (nota >= 9 && nota <= 10) {
            System.out.println("Excel·lent");
        }
    }

    public static void getTimeZone(int dia, int mes, int any) {
        if (dia <= 30 || mes <= 12 || any <= 2060) {
            System.out.println(dia + " " + mes + " " + any);
        } else {
            System.out.println("Esta malament");
        }
    }

    public static void getSecondTimeZone(int dia, int mes, int any) {
        switch(mes) {
            case 1:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 1;
                break;
            case 2:
                dia = 28;
                if (dia <= 28) {
                    System.out.println("Data correcte");
                }
                mes = 2;
            case 3:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 3;
                break;
            case 4:
                if (dia <= 30) {
                    System.out.println("Data correcte");
                }
                mes = 4;
                break;
            case 5:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 5;
                break;
            case 6:
                if (dia <= 30) {
                    System.out.println("Data correcte");
                }
                mes = 6;
                break;
            case 7:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 7;
            case 8:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 8;
                break;
            case 9:
                if (dia <= 30) {
                    System.out.println("Data correcte");
                }
                mes = 9;
                break;
            case 10:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 10;
                break;
            case 11:
                if (dia <= 30) {
                    System.out.println("Data correcte");
                }
                mes = 11;
            case 12:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
                mes = 12;
                break;
            default:
                System.out.println("Incorrecte");
                break;
        }
    }

    public static void sortNum(int a, int b, int c) {
        if (a < b) {

        }
    }

    public static void moreAge(int age) {
        if (age < 18) {
            System.out.println("Menor d'edat");
        } else {
            System.out.println("Major d'edat");
        }
    }

    public static void moneyCount(int money) {
        // billets 50€, 20€, 10€ i 5€
        // monedes 2€ i 1€
        int aux;
        int cincuanta = 0;
        int vint = 0;
        int deu = 0;
        int cinc = 0;
        int dos = 0;
        int un = 0;

        if (money >= 50) {
            cincuanta = money / 50;
            money = money - cincuanta * 50;
        }
        if (money >= 20) {
            vint = money / 20;
            money = money - vint * 20;
        }
        if (money >= 10) {
            deu = money / 10;
            money = money - deu * 10;
        }
        if (money >= 5) {
            cinc = money / 5;
            money = money - cinc * 5;
        }
        if (money >= 2) {
            dos = money / 2;
            money = money - dos * 2;
        }
        if (money >= 1) {
            un = money / 1;
            money = money - un * 1;
        }

        System.out.println(cincuanta);
        System.out.println(vint);
        System.out.println(deu);
        System.out.println(cinc);
        System.out.println(dos);
        System.out.println(un);
    }

}
