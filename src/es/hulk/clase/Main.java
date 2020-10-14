package es.hulk;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = 10;
        b = 5;
        c = 3;

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
