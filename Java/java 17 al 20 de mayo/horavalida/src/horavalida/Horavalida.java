/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horavalida;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Horavalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in); 
        Scanner leer=new Scanner(System.in); 
        int i,hh,mm,ss;
        String opcion="N";
        System.out.println ("Ingresa hora hh - mm - ss:  ");
        hh=leer2.nextInt();
        mm=leer2.nextInt();
        ss=leer2.nextInt();
        do {
        if (hh<0 && hh>24){
            System.out.println ("Hora no valida  ");
        }
        else
        {
            if (mm>=0 && mm<=59)
                {
            System.out.println ("Hora no valida  ");
        }
            else
            {
                if (ss>=0 && ss<=59)
                {
            System.out.println ("Hora no valida  ");
        }
                else
                {
                    System.out.println ("Hora es valida  ");
                }
        }
        }
        System.out.println ("Desea seguir (S/N)  ");
        opcion=leer.next();
    }
        while (opcion=="N");
        }
    
}
