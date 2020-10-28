package es.hulk.clase.exercisis.scanner;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double euros = sc.nextDouble();
        double dolar = 1.18;
        double resultat = euros*dolar;

        System.out.println(euros + " euros son en total " + resultat + " dolars");
    }
}
