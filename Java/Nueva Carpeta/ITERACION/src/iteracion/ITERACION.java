/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracion;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class ITERACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in); 
        int i,num;
        i=1;
        System.out.println ("Ingresar cantidad de numeros:  ");
        num=leer2.nextInt();
  do {
      System.out.println(i);
      i +=1;
              }
              while (i<=num);
 
    }
    
}
