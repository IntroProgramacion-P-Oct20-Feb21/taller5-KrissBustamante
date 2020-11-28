/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
         double preciounitario;
         double costodelpedido;
         double descuento;
         int porcentaje;
         int cantidades;
         
         porcentaje =15;
         System.out.println("Ingrese el precio unitario");
         preciounitario = entrada.nextDouble();
         System.out.println("ingrese las Cantidades");
         cantidades = entrada.nextInt();
         
         costodelpedido =  preciounitario * cantidades;
         descuento = (porcentaje * costodelpedido)/100;
         
         if(cantidades <= 50){
             System.out.printf("Elcosto del pedido es: %.2f ",costodelpedido );}
         {System.out.printf("El costo del pedido es: %.2f", costodelpedido-descuento);}
         
    }
    
}
