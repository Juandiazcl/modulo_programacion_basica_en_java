/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaem;


/**
 *
 * @author Hola
 */
public class Sistemaem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cargadatos c1 = new cargadatos();
        c1.imprimir();
        analisis c2 = new analisis("Arica","CALERA");
        analisis c3= new analisis ("SANTIAGO","LA FLORIDA");
    }
    
}
