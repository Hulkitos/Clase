package es.hulk.clase.exercisis;

public class Ex9 {

    public static void ex9() {
        double altura;
        double amplada;

        amplada = 2.50;
        altura = 4;

        double area = altura*amplada;

        System.out.println("Area de rectangle: " + area);

        // 2*(amplada+altura)
        double suma = amplada+altura;
        double mult = 2*suma;

        System.out.println("Perimetro de rectangle: " + mult);
    }

}
