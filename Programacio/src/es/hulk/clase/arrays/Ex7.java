package es.hulk.clase.arrays;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Ex7 {
    public static void Exercise() {
        double suma;
        double mitjana;
        int ARRAY_LENGHT = 5;
        int[] num = new int[ARRAY_LENGHT];
        num[0] = 5;
        num[1] = 6;
        num[2] = 5;
        num[3] = 8;
        num[4] = 5;

        suma = num[0] + num[1] + num[2] + num[3] + num[4];
        mitjana = suma / ARRAY_LENGHT;

        System.out.println(mitjana);
    }
}
