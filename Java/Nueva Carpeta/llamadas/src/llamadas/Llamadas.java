/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llamadas;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Llamadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in); 
        Scanner tipouva=new Scanner(System.in); 
        int num,valou,recdi,totalem;
        char tipou,dgo;
        valou=0;
        totalem=0;
        System.out.println ("Llamada fue un dia domingo S/N  ");
        dgo=tipouva.next().charAt(0);
        System.out.println ("Ingresar duracion llamada:  ");
        num=leer2.nextInt();
       if (dgo=='N'){
           System.out.println ("Ingrese horario D=Diurno V=Vespertino  ");
           tipou=tipouva.next().charAt(0);
          if (tipou=='D'){
          recdi=10;
          }
          else
          {
          recdi=15;
          }
          }
       else{
           recdi=3;
       }
    
         if (num<=5){
         valou=num*100;
         }
         else{
             if (num>5 && num<=8)
             {
             valou=(num-5)*80+500;
             }
             else
             {
                if (num>8 && num<=10){
                    valou=(num-8)*70+740;
                }
                else{
                    valou=(num-10)*50+880;
                } 
             }
         }    
     
    
    
     totalem=valou+((valou*recdi)/100);
     System.out.println (" El valor de la llamada es  "+totalem);
    }
    
}
