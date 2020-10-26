package es.hulk.clase.condicionals;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int rest;

        num1 = scan.nextInt();
        num2 = 2;

        rest = num1%num2;

        if (rest == 0) {
            System.out.println(num1 + " SI es multiple de 2");
        } else {
            System.out.println(num1 + " NO es multiple de 2");
        }

    }
}
