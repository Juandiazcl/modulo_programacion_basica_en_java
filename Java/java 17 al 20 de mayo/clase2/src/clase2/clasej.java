package clase2;


import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hola
 */
public class clasej {
    String nombre;
    String rut;
    Scanner leer;
    int edad;
    
    public void ingreso(){
       leer=new Scanner(System.in); 
        System.out.println ("Ingrese nombre ");
        nombre=leer.next();
        System.out.println ("Ingrese Rut ");
        rut=leer.next();
        System.out.println ("Ingrese Edad ");
        edad=leer.nextInt();
    }
    public void imprimir(){
        System.out.println ("Ficha:");
      System.out.println ("Nombre "+nombre);
        System.out.println ("Ingrese Rut "+rut);
        System.out.println ("Ingrese Edad "+edad);  
    }
    }
