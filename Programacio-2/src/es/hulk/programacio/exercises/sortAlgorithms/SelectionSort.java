package es.hulk.programacio.exercises.sortAlgorithms;

public class SelectionSort {

    public static void applySort(int[] array) {
        int min;
        int minIndex = 0;
        int aux;

        for (int i = 0; i < array.length; i++) {
            min = array[i];
            minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (min < array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            aux = array[i];
            array[i] = min;
            array[minIndex] = aux;
            System.out.println(array[i]);
        }
    }
}
