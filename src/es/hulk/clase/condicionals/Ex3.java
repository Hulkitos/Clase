package es.hulk.clase.condicionals;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Es major es " + a);
        } else if (a < b) {
            System.out.println("Es menor es " + a);
        } else {
            System.out.println("Iguals");
        }
    }
}
