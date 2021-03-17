package es.hulk.programacio;

import es.hulk.programacio.clases.Dog;

public class Programacio {

    public static void main(String[] args) {
        /*int[] elements = {4, 5, 6, 9, 1};

        System.out.println("Array before sort");
        for(int i=0; i < elements.length; i++){
            System.out.print(elements[i] + " ");
        }

        System.out.println(" ");
        SelectionSort.applySort(elements);

        System.out.println("Array after sort");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        } */

        Dog ca = new Dog("Calvo", 10, "hotdog", 1, "si");
        ca.display();
    }
}
