package es.hulk.repas.exercisis;

public class Arrays {

    public static void printArray(String type, int[] num) {
        switch (type) {
            case "NO_BUCLE":
                System.out.println(num[0]);
                System.out.println(num[1]);
                System.out.println(num[2]);
                System.out.println(num[3]);
                System.out.println(num[4]);
                break;
            case "BUCLE":
                for (int i = 0; i < num.length; i++) {
                    System.out.println(num[i]);
                }
                break;
        }
    }


}
