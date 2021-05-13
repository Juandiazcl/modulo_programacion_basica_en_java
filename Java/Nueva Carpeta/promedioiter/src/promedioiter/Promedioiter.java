/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedioiter;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Promedioiter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in); 
        int i;
        float num,notita,promedio;
        promedio=0;
        i=1;
        System.out.println ("Ingresar cantidad de notas  ");
        num=leer2.nextFloat();
  do {
      System.out.println("Ingresa nota "+i);
      notita=leer2.nextFloat();
      promedio=promedio+notita;
      i +=1;
  }
              while (i<=num);
          promedio=promedio/num;
          System.out.println ("Promedio de notas : "+promedio);
    }
    
}
