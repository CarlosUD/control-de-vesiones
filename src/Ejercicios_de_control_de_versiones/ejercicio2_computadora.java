/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_control_de_versiones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP14
 */
public class ejercicio2_computadora {
    public static void main(String[] args) {
       
         try{
              BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("ingrese la cantidad de su salario: ");
            double vendedor=Double.parseDouble(leer.readLine());
            System.out.println("comision por ventas");
            ifcoputadora(vendedor);
            
            
       } catch(IOException | NumberFormatException e){
           System.out.println(e.getMessage());
       }

         
    }
     public static void ifcoputadora(double vendedor) throws IOException {
         double comision1 = 0.10;
         double comision;
         double comision2 = 0.08;
         double comision3 = 0.05;
         double salario = 300;
         double desc = 0.10;
         double liqui;
         double renta = 0.10;
         double ventas;
         
         if (vendedor >=3000) {
             BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
             
             ventas=Double.parseDouble(leer.readLine());
             
            comision1 = salario*0.10 +ventas;
             
              System.out.println("comision: "+comision1);
              
              comision= comision1+comision2+comision3;
              liqui =salario-comision;
             double renta1 = salario-renta;
              System.out.println("salario liqido "+liqui);
              System.out.println("descuento de la renta: "+ desc);
              System.out.println("renta: "+ renta1);
              
              
         }else if(vendedor>=1000 && vendedor<=2999){
             BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
             
             ventas=Double.parseDouble(leer.readLine());
             
            comision2 = salario* comision2+ventas;
             
              System.out.println("comision: "+comision2);
              
              comision= comision1+comision2+comision3;
              liqui =salario-comision;
             double renta1 = salario-renta;
              System.out.println("salario liqido "+liqui);
              System.out.println("descuento de la renta: "+ desc);
              System.out.println("renta: "+ renta1);
              
              
         }else if (vendedor>=1 && vendedor<=999) {
             BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
             ventas=Double.parseDouble(leer.readLine());
            comision3 = salario* comision3+ventas;
             
              System.out.println("comision: "+comision3);
              
              comision= comision1+comision2+comision3;
              liqui =salario-comision;
             double renta1 = salario-renta;
              System.out.println("salario liqido "+liqui);
              System.out.println("descuento de la renta: "+ desc);
              System.out.println("renta: "+ renta1);
         
            
         }
        }

}
