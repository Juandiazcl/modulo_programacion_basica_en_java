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
        c1.cargadatosf();
        c1.imprimir();
        /*Menupanel c5 = new MenuPanel();*/
        analisis c2 = new analisis("Arica");
        analisis c3= new analisis("SANTIAGO");
        experiencia c4=new experiencia();
        c4.setEspecialidad("Sistemas");
        c4.setProfesion("Programador");
        System.out.println("Especialidad:"+c4.getEspecialidad());
        System.out.println("Programador:"+c4.getProfesion());
        c4.imprimirp();
        int demoraMin;
        demoraMin=c2.distanTraslado("PROVIDENCIA");
        System.out.println(demoraMin);
       
    }
    
}
