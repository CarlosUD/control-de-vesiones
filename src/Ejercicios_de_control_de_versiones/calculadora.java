/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_control_de_versiones;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class calculadora {

   public static void main(String[] args) {

      
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("S = Suma;\nR = Resta;\nM = Multiplicación \nD = División");
        System.out.println("ingrese la opcion");
       try{
           String calculadora= leer.readLine();
           SwichCalculadora(calculadora.toUpperCase().charAt(0));
            
            
       } catch(IOException | NumberFormatException e){
           System.out.println(e.getMessage());
       }

         
    }
 public static void  SwichCalculadora(char calcu) throws IOException {
       
       int cantidad1, cantidad2;
       switch (calcu){
           case 'S':
               BufferedReader leerS = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("INGRESAR CANTIDAD 1: ");
                cantidad1= Integer.parseInt(leerS.readLine());
            
                System.out.println("INGRESAR CANTIDAD 2: ");
                cantidad2= Integer.parseInt(leerS.readLine());
                int suma = cantidad1 + cantidad2;
                System.out.println("la suma: "+ suma);
           
            
               break;
           case 'R':
               BufferedReader leerR = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("INGRESAR CANTIDAD 1: ");
                cantidad1= Integer.parseInt(leerR.readLine());
            
                System.out.println("INGRESAR CANTIDAD 2: ");
                cantidad2= Integer.parseInt(leerR.readLine());
                int resta = cantidad1 - cantidad2;
                System.out.println("la suma"+ resta);
               break;
           case 'M':
                BufferedReader leerM = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("INGRESAR CANTIDAD 1: ");
                cantidad1= Integer.parseInt(leerM.readLine());
            
                System.out.println("INGRESAR CANTIDAD 2: ");
                cantidad2= Integer.parseInt(leerM.readLine());
                int multi = cantidad1 * cantidad2;
                System.out.println("la multiplicacin es: "+ multi);
               break;
           case 'D':
               BufferedReader leerD = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("INGRESAR CANTIDAD 1: ");
                cantidad1= Integer.parseInt(leerD.readLine());
            
                System.out.println("INGRESAR CANTIDAD 2: ");
                cantidad2= Integer.parseInt(leerD.readLine());
                int divi = cantidad1 /cantidad2;
                System.out.println("la multiplicacin es: "+ divi);
               break;
           default:
               
               System.out.println("No esta en el menu de opciones");
       }
       // System.out.println("su estado civil es "+ calculadora1);
    }
   
   
   public static double restar (double cantidad1,double cantidad2){
       double resta = cantidad1 - cantidad2;
       return resta;
   }
  
 public static double multiplicar (double cantidad1,double cantidad2){
       double multiplicacion = cantidad1 * cantidad2;
       return multiplicacion;
   }
 public static double dividir (double cantidad1,double cantidad2){
       double divicion = cantidad1 / cantidad2;
       return divicion;
   } 
    
}

