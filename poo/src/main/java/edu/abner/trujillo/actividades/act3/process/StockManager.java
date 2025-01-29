package edu.abner.trujillo.actividades.act3.process;

import edu.abner.trujillo.actividades.act3.models.Veiculo;

public class StockManager {
    public static int indiceCocheMBarato(Veiculo coches[]) {
    float precio;
    int  indice = 0;
    precio = coches[0].getPrecio();
    for(int i=1; i<coches.length;i++){
      if(coches[i].getPrecio()<precio){
        precio = coches[i].getPrecio();
      indice = i;
      }
    }
    return indice;
  }

}
