package edu.abner.trujillo.actividades.act1.process;
import java.util.ArrayList;
import java.util.List;

import edu.abner.trujillo.actividades.act1.models.Car;


public class StockManager {
    ArrayList<Car> stock;

    public StockManager() {
        this.stock = new ArrayList<>();
    }
    public void addCar(String modelo, String marca, int numeroPuerta, String color){
        Car car= new Car(modelo,marca,numeroPuerta,color);
        stock.add(car);

    }
    public List<Car> getStock(){
        return this.stock;
    }

}

