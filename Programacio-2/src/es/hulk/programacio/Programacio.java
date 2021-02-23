package es.hulk.programacio;

import es.hulk.programacio.exercises.sortAlgorithms.BubbleSort;
import es.hulk.programacio.exercises.sortAlgorithms.SelectionSort;

public class Programacio {

    public static void main(String[] args) {
        int[] elements = {4, 5, 6, 9, 1};

        System.out.println("Array before sort");
        for(int i=0; i < elements.length; i++){
            System.out.print(elements[i] + " ");
        }

        System.out.println(" ");
        SelectionSort.applySort(elements);

        System.out.println("Array after sort");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}
