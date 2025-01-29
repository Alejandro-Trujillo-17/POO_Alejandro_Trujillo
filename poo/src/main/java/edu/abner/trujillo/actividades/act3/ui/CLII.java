package edu.abner.trujillo.actividades.act3.ui;

//import java.lang.foreign.Linker;
import java.util.Scanner;

import edu.abner.trujillo.actividades.act3.models.Veiculo;
import edu.abner.trujillo.actividades.act3.process.StockManager;

public class CLII {
  public static void runApp(){
    Scanner entrada = new Scanner (System.in);
    String marca, modelo, color;
    float precio, ano, pasajeros;
    int numeroV,indiceB;

    System.out.print("\npon la cantidad de veiculos: ");
    numeroV = entrada.nextInt();

    Veiculo coches[] =new Veiculo[numeroV];

    for(int i=0;i<coches.length;i++){
      entrada.nextLine();
    System.out.print("\ncaracteristicas del coche "+(i+1)+":");
    System.out.print("\nmarca: ");
    marca=entrada.nextLine();
    System.out.print("\nmodelo: ");
    modelo=entrada.nextLine();
    System.out.print("\nprecio: ");
    precio=entrada.nextFloat();
    System.out.print("\nanio: ");
    ano=entrada.nextFloat();
    System.out.print("\ncupo de pasajeros: ");
    pasajeros=entrada.nextFloat();
    System.out.print("\ncolor: ");
    color=entrada.nextLine();
      

    coches[i]=new Veiculo(marca,modelo,color,precio,pasajeros,ano);
      
    }
    StockManager sm = new StockManager();

    indiceB=sm.indiceCocheMBarato(coches);
    System.out.print("\nel coche mas bara es: \n");
    System.out.print(coches[indiceB].mostrarDatos());
  }
}