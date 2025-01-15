package edu.abner.trujillo.actividades.act1.ui;

//import java.lang.foreign.Linker;
import java.util.Scanner;

public class CLI {
    public static void ShowMenu() {
        System.out.println("crear estudiante");
        System.out.println("listar estudiantes");
        System.out.println("salir");
    }
    public void mostrar(String mensaje){
        System.out.println(mensaje);
    }
    public void mostrarError(String mensaje){
        System.out.println("Error: " + mensaje);
    }
    public void mostrarEstudiante(String[] estudiantes){
        for (String estudiante : estudiantes){
            System.out.println(estudiante);
        }
    }
    public static void launch() {
        ShowMenu();
        Scanner scanner = new Scanner(System.in);
        int opcion= scanner.nextInt();
        while (opcion !=3){
            switch (opcion) {
                case 1:
                    System.out.println("crear estudiante");
                    break;
                case 2:
                    System.out.println("listar estudiante");
                    break;




                default:
                System.out.println("error");
                break;

            }

            //ectect
            ShowMenu();
            opcion=scanner.nextInt();
        }
    }
}
