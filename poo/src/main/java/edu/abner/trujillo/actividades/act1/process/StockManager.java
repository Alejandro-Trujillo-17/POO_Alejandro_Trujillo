package edu.abner.trujillo.actividades.act1.process;

import java.util.ArrayList;

public class StockManager {
    ArrayList<Car> stock;
    public StockManager() {
        this.stock = new ArrayList<>();
    }
    public void addCar(String modelo, String marca, int numeroPuerta, String color) {
        Car car = new Car(modelo, marca, numeroPuerta, color);
        stock.add(car);
    }
    
    public void printStock() {
        System.out.println(stock);
    }
}
