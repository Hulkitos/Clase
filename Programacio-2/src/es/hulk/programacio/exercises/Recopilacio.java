package es.hulk.programacio.exercises;


public class Recopilacio {

    public static void Ex1(int[] list) {

        int major;
        int menor;
        int result;

        major = list[0];
        menor = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] > major) {
                major = list[i];
            }
            if (list[i] < menor) {
                menor = list[i];
            }
        }
        result = major - menor;

        System.out.println(result);
    }

    public static void Ex2(int[] list) {
        int counter = 0;
        int counter2 = 1;
        int aux = 2;

        boolean valor = false;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != list[i] * list[i++]) {
                valor = false;
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
    }

    public static void Ex3() {

    }

}
