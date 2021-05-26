/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author Hola
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clasej c1 = new clasej();
        float opera;
        c1.ingreso();
        c1.imprimir();
        Operaciones c2=new Operaciones();
        opera = c2.suma(5, 2);
        System.out.println("Resultado "+opera);
        TipoNum c3 = new TipoNum();
        c3.numValida(opera);
        
  
        // TODO code application logic here
    }
    
}
