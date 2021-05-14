/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplox;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Multiplox {

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
        System.out.println ("Ingrese multiplos a ver:  ");
        num2=leer2.nextFloat();
  do {
      if (i % num2 ==0){
      promedio=promedio+1;
      }
      i +=1;
  }
              while (i<=num);
          System.out.println ("Cantidad de multiplos de "+num2+" : "+promedio);
    }
    
}
