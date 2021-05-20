/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numperfecto;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Numperfecto {

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
        System.out.println ("Ingresar numero ");
        num=leer2.nextFloat();
  do {
      if (num % i ==0 && i!=num){
      promedio=promedio+i;
      }
      i +=1;
      System.out.println (promedio);
  }
              while (i<=num);
  if (promedio==num)
          System.out.println ("El numero ingresado es perfecto ");
  else
      System.out.println ("El numero ingresado No es perfecto ");
    }
    
}
