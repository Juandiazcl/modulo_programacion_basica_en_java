/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        int continuar=0;
while(continuar==0){

int saldo = 6500;
int seleccion = JOptionPane.showOptionDialog(
null,
"Que operacion desea realizar?",
"Red de cajeros Trencitobank",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null, // null para icono por defecto.
new Object[] { "Consulta Saldo", "Deposito", "Giro" }, // null para YES, NO y CANCEL
"Consulta Saldo");

switch(seleccion){
case 0:
JOptionPane.showMessageDialog(
null,
"su saldo es $"+saldo);
break;
case 1:
String montoDeposito = JOptionPane.showInputDialog(
null,
"ingrese el monto que desea depositar",
JOptionPane.QUESTION_MESSAGE); // el icono sera un iterrogante
int montoInt = Integer.parseInt(montoDeposito);

JOptionPane.showMessageDialog(
null,
"usted ha depositado $"+montoDeposito + " su nuevo saldo es $" + (montoInt+saldo) );
break;
case 2:
String montoGiro = JOptionPane.showInputDialog(
null,
"su saldo es " + saldo + " ingrese el monto que desea retirar",
JOptionPane.QUESTION_MESSAGE); // el icono sera un iterrogante
int montoGiroInt = Integer.parseInt(montoGiro);
JOptionPane.showMessageDialog(
null,
"usted ha retirado $"+montoGiro + " su nuevo saldo es $" + (saldo-montoGiroInt) );
break;
}
continuar = JOptionPane.showOptionDialog(
null,
"Desea realizar otra operacion?",
"Red de cajeros Trencitobank",
JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE,
null, // null para icono por defecto.
new Object[] { "Si", "No" }, // null para YES, NO y CANCEL
"No");
       /* Scanner leer2=new Scanner(System.in);
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
        opcion=leer2.next();*/
    }
    }
    
}
