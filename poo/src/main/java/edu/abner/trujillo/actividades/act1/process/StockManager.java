package edu.abner.trujillo.actividades.act1.process;

import java.util.ArrayList;
import java.util.List;

import edu.abner.trujillo.actividades.act1.models.Persona;

public class StockManager {
    ArrayList<Persona> stock;

    public StockManager() {
        this.stock = new ArrayList<>();
    }

    public void addPersona(String pelo, String piel, Float altura, String nacionalidad) {
        Persona persona = new Persona(pelo, piel, altura, nacionalidad);
        stock.add(persona);

    }

    public List<Persona> getStock() {
        return this.stock;
    }

}
