
package Ejercicios_de_control_de_versiones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio3_masa_corporal {
    public static void main(String[] args) {
      
         try{
              BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("ingrese la masa corporal");
            double masa=Double.parseDouble(leer.readLine());
            
            ifmasacorporal(masa);
           
            
       } catch(IOException | NumberFormatException e){
           System.out.println(e.getMessage());
       }    
    }
    public static void ifmasacorporal(double masa) throws IOException {
         double peso;
         double imc;
         double imcq;
        double altura;
        if (masa <18) {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el peso de la persona"); 
            peso=Double.parseDouble(leer.readLine());
            System.out.println("ingrese la alura de la persona");
            altura=Double.parseDouble(leer.readLine());
            imc= peso  / (altura)*2;
            System.out.println("Peso bajo. Necesario valorar signos de desnutrición");
            System.out.println("El IMC es: "+ imc);
        } else if (masa >=18&& masa<=24.9) {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el peso de la persona"); 
            peso=Double.parseDouble(leer.readLine());
            System.out.println("ingrese la alura de la persona");
            altura=Double.parseDouble(leer.readLine());
            imc= peso/altura*2;
            System.out.println("normal");
            System.out.println("El IMC es: "+ imc);
        }else if (masa >=25&& masa<=26.9) {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el peso de la persona"); 
            peso=Double.parseDouble(leer.readLine());
            System.out.println("ingrese la alura de la persona");
            altura=Double.parseDouble(leer.readLine());
            imc= peso/altura*2;
            System.out.println("sobrepeso");
            System.out.println("El IMC es: "+ imc);
        }else if (masa >27) {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el peso de la persona"); 
            peso=Double.parseDouble(leer.readLine());
            System.out.println("ingrese la alura de la persona");
            altura=Double.parseDouble(leer.readLine());
            imc= peso/altura*2;
            System.out.println("Obesidad");
            System.out.println("El IMC es: "+ imc);
        }else if (masa>=27 && masa <29.9) {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el peso de la persona"); 
            peso=Double.parseDouble(leer.readLine());
            System.out.println("ingrese la alura de la persona");
            altura=Double.parseDouble(leer.readLine());
            imc= peso/altura*2;
            System.out.println("Obesidad grado I.Riesgo relativoaltopara desarrollar enfermedades cardiovasculares");
            System.out.println("El IMC es: "+ imc);
        }else if (masa >=30&&masa <=39.9) {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el peso de la persona"); 
            peso=Double.parseDouble(leer.readLine());
            System.out.println("ingrese la alura de la persona");
            altura=Double.parseDouble(leer.readLine());
            imc= peso/altura*2;
            System.out.println("Obesidad grado II.Riesgo relativomuy altopara el desarrollode enfermedades cardiovasculares");
            System.out.println("El IMC es: "+ imc);
        }else if (masa>=40) {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el peso de la persona"); 
            peso=Double.parseDouble(leer.readLine());
            System.out.println("ingrese la alura de la persona");
            altura=Double.parseDouble(leer.readLine());
            imc= peso/altura*2;
            System.out.println("Obesidad grado III Extrema o Mórbida.Riesgo relativoextremadamente altopara el desarrollo de enfermedades cardiovasculares");
            System.out.println("El IMC es: "+ imc);
        }
    }
}
