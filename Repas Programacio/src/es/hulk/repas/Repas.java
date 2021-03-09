package es.hulk.repas;

import es.hulk.repas.clases.Dog;
import es.hulk.repas.clases.Persona;
import es.hulk.repas.exercisis.Array;

public class Repas {

    private static int[] num = {2, 3, 4, 5};
    private static int[] ArrayA = {1, 3, 5, 7};
    private static int[] ArrayB = {2, 4, 6, 8};
    private static char[] chars = {'h', 'o', 'l', 'a'};

    public static void main(String[] args) {
        Array.positiveArrayList();
    }

    public static void printPersons() {
        Persona persona = new Persona();
        Persona persona1 = new Persona("John Gilbert", 40, "6876897869a", "Femeni", 8797676);

        persona.setNom("Elena Gilbert");
        persona.setDNI("5987798a");
        persona.setEdat(17);
        persona.setSexe("Femeni");
        persona.setTelefono(75768987);

        persona.display();
        System.out.println(" ");
        persona1.display();
    }

    public static void printDogs() {
        Dog ca = new Dog("Perrito Caliente", 5, "Nutella", 5, true);
        Dog segonca = new Dog("Perrito", 5, "Nesquik", 7, true);
        Dog perriton = new Dog("Caliente", 5, "Donettes", 4, true);
        segonca.novaVacuna(786);
        segonca.display();
    }
}
