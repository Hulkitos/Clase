package es.hulk.clase.exercisis.scanner;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura;
        double amplada;

        amplada = sc.nextDouble();
        altura = sc.nextDouble();

        double area = altura*amplada;

        System.out.println("Area de rectangle: " + area);

        // 2*(amplada+altura)
        double suma = amplada+altura;
        double mult = 2*suma;

        System.out.println("Perimetro de rectangle: " + mult);
    }
}
