package es.hulk.programacio.exercises;

public class Strings {

    public static int[] ex1() {
        int[] vocals = {0, 0, 0, 0, 0};
        String frase = "Hi havia una vegada una persona que no sabia com se feia una array";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                vocals[0]++;
            }
            if (frase.charAt(i) == 'e') {
                vocals[0]++;
            }
            if (frase.charAt(i) == 'i') {
                vocals[0]++;
            }
            if (frase.charAt(i) == 'o') {
                vocals[0]++;
            }
            if (frase.charAt(i) == 'u') {
                vocals[0]++;
            }
        }
        return vocals;
    }

    public static boolean ex2() {
        String palindrom = "AmorRoma";
        boolean parPalindroma = true;
        for (int i = 0; i < palindrom.length() / 2; i++) {
            if (palindrom.charAt(i) != palindrom.length() - 1 - i) {
                parPalindroma = false;
                break;
            }
        }
        return parPalindroma;
    }

    public static int ex3(String frase) {
        char[] vocals = {'a', 'e', 'i', 'o', 'u'};
        char primeraVocal = 0;
        boolean apPrimeraVocal = false;
        int counter = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (!apPrimeraVocal) {
                for (int k = 0; k < vocals.length; k++) {
                    if (frase.charAt(i) == vocals[k]) {
                        primeraVocal = frase.charAt(i);
                        apPrimeraVocal = true;
                    }
                }
            }
            if (primeraVocal == frase.charAt(i)) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }

    public static String Ex4(String paraula) {
        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.length() % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es senar");
            }
        }
        return paraula;
    }

    public static void Ex5(String paraula) {
        int counterPar = 0;
        int counterSenar = 0;

        String paraulaAct = "";

        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) != ' ') {
                paraulaAct += paraula.charAt(i);
            } else {
                if (paraulaAct.length() % 2 == 0) {
                    counterPar++;
                } else {
                    counterSenar++;
                }
                paraulaAct = "";
            }
        }

        System.out.println("Paraules amb un número parell de caràcters: " + counterPar +
                "\nParaules amb un número senar de caràcters: " + counterSenar);


    }

    public static void numParaulesParellImparell(String cadena) {
        int numParaulesParell = 0;
        int numParaulesImparell = 0;

        String paraulaActual = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                paraulaActual += cadena.charAt(i);
            } else {
                if (paraulaActual.length() % 2 == 0) {
                    numParaulesParell++;
                } else {
                    numParaulesImparell++;
                }
                paraulaActual = "";
            }
        }
        System.out.println("Paraules amb un número parell de caràcters: " + numParaulesParell +
                "\nParaules amb un número senar de caràcters: " + numParaulesImparell);
    }

    public static String Ex6(String paraula) {
        String aux = "";
        for (int i = paraula.length() - 1; i >= 0; i--) {
            aux += paraula.charAt(i);
        }
        return aux;
    }

}