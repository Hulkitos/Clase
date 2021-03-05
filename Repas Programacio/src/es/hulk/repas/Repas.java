package es.hulk.repas;

import es.hulk.repas.clases.Dog;
import es.hulk.repas.clases.Persona;
import es.hulk.repas.exercisis.Arrays;
import es.hulk.repas.exercisis.Bucles;
import es.hulk.repas.exercisis.Condicionals;

public class Repas {

    public static void main(String[] args) {
        Arrays.printArray("BUCLE", new int[]{1, 2, 3, 4, 5, 6, 7});
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
