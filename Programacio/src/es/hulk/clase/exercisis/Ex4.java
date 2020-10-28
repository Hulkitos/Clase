package es.hulk.clase.exercisis;

public class Ex4 {

    public static void main(String[] args) {
        int a = 3;
        int b = 6;

        System.out.println("("+ a +"*(" + b +" + 2)*10");
        int suma = b+2;
        System.out.println("(" + a + "*(" + suma + ")*10");
        System.out.println("a * " + suma + " * 10");
        int mult = a*suma*10;
        System.out.println("El resultat es: " + mult);
    }

}
