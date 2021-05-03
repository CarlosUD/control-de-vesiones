
package Ejercicios_de_control_de_versiones;


import java.util.Scanner;
public class ejercicio3_masa_corporal{




 
    public static void main(String[] args) {
       double peso,estatura,imc;
       String masa = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe tu peso en kilogramos");
        peso = Double.parseDouble(leer.nextLine());
        System.out.println("Escribe tu estatura en metros");
        estatura= Double.parseDouble(leer.nextLine());
        imc=peso /(estatura*estatura);
        
        if (imc<=18) {
            masa = "Peso bajo. Necesario valorar signos \n de desnutrición";
        }
        if(imc>=18 && imc<=24.9) {
            masa= "Normal";
        }
        if (imc>=25 && imc<=26.9) {
            masa= "Sobrepeso";
        }
        if (imc>=27) {
            masa= "Obesidad";
        }
        if (imc>=27.9 && imc<=29.9) {
            masa ="Obesidad grado I.Riesgo relativoaltopara desarrollar enfermedades cardiovasculares";
        }
        if (imc>=30 && imc<=39.9) {
            masa ="Obesidad grado II.Riesgo relativomuy altopara el desarrollode enfermedades cardiovasculares";
        }
        if (imc>=40) {
            masa ="Obesidad grado III Extrema o Mórbida.Riesgo relativoextremadamente altopara el desarrollo de enfermedades cardiovasculares";
        }
        System.out.println("Tu Indice de masa corporal es: "+imc+" \n\n TIENE:"+ masa);
    }
}