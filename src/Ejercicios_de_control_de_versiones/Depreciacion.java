
package Ejercicios_de_control_de_versiones;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Depreciacion {

    public static void main(String[] args) {
        
        
        double costoMaquinaria = 0;
        String nombreMaquinaria ="";
        int tiempo = 0;
        double sumaDigitos;
        double porcentajeDepreciacion = 0;
        double montoDepreciacio  = 0;
        Scanner leer =new Scanner(System.in);
        System.out.println("costo de la maquinaria");
         costoMaquinaria =leer.nextDouble();
         
         System.out.println("nombre de la maquinaria");
         nombreMaquinaria =leer.next();
         
         System.out.println("años de depreciacion");
         tiempo=leer.nextInt();
         DecimalFormat formato = new DecimalFormat("##.##");
         sumaDigitos = (tiempo *(tiempo+1))/2;
         System.out.println("N\t porcentaje\t monto de depreciacion\t");
         for (int i = 1; i <= tiempo; i++) {
           porcentajeDepreciacion =(i/sumaDigitos);
           montoDepreciacio =costoMaquinaria * porcentajeDepreciacion;
            
           System.out.println(i+ "\t\t" + formato.format(porcentajeDepreciacion)+"\t\t" +  montoDepreciacio);
             
         }
         System.out.println("FIN");
    }
    
}
