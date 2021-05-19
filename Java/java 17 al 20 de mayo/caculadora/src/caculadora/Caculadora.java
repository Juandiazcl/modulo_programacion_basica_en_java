/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculadora;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Caculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in);
        Float op,n1,n2;
        op=0f;
        String opcion, tope;
        do {
        System.out.println ("Ingrese operacion: + o - o * o / ");
        tope=leer2.next();
        System.out.println ("Ingrese numeros:  ");
        n1=leer2.nextFloat();
        n2=leer2.nextFloat();
        System.out.println (tope);
        if (tope.equals("+"))
            op=n1+n2;
        else
            if (tope.equals("-"))
            op=n1-n2;
            else
                if (tope.equals("*"))
                op=n1*n2;
                else
                    if (tope.equals("/"))
               op=n1/n2;
                else
        System.out.println ("Operacion no valida");
        System.out.println ("Resultado:  "+op);
        System.out.println ("Desea seguir (S/N)  ");
        opcion=leer2.next();
    }
        while (opcion.equals("S") || opcion.equals("s"));
    }
    
}
