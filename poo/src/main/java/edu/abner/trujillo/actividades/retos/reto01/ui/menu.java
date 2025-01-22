package edu.abner.trujillo.actividades.retos.reto01.ui;

import java.util.Scanner;

import edu.abner.trujillo.actividades.retos.reto01.process.Reverse;

public class menu {
    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        Reverse reverse = new Reverse();

        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        String reversedString = reverse.getReverse(input);
        System.out.println("After reverse string is: " + reversedString);
    }

    public static void main(String[] args) {
        runApp();
    }
}
