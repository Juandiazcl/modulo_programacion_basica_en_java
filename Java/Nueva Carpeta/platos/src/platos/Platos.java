/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platos;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Platos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in); 
        int num,suma;
        suma=0;
           System.out.println ("Ingresar numero de personas:  ");
    /*int notas=lector.nextInt();*/
     num=leer2.nextInt();
     if (num>300){
         suma=num*7500;
         System.out.println (" Su plato saldra cada uno 7.500");
     }
     else
     {
         if (num>=200 && num<=300){
             suma=num*8500;
         System.out.println (" Su plato saldra cada uno 8.500");
         }
         else
         {
           suma=num*9500;
         System.out.println (" Su plato saldra cada uno 9.500");  
         }
     }
     System.out.println (" El total del presupuesto es "+sum);
    }
    
}
