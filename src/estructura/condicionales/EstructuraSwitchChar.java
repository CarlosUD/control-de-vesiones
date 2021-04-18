
package estructura.condicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstructuraSwitchChar {
    public static void main(String[] args) {
        try{
           BufferedReader leer = new  BufferedReader (new InputStreamReader(System.in));
            System.out.println("ingrese el estado civil de la persona: ");
        String estadoCivil= leer.readLine();
            
                SwichChar(estadoCivil.toUpperCase().charAt(0));
            
        } catch (IOException | NumberFormatException e){
            System.out.println(e.getMessage());
            
        }
       
    }
    public static void SwichChar(char estadoCivil) {
       String mensajeEstadoCivil;
       switch (estadoCivil){
           case 'S':
               mensajeEstadoCivil= "Soltero/a";
               break;
           case 'C':
               mensajeEstadoCivil= "casado/a";
               break;
           case 'D':
               mensajeEstadoCivil= "Divorsiado";
               break;
           case 'A':
               mensajeEstadoCivil= "Acompañado";
               break;
           case 'F':
               mensajeEstadoCivil="forever Alone";
               break;
           default:
               mensajeEstadoCivil="estado civil erroneo";
       }
        System.out.println("su estado civil es "+ mensajeEstadoCivil);
    }
}
