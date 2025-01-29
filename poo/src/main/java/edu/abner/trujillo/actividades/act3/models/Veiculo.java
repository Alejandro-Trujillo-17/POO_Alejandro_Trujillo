package edu.abner.trujillo.actividades.act3.models;

public class Veiculo {
    private String marca;
    private String modelo;
    private String color;
    private float precio;
    private float ano;
    private float pasajeros;
  
    public Veiculo(String marca, String modelo,String color, float precio, float pasajeros, float ano) {
      this.marca = marca;
      this.modelo = modelo;
      this.precio = precio;
      this.ano = ano;
      this.color = color;
      this.pasajeros = pasajeros;
    }                
  
    public float getPrecio() {
      return precio;
    }
  
    public String mostrarDatos() {
      return "marca: " + marca + "\nmodelo: " + modelo + "\nprecio: $" + precio + "\nanio: " + ano + "\ncolor: " + color+ "\npasajeros: " + pasajeros + "\n";
    }
  }