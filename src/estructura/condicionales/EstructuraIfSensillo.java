/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.condicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP14
 */
public class EstructuraIfSensillo {
    public static void main(String[] args) {
        try{
           BufferedReader leer = new  BufferedReader (new InputStreamReader(System.in));
            System.out.println("ingrese la cantidad de su salario: ");
        double salario=Double.parseDouble(leer.readLine());
            ifSencillo(salario);
                
            
        } catch (IOException | NumberFormatException e){
            System.out.println(e.getMessage());
            
        }
       
    }
    public static void ifSencillo(double salario) {
        if (salario >235) {
            System.out.println("Usted gana mas del salario minimo");
        }
    }
}
