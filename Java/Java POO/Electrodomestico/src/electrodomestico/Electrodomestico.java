/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomestico;

/**
 *
 * @author Hola
 */
public class Electrodomestico {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        double i,pvta;
        i=1;
        electrodomesticocl c1 = new electrodomesticocl("Samsung","Hogar",i);
        System.out.println("Prueba");
        c1.mostrarCarac();
        lavadoraCl c2= new lavadoraCl("Samsung","Hogar",i,13,50);
        System.out.println("Prueba 2");
        c2.mostrarCarac();
        hornoelec c3= new hornoelec("Samsung","Hogar",i,1500,50000);
        System.out.println("Prueba 3");
        c3.mostrarCarac();
        pvta=c3.calcularPrevta(30);
        System.out.println("Precio de venta, con utilidad de 30 es:"+pvta);
    }
    
}
