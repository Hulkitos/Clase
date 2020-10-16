package es.hulk.clase;

public class Ex10 {

    public static void main(String[] args) {
        // Numero PI
        double pi;
        // Altura
        double h;
        // Diametre
        double d;
        //Volum
        double volum;

        pi = 3.14;
        h = 20;
        d = 40;

        // V = pi * r2 * h

        double radi = d / 2;
        double radielevat = radi*radi;
        volum = pi*radielevat*h;

        System.out.println("El volum de un cilindre amb altura " + h + " i amb diametre " + d + " es un total de " + volum);
    }
}
