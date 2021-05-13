/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajedeestudio;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Viajedeestudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in);  
        int num,numalum,totalv;
        System.out.println (" Elija Opciones de Presupuesto:  ");
        System.out.println ("1- De 30 a 49 $ 9.500  ");
        System.out.println ("2- De 50 a 99 $ 7.000  ");
         System.out.println ("3- Sobre 100 $ 6.500  ");
         num=leer2.nextInt();
        System.out.println ("Ingresar numero de alumnos:  ");
     numalum=leer2.nextInt();
  
     switch (num) {
         case 1:
         totalv=numalum*6500;
         break;
         case 2:
         totalv=numalum*7000;
         break;
         case 3:
         totalv=numalum*6500;
         break;
        default:
          totalv=400000; 
          break;
     }
     System.out.println ("Total x viaje $ "+totalv);
    }
}
    