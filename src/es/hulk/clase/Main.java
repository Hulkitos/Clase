package es.hulk.clase;

import es.hulk.clase.objects.Dog;
import es.hulk.clase.objects.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("German", 10, "56431732a", "Masculi", 657654798);
        Dog dog = new Dog("ca", 10, "ca sord", 10, "si");

        dog.display();
        dog.novaVacuna(true);
    }
}
