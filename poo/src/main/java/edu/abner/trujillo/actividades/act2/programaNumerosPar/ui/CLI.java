package edu.abner.trujillo.actividades.act2.programaNumerosPar.ui;

import edu.abner.trujillo.actividades.act2.programaNumerosPar.process.Numbers;

public class CLI {
    public static void runApp() {
        Numbers pares = new Numbers();
        System.out.println("Generando números pares del 2 al 100...");
        System.out.println(pares.GenerarPares());
        
    }

}
