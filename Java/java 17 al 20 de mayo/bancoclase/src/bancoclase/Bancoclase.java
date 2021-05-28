/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoclase;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Bancoclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String _nombre,_cuenta;
       Scanner leer;
        double _saldo, nsaldo;
        int op;
         leer=new Scanner(System.in); 
        System.out.println ("Digital Bank ");
        System.out.println ("Ingrese nombre ");
        _nombre=leer.next();
        System.out.println ("Ingrese Cuenta ");
        _cuenta=leer.next();
        System.out.println ("Ingrese Saldo: ");
        _saldo=leer.nextDouble();
   bancoclasec c1 = new bancoclasec(_nombre,_cuenta,_saldo);
   nsaldo=_saldo;
   do {
   System.out.println ("Operación a realizar: 1.- Deposito  2.- Giro 3.- Transferencia  4.- Salir ");
        op=leer.nextInt();
     if (op==1)
         nsaldo=c1.deposito(nsaldo);
     if (op==2)
         nsaldo=c1.giro(nsaldo);
     if (op==3)
        nsaldo=c1.transferir(nsaldo);
     System.out.println ("Nuevo Saldo "+nsaldo);
   }
     while (op!=4);
             }
    
}
