/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_de_control_de_versiones;
import java.util.Scanner;




public class BilletesYMonedas {
    public double tiempo;

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    public double precio_llamada(double tiempo_minutos){
        double costoLlamada = 0;
        double minutos_extra = 0;
        double pagoxminExtras = 0;
        if(tiempo_minutos>3){
            minutos_extra = tiempo_minutos - 3;  //Minutos extra
        }else{
            minutos_extra = 0;
        }
        pagoxminExtras = minutos_extra * 0.5;    //Centavos
        costoLlamada = 0.2 + pagoxminExtras ;
        return costoLlamada;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        BilletesYMonedas monto = new BilletesYMonedas();
        
        String[] vector;
        
        System.out.println("Ingrese el tiempo de duración de la llamada");
        monto.setTiempo(Double.parseDouble(leer.nextLine()));
        double dinero = monto.precio_llamada(monto.getTiempo());
        //conversion del dinero a String.
        String pisto = String.valueOf(dinero);
        
        vector = new String[pisto.length()];
        
        for (int i = 0; i < pisto.length(); i++) {
            vector[i] =  pisto.substring(i);
        }
        
        System.out.println("*******************************");
        
        for (String vector1 : vector) {
            System.out.println(vector1);
        }
        
        System.out.println("El precio por su llamada es: $" + monto.precio_llamada(monto.getTiempo()));
    }
}

