/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvas2;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Uvas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in); 
        Scanner tipouva=new Scanner(System.in); 
        int num,valou,kuva,totalk,totalem;
        char tipou;
        valou=0;
        totalk=0;
        totalem=0;
        System.out.println ("Ingresar tipo de Uva:  ");
        tipou=tipouva.next().charAt(0);
        System.out.println ("Ingresar numero de Uva:  ");
     num=leer2.nextInt();
     System.out.println ("Ingresar valor KG de Uva:  ");
    /*int notas=lector.nextInt();*/
     kuva=leer2.nextInt();
     System.out.println ("Ingresar cantidad de Kg:  ");
    /*int notas=lector.nextInt();*/
     totalk=leer2.nextInt();
     if (tipou=='A'){
         if (num==1){
         valou=kuva+20;
         }
         else
         {
             valou=kuva+30;
         }
     }
     else
     {
         if (tipou=='B'){
             
           if (num==1){
              valou=kuva-30;
            }
            else
            {
             valou=kuva-50;
            }
         }
         else
         {
          
         System.out.println ("Tipo de uva no valido");  
         }
     }
    
     totalem=totalk*valou;
     System.out.println (" El valor del KG de uva es "+valou+" Total embarque  "+totalem);
    }
    
}
