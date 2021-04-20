package es.hulk.programacio.exercises.repas;

import java.util.Random;
import java.util.Scanner;

public class Revisio1 {

    public static int max(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static boolean multiple(int num1, int num2) {
        int mult = num1 * num2;
        int div = mult % 0;
        return div != 0;
    }

    public static int countXifres(int num) {
        int xifres = 0;
        if (num <= 9) {
            return 1;
        } else if (num <= 99) {
            return 2;
        } else if (num <= 999) {
            return 3;
        } else if (num <= 9999) {
            return 4;
        } else if (num <= 10000) {
            return 5;
        }
        return xifres;
    }

    public static int menorInvertit(int num) {
        return num;
    }

    public static void daysBetween2Dates() {
        Scanner scanner = new Scanner(System.in);
        int dies = 30;
        int mesos = 12;
        int anys = 2090;

        int dia1 = scanner.nextInt();
        int mes1 = scanner.nextInt();
        int any1 = scanner.nextInt();

        int dia2 = scanner.nextInt();
        int mes2 = scanner.nextInt();
        int any2 = scanner.nextInt();

        int diesAny1 = any1 * 365;
        int diesAny2 = any2 * 365;

        int diesMesos1 = mes1 * 30;
        int diesMesos2 = mes2 * 30;

        int calcul1 = diesAny1 + diesMesos1 + dia1;
        int calcul2 = diesAny2 + diesMesos2 + dia2;

        int calculFinal = calcul1 - calcul2;

        System.out.println(calculFinal);
    }

    public static void dieferenciaHores() {
        Scanner scanner = new Scanner(System.in);
        int minutsSegons = 60;

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        if (hours <= 24 && minutes <= minutsSegons && seconds <= minutsSegons) {
            if (seconds > minutsSegons) {
                seconds = 0;
                minutes++;
            }
            if (minutes > minutsSegons) {
                minutes = 0;
                hours++;
            }
            seconds++;

            System.out.println(hours + ":" + minutes + ":" + seconds);
        } else {
            System.out.println("Introdueix una hora correcte");
        }
    }

    public static void quadratDeNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            numero = scanner.nextInt();
            int mult = numero * numero;
            System.out.println(mult);
        }
        while (numero != 0);

        System.out.println("Numero 0");
    }

    public static void sumQuadratNumeros() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int aux = 0;
        do {
            numero = scanner.nextInt();
            int mult = numero * numero;
            aux += mult;
            System.out.println(mult);
        }
        while (numero != 0);

        System.out.println("Suma: " + aux);
    }

    public static void multipleOfTwo() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int numero;

        do {
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                counter++;
            }
        } while (numero % 2 == 0);

        System.out.println("S'ha introduit un numero que no es multiple de 2");
        System.out.println("Numero de vegades que s'ha introduit un numero multiple de 2: " + counter);
    }

    public static void betweenZeroAndMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero = scanner.nextInt();
        int rand = random.nextInt(numero);

        do {
            numero = scanner.nextInt();
            if (numero < rand) {
                System.out.println("Numero menor");
            }
            if (numero > rand) {
                System.out.println("Numero major");
            }
        } while (rand != numero);

        System.out.println("S'ha introduit el numero correcte.");
    }

    public static void stopOnNegativeAverageCalculator() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int counter = 0;
        double aux = 0;
        do {
            numero = scanner.nextInt();
            aux += numero;
            counter++;
        } while (numero < 0);

        double average = aux / counter;
        System.out.println(average);
    }

    public static void askFourNumbers() {
        Scanner scanner = new Scanner(System.in);

        int max1 = scanner.nextInt();
        int multiple = scanner.nextInt();

        for (int i = 0; i <= max1; i++) {
            if (i % multiple == 0) {
                System.out.println(i + " es multiple");
            }
        }
    }

    public static void inverseAnterior() {
        Scanner scanner = new Scanner(System.in);

        int max1 = scanner.nextInt();
        int multiple = scanner.nextInt();

        for (int i = max1; i <= max1; i--) {
            if (i % multiple == 0) {
                System.out.println(i + " es multiple");
            }
            if (i < 0) {
                break;
            }
        }
    }

    public static void numerosSenars() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                result = result * i;
                System.out.println(result);
            }
        }
    }

    public static void calcularFactorial() {
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        System.out.println("Calcul factorial de " + factorial + " es " + result);
    }

    public static void calcularEnters() {
        Scanner scanner = new Scanner(System.in);

        int counter0 = 0;
        int counterNegative = 0;
        int counterPositive = 0;

        int sumaNeg = 0;
        int sumaPos = 0;

        int i = 0;
        while (i <= 20) {
            int n = scanner.nextInt();
            if (n < 0) {
                sumaNeg += n;
                counterNegative++;
            }
            if (n > 0) {
                sumaPos += n;
                counterPositive++;
            }
            if (n == 0) {
                counter0++;
            }
        }
        int resultPositive = sumaPos / counterPositive;
        int resultNegative = sumaNeg / counterNegative;
        System.out.println("Contador de 0: " + counter0);
        System.out.println("Mitjana Positius: " + resultPositive);
        System.out.println("Mitjana Negatius: " + resultNegative);
    }

    public static void calcularAlumnes() {
        Scanner scanner = new Scanner(System.in);

        int counterAltura = 0;
        int counterAnys = 0;

        float sumaAltura = 0;
        int sumaAnys = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Introdueix una altura: ");
            float altura = scanner.nextFloat();

            System.out.print("Introdueix l'edat: ");
            int anys = scanner.nextInt();

            if (anys < 18) {
                counterAnys++;
            }
            if (altura < 1.75) {
                counterAltura++;
            }

            sumaAltura += altura;
            sumaAnys += anys;
        }
        float resultAltura = sumaAltura / 20;
        int resultAnys = sumaAnys / 20;

        System.out.println("Mitjana Altura: " + resultAltura);
        System.out.println("Mitjana Anys: " + resultAnys);
        System.out.println("Majors d'edat: " + counterAnys);
        System.out.println("Majors de 1,75m: " + counterAltura);
    }

    public static void tabulaMultiplier() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int result = n * i;
            System.out.println("Multiplicar " + n + " x " + i + " = " + result);
        }
    }
}