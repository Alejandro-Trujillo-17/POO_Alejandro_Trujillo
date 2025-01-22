package edu.abner.trujillo.actividades.act2.programaNombre.process;
import static edu.abner.trujillo.actividades.act2.programaNombre.models.Data.namesDefault;

public class NameValidator {

    public static boolean validateName(String name) {
        boolean valid = false;
        int index = 0;
        while (!valid && index<namesDefault.length) {
            if(namesDefault[index].equals (name)){
                valid = true;
            }
            
            index++;
    
    
        }
    return valid;
    }

}