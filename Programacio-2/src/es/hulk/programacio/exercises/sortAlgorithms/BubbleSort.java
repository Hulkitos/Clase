package es.hulk.programacio.exercises.sortAlgorithms;

public class BubbleSort {

    public static void bubbleSort(int[] elements) {
        int aux;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 1; j < elements.length - i; j++) {
                int index = j - 1;
                if (elements[index] > elements[j]) {
                    aux = elements[index];
                    elements[index] = elements[j];
                    elements[j] = aux;
                }
            }
        }
    }
}
