package sistemaem;


import java.util.Scanner;

/**
 *
 * @author Juan Diaz
 */
public class cargadatos {
 String nombre;
    String rut;
    Scanner leer;
    int edad;
    
    public cargadatos(){
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
