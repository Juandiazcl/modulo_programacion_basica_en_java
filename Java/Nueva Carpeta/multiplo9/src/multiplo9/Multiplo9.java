/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplo9;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Multiplo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in); 
        int i;
        float num,promedio;
        promedio=0;
        i=1;
        System.out.println ("Ingresar cantidad de notas  ");
        num=leer2.nextFloat();
  do {
      if (i % 9 ==0){
      promedio=promedio+i;
      }
      i +=1;
  }
              while (i<=num);
          System.out.println ("Suma de multiplos de 9 : "+promedio);
    }
    }
    
