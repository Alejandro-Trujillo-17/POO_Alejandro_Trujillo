package edu.abner.trujillo.actividades.retos.reto01.process;

public class Reverse {
    public String getReverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString(); // Invierte la cadena y la devuelve
    }
}
