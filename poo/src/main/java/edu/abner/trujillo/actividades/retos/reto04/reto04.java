package edu.abner.trujillo.actividades.retos.reto04;
import java.util.ArrayList;
import java.util.List;
public class reto04 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(-6);
        lista.add(-2);
        lista.add(0);
        lista.add(1);
        lista.add(4);

        Integer primerNumero = lista.get(0);
        Integer ultimoNumero = lista.get(lista.size() - 1);
      

        for (Integer numero : lista) {
            if(primerNumero > ultimoNumero) {
                

                System.out.println("Primer número: " + ultimoNumero + "\nÚltimo número: " + primerNumero);
            }
            else {
                System.out.println("Primer número: " + primerNumero + "\nÚltimo número: " + ultimoNumero);
            }ultimoNumero = numero;
            }
        }

        
            
    }



