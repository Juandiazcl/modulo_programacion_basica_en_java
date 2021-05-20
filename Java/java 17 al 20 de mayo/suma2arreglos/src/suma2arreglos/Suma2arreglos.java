/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma2arreglos;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Suma2arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in); 
        int num,sum;
        sum=0;
        System.out.println ("Ingrese limite: ");
        num=leer.nextInt();
        int numero[] = new int [num];
        int numero2[] = new int [num];
        int suma[] = new int [num];
 for (int i=0;i<num;i++){
     System.out.println ("Ingresar numero "+i+ " LISTA A");
        numero[i]=leer.nextInt();
        System.out.println ("Ingresar numero "+i+ " LISTA B");
        numero2[i]=leer.nextInt();
        suma[i]=numero[i]+numero2[i];
        System.out.println ("Suma A + B "+suma[i]);
        sum=sum+suma[i];
    }
  System.out.println ("Suma total final "+sum);
    }
    
}
