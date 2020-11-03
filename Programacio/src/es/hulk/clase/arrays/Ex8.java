package es.hulk.clase.arrays;

import java.util.ArrayList;

public class Ex8 {
    public static void Exercise() {
        int ARRAY_LENGHT = 5;
        int[] list0 = new int[ARRAY_LENGHT];
        int[] list1 = new int[ARRAY_LENGHT];
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        list0[0] = 1;
        list0[1] = 2;
        list0[2] = 3;
        list0[3] = 4;
        list0[4] = 5;

        list1[0] = 6;
        list1[1] = 7;
        list1[2] = 8;
        list1[3] = 9;
        list1[4] = 10;

        arraylist.add(list0[0]);
        arraylist.add(list0[1]);
        arraylist.add(list0[2]);
        arraylist.add(list0[3]);
        arraylist.add(list0[4]);

        arraylist.add(list1[0]);
        arraylist.add(list1[1]);
        arraylist.add(list1[2]);
        arraylist.add(list1[3]);
        arraylist.add(list1[4]);

        System.out.println(arraylist);

    }
}
