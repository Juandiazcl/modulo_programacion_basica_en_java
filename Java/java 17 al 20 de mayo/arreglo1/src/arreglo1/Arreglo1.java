/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo1;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Arreglo1 {

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
 for (int i=0;i<num;i++){
     System.out.println ("Ingresar numero ");
        numero[i]=leer.nextInt();
        sum=sum+numero[i];
    }
  System.out.println ("Suma total "+sum);
    }
    
}
