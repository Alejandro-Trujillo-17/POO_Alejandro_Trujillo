package edu.abner.trujillo.actividades.act1.ui;

//import java.lang.foreign.Linker;
import java.util.Scanner;

import edu.abner.trujillo.actividades.act1.process.StockManager;


public class CLI {
    
    public static void runApp() {
        StockManager stockManager = new StockManager();
        showMenu();
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion= scanner.nextInt();
            while (opcion!=3){
                switch (opcion){
                    case 1 -> {
                        System.out.println("Introduce el numero de puertas");
                        int numPuertas = scanner.nextInt();scanner.nextLine();

                        System.out.println("Introduce el color");
                        String color = scanner.nextLine();

                        System.out.println("Introduce el modelo");
                        String modelo = scanner.nextLine();

                        System.out.println("Introduce el marca");
                        String marca = scanner.nextLine();
                        stockManager.addCar(modelo,marca,numPuertas,color);
                    }
                    case 2 -> {
                        System.out.println("Catalogo de carros");
                        System.out.println(stockManager.getStock());
                    }
                    default -> System.out.println("opcion no valida");
                }
                showMenu();
                opcion = scanner.nextInt();
            }
        }
    }
    public static void showMenu(){
        System.out.println("""
                Menu
                1. agregar Carro al catalogo
                2. mostrar catalogo
                3. Salir
                """);
    }
}
    

