package edu.abner.trujillo.actividades.act1.ui;

//import java.lang.foreign.Linker;
import java.util.Scanner;

import edu.abner.trujillo.actividades.act1.models.Persona;
import edu.abner.trujillo.actividades.act1.process.StockManager;

public class CLII {

    public static void runApp() {
        StockManager stockManager = new StockManager();
        showMenu();
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = scanner.nextInt();
            while (opcion != 3) {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Introduce altura");
                        Float altura = (float) scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Introduce el el color de piel");
                        String piel = scanner.nextLine();

                        System.out.println("Introduce el color de pelo");
                        String pelo = scanner.nextLine();

                        System.out.println("Introduce la nacionalidad");
                        String nacionalidad = scanner.nextLine();
                        stockManager.addPersona(pelo, piel, altura, nacionalidad);
                    }
                    case 2 -> {
                        int i = 1;
                        for (Persona persona : stockManager.getStock()) {
                            System.out.println("Persona N." + i + ":");
                            System.out.println("    Altura:" + persona.getAltura());
                            System.out.println("    Piel:" + persona.getPiel());
                            System.out.println("    Pelo:" + persona.getPelo());
                            System.out.println("    Nacionalidad:" + persona.getNacionalidad());
                            i++;

                        }

                    }
                    default -> System.out.println("opcion no valida");
                }
                showMenu();
                opcion = scanner.nextInt();
            }
        }
    }

    public static void showMenu() {
        System.out.println("""
                \nMenu
                1. Agregar Persona
                2. mostrar Personas
                3. Salir
                """);
    }
}
