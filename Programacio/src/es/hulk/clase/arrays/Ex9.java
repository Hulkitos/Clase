package es.hulk.clase.arrays;

import java.util.Arrays;

public class Ex9 {
    public static void Exercise() {
        int ARRAY_LENGHT = 5;
        int[] list = new int[ARRAY_LENGHT];

        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 5;

        Arrays.sort(list);
        System.out.println("Array ordenada de manera creixent " + Arrays.toString(list));
    }
}
