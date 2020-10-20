package es.hulk.clase;

import es.hulk.clase.objects.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("German", 10, "56431732a", "Masculi", 657654798);
        Person person2 = new Person("Alejandro", 12, "785798a", "Dona", 288576);
        
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getDNI());
        System.out.println(person.getGenre());
        System.out.println(person.getTelephone());
    }
}
