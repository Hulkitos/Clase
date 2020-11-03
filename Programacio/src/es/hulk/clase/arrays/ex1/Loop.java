package es.hulk.clase.arrays.ex1;

public class Loop {
    public static void Exercise() {
        int mida = 5;
        int[] ages = new int[mida];

        ages[0] = 20;
        ages[1] = 18;
        ages[2] = 17;
        ages[3] = 24;
        ages[4] = 15;

        for (int i = 0; i < mida; i++) {
            System.out.println(ages[i]);
        }
    }
}