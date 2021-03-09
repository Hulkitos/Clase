package es.hulk.repas.exercisis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void printArray(String type, int[] num) {
        switch (type) {
            case "NO_BUCLE":
                System.out.println(num[0]);
                System.out.println(num[1]);
                System.out.println(num[2]);
                System.out.println(num[3]);
                System.out.println(num[4]);
                break;
            case "BUCLE":
                for (int i = 0; i < num.length; i++) {
                    System.out.println(num[i]);
                }
                break;
        }
    }

    public static void arrayString(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void inverseArray(int[] num) {
        int min = num.length - 1;
        for (int i = min; i < num.length; i--) {
            if (i != -1) {
                System.out.println(num[i]);
            } else {
                break;
            }
        }
    }

    public static void sumaArray(int[] num) {
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        System.out.println(suma);
    }

    public static void charArray(char[] chars) {
        String str = String.valueOf(chars);
        System.out.println(str);
    }

    public static void intArray(int[] num) {
        String str = Arrays.toString(num);
        System.out.println(str);
    }

    public static void averageArrayCalculator(int[] num) {
        double aux = 0;
        double counter = 0;
        for (int i = 0; i < num.length; i++) {
            aux += num[i];
            counter++;
        }
        double average = aux / counter;
        System.out.println(average);
    }

    public static void twoArray(int[] ArrayA, int[] ArrayB) {
        int[] ArrayC = new int[8];
        for (int i = 0; i < ArrayA.length; i++) {
            ArrayC[i * 2] = ArrayA[i];
            ArrayC[i * 2 + 1] = ArrayB[i];
        }

        for (int i = 0; i < ArrayC.length; i++) {
            System.out.println(ArrayC[i]);
        }
    }

    public static void sortArray(int[] num) {
        int min = num.length - 1;

        boolean descending = true;
        boolean ascending = true;

        for (int i = 0; i < min; i++) {
            if (num[i] > num[i + 1]) {
                ascending = false;
            } else if (num[i] < num[i + 1]) {
                descending = false;
            }
        }

        if (descending) {
            System.out.println("Array Ordenada: Major a Menor");
        } else if (ascending) {
            System.out.println("Array Ordenada: Menor a Major");
        } else {
            System.out.println("Array no Ordenada");
        }
    }

    public static void positiveArrayList() {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numeros: ");
        int j = scanner.nextInt();
        num.add(j);

        while (j != 0) {
            if (j > 0) {
                System.out.print("Numeros: ");
                j = scanner.nextInt();
                num.add(j);
            } else {
                System.out.print("Numeros: ");
                j = scanner.nextInt();
            }
        }

        num.remove(num.size() - 1);

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) < 0) {
                num.remove(i);
            }
            System.out.println(num.get(i));
        }
    }


    public static void arrayListExercise() {
        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Numeros: ");
        int num = scanner.nextInt();

        while (num != 0) {
            if (num > 0) {
                System.out.print("Numeros: ");
                num = scanner.nextInt();
                positive.add(num);
            } else if (num < 0) {
                System.out.print("Numeros: ");
                num = scanner.nextInt();
                negative.add(num);
            }
        }

        for (int i = 0; i < positive.size(); i++) {
            System.out.println("Numeros Positius");
            System.out.println(positive.get(i));
        }

        for (int i = 0; i < negative.size(); i++) {
            System.out.println("Numeros Negatius");
            System.out.println(negative.get(i));
        }
    }

    public static void searchCharInArrayPart1(char[] chars) {
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'x' || chars[i] == 'X') {
                counter++;
            }
        }
    }

    public static void searchCharInArrayPart2() {
        int N = 10;
        char[] chars = new char[N];
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < chars.length; i++) {
            chars[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'x' || chars[i] == 'X') {
                counter++;
            }
        }
    }

    public static void searchArrayAfterYChar() {
        Scanner scanner = new Scanner(System.in);

        int N = 10;
        char[] chars = new char[N];
        int counter = 0;
        boolean found = false;

        for (int i = 0; i < chars.length; i++) {
            chars[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < N; i++) {
            if (chars[i] == 'y') {
                found = true;
            } else if (chars[i] == 'x') {
                counter++;
            }
        }

        System.out.println("Aparicions de X: " + counter);
    }

    public static void sayNumberInArray() {
        Scanner scanner = new Scanner(System.in);
        int[] num = {7, 8, 9, 5, 2};

        for (int i = 0; i < num.length; i++) {
            int j = scanner.nextInt();
            if (j == num[i]) {
                System.out.println(j);
            } else {
                System.out.println("no esta dins la array");
            }
        }
    }

}
