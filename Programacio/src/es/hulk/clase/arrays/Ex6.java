package es.hulk.clase.arrays;

public class Ex6 {
    public static void Exercise() {
        int ARRAY_LENGHT = 5;
        int[] num = new int[ARRAY_LENGHT];
        num[0] = 20;
        num[1] = 18;
        num[2] = 17;
        num[3] = 24;
        num[4] = 15;

        for (int i = 0; i < ARRAY_LENGHT; i++) {
            System.out.print(num[i]);
        }
    }
}
