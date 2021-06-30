/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudadanocl;

/**
 *
 * @author Hola
 */
public class Ciudadanocl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double i,sueldo;
        i=42;
        sueldo=600000;
        Persona c1 = new registrocivil("Juan Diaz",true,i,"Chile","13.679.191-5");
        System.out.println("Prueba");
        c1.mostrarDatos();
        Persona c2 = new Empleado("Juan Diaz",true,i,"Rymas",sueldo);
        System.out.println("Prueba 2");
        c2.mostrarDatos();
        Persona c3 = new Padre("Juan Diaz",true,i,true,3);
        System.out.println("Prueba 3");
        c3.mostrarDatos();
    }
    
}
