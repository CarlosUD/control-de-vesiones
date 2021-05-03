
package estructura.condicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComisionVendedor {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new  BufferedReader (new InputStreamReader(System.in));
            System.out.println("ingrese valor de la venta: ");
            double valorVenta= Double.parseDouble(leer.readLine());
            System.out.println("ingrese el genero del vendedor");
            String genero=leer.readLine();
            CalcularComision(valorVenta,genero.toUpperCase().charAt(0));
            
        } catch (IOException | NumberFormatException e){
            System.out.println(e.getMessage());
            
        }
       
    }
    public static void CalcularComision(double valorVenta, char generoVendedor) {
       double comision, salario=0.0;
        String genero = "";
        if (generoVendedor =='M') {
            genero = "Masculino";
            comision = valorVenta*0.03;
            salario= comision + 200;
        }else if (generoVendedor =='F') {
            genero = "Femenino";
            comision = valorVenta*0.05;
            salario= comision + 200;
        }
        System.out.println("El salario del vendedor " + genero + " es de " + salario);
    }
    public static void ifString(String genero) {
        if (genero.equals("femenino")) {
            System.out.println("F");
        }else if (genero.equals("Masculono")) {
            System.out.println("M");
        }
    }
}
