/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayor;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Numeromayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in); 
        int i;
        float num,promedio,num2;
        promedio=0;
        i=1;
        System.out.println ("Ingresar cantidad de numeros  ");
        num=leer2.nextFloat();
        
  do {
      System.out.println("Ingrese numero: ");
      num2=leer2.nextFloat();
      if (num2>promedio){
      promedio=num2;
      }
      i +=1;
  }
              while (i<=num);
          System.out.println ("Numero mayor "+promedio);
    }
    
}
