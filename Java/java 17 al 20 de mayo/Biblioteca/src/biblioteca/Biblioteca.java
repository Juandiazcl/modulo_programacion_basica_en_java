/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        // TODO code application logic here
       String _titulo,_autor;
       Scanner leer;
        double _numlib, _numlibp, nsaldo;
        int op;
         leer=new Scanner(System.in); 
        System.out.println ("Biblioteca Digital ");
        System.out.println ("Ingrese Titulo ");
        _titulo=leer.next();
        System.out.println ("Ingrese autor ");
        _autor=leer.next();
        System.out.println ("Ingrese Numero de libros actual: ");
        _numlib=leer.nextDouble();
        System.out.println ("Ingrese Numero de libros prestados actualmente: ");
        _numlibp =leer.nextDouble();
   biblioclase c1 = new biblioclase(_titulo,_autor,_numlib,_numlibp);
   nsaldo=_numlib;
   do {
   System.out.println ("Operación a realizar: 1.- Prestamo  2.- Devolución 3.- Salir ");
        op=leer.nextInt();
     if (op==1)
         nsaldo=c1.prestamo(nsaldo);
     if (op==2)
         if (_numlibp==0)
             System.out.println ("No hay libros prestados.");
             else
         nsaldo=c1.devolucion(nsaldo,_numlibp);
         System.out.println ("Quedan Libros :"+nsaldo);
   }
     while (op!=3);
             }
    }
    
