package es.hulk.clase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);

    }
}
