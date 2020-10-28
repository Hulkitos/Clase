package es.hulk.clase.condicionals;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = scanner.nextInt();

        System.out.print("Mes: ");
        int mes = scanner.nextInt();

        System.out.print("Any: ");
        int any = scanner.nextInt();

        switch (mes) {
            case 1:
                if (dia <= 31) {
                    System.out.println("Data correcte");
                }
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
}
