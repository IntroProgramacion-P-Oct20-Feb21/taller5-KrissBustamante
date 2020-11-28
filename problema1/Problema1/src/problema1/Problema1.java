/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
         Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
         
         double costokilovatiohora;
         double  kilovatiosconsumidos;
         double plantilla;
         double porcentaje;
         double descuento;
         int edad;
         
         porcentaje = 10;
         
         System.out.println("Ingrese el valor del costo kilovatio/hora");
         costokilovatiohora = entrada.nextDouble();
         System.out.println("Ingrese el valor de los kilovatios consumidos");
         kilovatiosconsumidos = entrada.nextDouble();
         System.out.println("Ingrese su edad");
         edad = entrada.nextInt();
         
         plantilla = costokilovatiohora * kilovatiosconsumidos;
         descuento = (porcentaje * plantilla)/100 ;
         if (edad <= 65){
         System.out.printf("El valor de la plantilla es: %.2f", plantilla);
         }else{
         System.out.printf("El valor de la plantilla es: %.2f", plantilla-descuento);}
                
    
        
    }
    
}
