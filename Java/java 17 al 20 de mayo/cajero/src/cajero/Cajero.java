/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in);
        int op,saldo,n1;
        saldo=100000;
        String opcion, tope, clave;
        
        System.out.println ("Ingrese Clave  ");
        clave=leer2.next();
        if (clave.equals("123"))
            opcion="S";
        else
        {
            System.out.println ("Clave incorrecta  ");
            opcion="N";
        }
        while (opcion.equals("S") || opcion.equals("s")){
        System.out.println ("Ingrese operacion:  ");
        System.out.println ("C - CONSULTA DE SALDO.  ");
        System.out.println ("A - REALIZAR ABONO.  ");
        System.out.println ("G - REALIZAR GIRO.  ");
        tope=leer2.next();
        System.out.println (tope);
        if (tope.equals("C")&&tope.equals("c"))
            System.out.println ("SALDO en cuenta:  "+saldo);
        else
            if (tope.equals("A")&&tope.equals("a")){
                System.out.println ("Ingrese monto Abono:  ");
                n1=leer2.nextInt();
                saldo=saldo+n1;
                System.out.println ("Nuevo saldo en la cuenta:  "+saldo);
            }    
  
            else
                if (tope.equals("G")&&tope.equals("g"))
                {
                System.out.println ("Ingrese monto a girar:  ");
                n1=leer2.nextInt();
                saldo=saldo-n1;
                System.out.println ("Nuevo saldo en la cuenta:  "+saldo);
            }    
                else
                 System.out.println ("Operacion no valida");
        System.out.println ("Desea seguir (S/N)  ");
        opcion=leer2.next();
    }
    }
    
}
