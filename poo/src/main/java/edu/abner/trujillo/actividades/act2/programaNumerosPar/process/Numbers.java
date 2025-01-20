package edu.abner.trujillo.actividades.act2.programaNumerosPar.process;

public class Numbers {
    public String GenerarPares() {
        StringBuilder evenNumbers = new StringBuilder();
        for (int i = 2; i <= 100; i += 2) {
            evenNumbers.append(i).append(" ");
        }
        return evenNumbers.toString();
    }


}
