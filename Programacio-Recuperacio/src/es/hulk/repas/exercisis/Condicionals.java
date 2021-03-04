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

        }
    }
}
