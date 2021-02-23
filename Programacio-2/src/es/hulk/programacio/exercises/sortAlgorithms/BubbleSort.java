package es.hulk.programacio.exercises.sortAlgorithms;

public class BubbleSort {

    public static void applySort(int[] INT_ARRAY) {
        int aux;

        for (int i = 0; i < INT_ARRAY.length; i++) {
            for (int j = 1; j < INT_ARRAY.length - i; j++) {
                int index = j - 1;
                if (INT_ARRAY[index] > INT_ARRAY[j]) {
                    aux = INT_ARRAY[index];
                    INT_ARRAY[index] = INT_ARRAY[j];
                    INT_ARRAY[j] = aux;
                }
            }
        }
    }
}
