package edu.abner.trujillo.actividades.act1.models;

public class Car {
    private String modelo;
    private String marca;
    private int numeroPuerta;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numeroPuertas=" + numeroPuerta +
                ", color='" + color + '\'' +
                '}';
    }


    public Car(String modelo, String marca, int numeroPuerta, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.numeroPuerta = numeroPuerta;
        this.color = color;
    }
    public int getNumeroPuerta() {
        return numeroPuerta;
    }
    public void setNumeroPuerta(int numeroPuerta) {
        if(numeroPuerta<2 || numeroPuerta>5){
            throw new IllegalArgumentException("El número de puertas debe ser entre 2 y 5");
        }
        this.numeroPuerta = numeroPuerta;

    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }



}