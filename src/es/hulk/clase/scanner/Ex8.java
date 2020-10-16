package es.hulk.clase.scanner;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double belevat = b*b;
        double mult = 4*a*c;
        double resul = belevat-mult;
        double mult2 = 2*a;
        double div = resul/mult2;


        System.out.println(belevat);
        System.out.println(mult);
        System.out.println(resul);
        System.out.println(mult2);
        System.out.println("El Resultat es: " + div);
    }
}
