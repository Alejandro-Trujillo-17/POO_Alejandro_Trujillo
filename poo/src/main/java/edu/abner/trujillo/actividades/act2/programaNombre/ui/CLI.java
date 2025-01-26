package edu.abner.trujillo.actividades.act2.programaNombre.ui;

import java.util.Scanner;

import edu.abner.trujillo.actividades.act2.programaNombre.process.NameValidator;

public class CLI {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombreIngresado = sc.nextLine();

        NameValidator.validateName(nombreIngresado);
    }

}
