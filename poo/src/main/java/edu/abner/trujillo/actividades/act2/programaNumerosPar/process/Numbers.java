package edu.abner.trujillo.actividades.act2.programaNumerosPar.process;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    
    public List<Integer> getPar() {
        List<Integer> pares = new ArrayList<>();
        for (int i = 2; i <= 100; i += 2) {
            pares.add(i);
        }
        return pares;
    }

}
