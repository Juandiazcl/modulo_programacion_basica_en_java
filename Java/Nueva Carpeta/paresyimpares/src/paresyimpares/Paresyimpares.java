/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paresyimpares;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Paresyimpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in); 
        int i;
        float num,npar,nimp,sumap,sumai;
        npar=0;
        nimp=0;
        sumap=0; sumai=0;
        i=1;
        System.out.println ("Ingresar cantidad de numeros  ");
        num=leer2.nextFloat();
       
  do {
      if (i % 2 ==0){
      npar=npar+1;
      sumap=sumap+i;
      }
      else
      {
          nimp=nimp+1;
          sumai=sumai+i;
      }
       
      i +=1;
  }
              while (i<=num);
              if (npar>nimp){
                  System.out.println ("numeros pares son mayores");
              }
              else
              {
                  System.out.println ("numeros impares son mayores");
              }
              
          System.out.println ("Suma de de pares "+sumap+" Impares "+sumai);
          System.out.println ("Pares "+npar+" Impares "+nimp);
    }
    
}
