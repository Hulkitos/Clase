package es.hulk.repas.exercisis;

public class Arrays {

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
        String str = String.valueOf(num);
        System.out.println(str);
    }

    public static void averageArrayCalculator(int[] num) {
        int aux = 0;
        int counter = 0;
        for (int i = 0; i < num.length; i++) {
            aux += num[i];
            counter++;
        }
        double average = aux / counter;
        System.out.println(average);
    }

}
