
package estructura.condicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstructuraSwitchInt {

    public static void main(String[] args) {
        try{
           BufferedReader leer = new  BufferedReader (new InputStreamReader(System.in));
            System.out.println("ingrese un numero entre 1 y 5: ");
       int numero= Integer.parseInt(leer.readLine());
                SwichInt(numero);
            
        } catch (IOException | NumberFormatException e){
            System.out.println(e.getMessage());
            
        }
       
    }
    public static void SwichInt(int numero) {
       String nombreDeNumero;
       switch (numero){
           case 1:
               nombreDeNumero= "Uno";
               break;
           case 2:
               nombreDeNumero= "Dos";
               break;
           case 3:
               nombreDeNumero= "Tres";
               break;
           case 4:
               nombreDeNumero= "Cuatro";
               break;
           case 5:
               nombreDeNumero="Cinco";
               break;
           default:
               nombreDeNumero="estado civil erroneo";
       }
        System.out.println("el numero ingresado es: "+ nombreDeNumero);
    }
}

