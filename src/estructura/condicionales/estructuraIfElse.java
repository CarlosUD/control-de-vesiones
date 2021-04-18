
package estructura.condicionales;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class estructuraIfElse {
    public static void main(String[] args) {
        try{
           BufferedReader leer = new  BufferedReader (new InputStreamReader(System.in));
            System.out.println("ingrese la cantidad de su salario: ");
        double salario=Double.parseDouble(leer.readLine());
            ifElse(salario);
                
            
        } catch (IOException | NumberFormatException e){
            System.out.println(e.getMessage());
            
        }
       
    }
    public static void ifElse(double salario ) {
        if (salario >235) {
            System.out.println("Usted gana mas del salario minimo");
        }else{
            System.out.println("Usted gana menos del salario minimo");
        }
    }
}
