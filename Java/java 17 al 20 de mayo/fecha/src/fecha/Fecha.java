/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

/**
 *
 * @author Hola
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean va;
        fechaCla fec= new fechaCla(32,12,2020);
        /*va=fec.fechaCorrecta(27, 3, 2020);
         System.out.println(" Bandera "+va);
        if (va)
                System.out.println(" Fecha correcta. ");
        else
            System.out.println(" Fecha incorrecta. ");*/
        fec.diaSiguiente(27, 2, 2021);
    }
    
}
