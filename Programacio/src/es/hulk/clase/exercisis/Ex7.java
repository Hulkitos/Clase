package es.hulk.clase.exercisis;

public class Ex7 {

    public static void ex7() {
        int a;
        int b;
        int aux;

        a = 5;
        b = 10;

        System.out.println("Valor inicial de b = " + b);
        System.out.println("Valor inicial de a = " + a);
        System.out.println("   ");

        //resultat = a = 10 i b = 5

        aux = a;
        a = b;
        b = aux;

        System.out.println("Valor intercanviat de b = " + b);
        System.out.println("Valor intercanviat de a = " + a);
    }

}
