package es.hulk.buscaminas;

import es.hulk.buscaminas.menus.Menus;
import es.hulk.buscaminas.tauler.Tauler;

public class Buscaminas {

    public static void main(String[] args) {

        Menus.printTitol();
        System.out.println("Trii una de les seguents opcions");
        System.out.println("");
        System.out.println("1 - Principiant ");
        System.out.println("2 - Normal");
        System.out.println("3 - Dificil");
        System.out.println("4 - Personalitzat");
        Menus.printMenus();

    }
}
