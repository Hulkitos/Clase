package es.hulk.repas.exercisis;

public class Variables {

    private static final int a = 3;
    private static final int b = 10;

    public static void showText(String message) {
        System.out.print(message);
        System.out.println(message);
        System.out.println(message);
    }

    public static void xShowText() {
        String x = "Miquel Angel";
        System.out.println("Hola el meu nom es " + x);
    }

    public static void ArithmeticOperations() {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
    }

    public static void ArithmeticOperations2() {
        int aux = a * (b + 2) * 10;
        System.out.println(aux);
    }

    public static void c2f(int c) {
        double F = (c * 1.8) + 32;
        String str = c + " graucs Celsius son " + F + " graus farenheit";

        System.out.println(str);
    }

    public static void dolar2euro(double euro) {
        double dolar = 1.18;
        double result = euro / dolar;

        System.out.println(result);
    }

    public static void chgangeValue() {
        int a = 5;
        int b = 10;
        int aux;

        System.out.println(a);
        System.out.println(b);
        System.out.println(" ");

        aux = a;
        a = b;
        b = aux;

        System.out.println(a);
        System.out.println(b);
    }

    public static void ArithmeticOperations3() {
        double c = 8;
        double result = (a + b) * 5 / (2 * c);

        System.out.println(result);
    }

    public static void ArithmeticOperations4(double a, double b) {
        double p = (a * a) + (b * b);
        System.out.println(p);

        double area = a * b;
        System.out.println(area);
    }

    public static void ArithmeticOperations5() {
        double pi = 3.14;
        double h = 4;
        double d = 6;
        double r = d / 2;

        double result = pi * (r * r) * h;
        System.out.println(result);
    }

}
