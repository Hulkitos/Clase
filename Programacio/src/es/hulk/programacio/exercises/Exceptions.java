package es.hulk.programacio.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static Scanner scan = new Scanner(System.in);

    public static void Ex1(int num) {

        try {
            int result = num / 0;
        } catch (ArithmeticException exception) {
            System.err.println("Error: " + exception);
        }
    }

    public static void Ex2() {

        try {
            int num = scan.nextInt();
        } catch (InputMismatchException exception) {
            System.err.println("Error: " + exception);
        }
    }

    public static void Ex3(String num) {
        try {
            int num2 = Integer.parseInt(num);
            System.out.println(Integer.getInteger(num));
        } catch (NumberFormatException exception) {
            System.err.println("Error: " + exception);
        }
    }

    public static void Ex4() {
        try {
            String num = scan.nextLine();
            String num2 = scan.nextLine();

            int convert = Integer.parseInt(num);
            int convert2 = Integer.parseInt(num2);

            int div = convert/convert2;
        } catch (NumberFormatException | ArithmeticException exception) {
            System.err.println("Error: " + exception);
        }
    }

    public static void Ex1B() {

        try {
            int num = scan.nextInt();
            int result = num / 0;
        } catch (ArithmeticException | InputMismatchException exception) {
            System.err.println("Error: " + exception);
        }
    }

    public static void Ex2B() {

        try {
            int num = scan.nextInt();
        } catch (InputMismatchException exception) {
            System.err.println("Error: " + exception);
        }

    }

    public static void Ex3B() {
        try {
            String num = scan.nextLine();
            int num2 = Integer.parseInt(num);
            System.out.println(num2);
        } catch (NumberFormatException exception) {
            System.err.println("Error: " + exception);
        }
    }

    public static void Ex5() {
        int[] numeros = {2, 3, 6, 0};

        try {
            int num = scan.nextInt();
            numeros[num] = 1;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("Error: " + exception);
        }

    }

}
