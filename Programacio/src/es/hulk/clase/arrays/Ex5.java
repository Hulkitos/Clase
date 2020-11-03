package es.hulk.clase.arrays;

public class Ex5 {
    public static void Exercise() {
        int ARRAY_LENGHT = 5;
        char[] list = new char[ARRAY_LENGHT];

        list[0] = 'h';
        list[1] = 'o';
        list[2] = 'l';
        list[3] = 'a';
        list[4] = 'a';

        for (int i = 0; i < ARRAY_LENGHT; i++) {
            System.out.print(list[i]);
        }
    }
}
