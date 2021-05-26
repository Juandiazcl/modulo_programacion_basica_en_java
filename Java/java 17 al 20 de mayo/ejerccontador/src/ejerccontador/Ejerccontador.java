/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerccontador;

/**
 *
 * @author Hola
 */
public class Ejerccontador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        // TODO code application logic here
        contador c1 = new contador(85);
 
        a=c1.incrementar();
        System.out.println(" Incremento "+a);
        
        a=c1.decrementar();
        System.out.println(" Dencremento "+a);
    }
    
}
