
package estructura.condicionales;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IfElseAnidada {
    public static void main(String[] args) {
        try{
           BufferedReader leer = new  BufferedReader (new InputStreamReader(System.in));
            System.out.println("ingrese la cantidad de su salario: ");
        double salario=Double.parseDouble(leer.readLine());
            ifElseAnidada(salario);
                
            
        } catch (IOException | NumberFormatException e){
            System.out.println(e.getMessage());
            
        }
       
    }
    public static void ifElseAnidada(double salario ) {
        if (salario >235) {
            System.out.println("Usted gana mas del salario minimo");
        }else if(salario >0){
            System.out.println("Usted gana menos del salario minimo");
        }else {
                System.out.println("ingreso de dato erroneo");
        }
    }
}
