package es.hulk.repas.exercisis;

import java.util.Arrays;

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
            if (num[i] > num[i+1]) {
                ascending = false;
            } else if(num[i] < num[i+1]){
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

}
