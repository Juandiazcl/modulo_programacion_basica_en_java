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
public class biblioclase {
   private String titulo;
    private String autor;
    private double numlib;
    private double numlibpres;
    
    public void setTitulo(String titulo){
    this.titulo = titulo;
}
    public String getTitulo(){
    return this.titulo; 
}
    public void setAutor(String autor){
    this.autor = autor;
}
    public String getAutor(){
    return this.autor; 
}
    public void setNumlib(double numlib){
    this.numlib = numlib;
}
    public double getNumlib(){
    return this.numlib; 
}
    public void setNumlibpres(double numlibpres){
    this.numlibpres = numlibpres;
}
    public double getNumlibpres(){
    return this.numlibpres; 
}
    public biblioclase(String titulo, String autor, double numlib, double numlibpres )
    {
     this.titulo = titulo;
     this.autor = autor;
     this.numlib = numlib;
     this.numlibpres = numlibpres;
     
    } 
    public double devolucion (double saldo,double numlibp)
    {
    double aux,sf;
    Scanner leer2;
    leer2=new Scanner(System.in); 
    sf=saldo;
        System.out.println("Cantidad de libros devueltos");
        aux=leer2.nextDouble();
        if(aux<=0)
            System.out.println("Ingreso menor a 0");
        else
            if (aux>numlibp)
                System.out.println("CAntidad devuelta mayot a cantidad prestada, ERROR");
                else
            sf=saldo+aux;
    return sf;   
    }
    public double prestamo (double saldo)
    {
    double aux,sf;
    Scanner leer2;
    leer2 = new Scanner(System.in); 
        sf=saldo;
        System.out.println("Cantidad de libros a prestar:");
        aux=leer2.nextDouble();
        if(aux<=0)
            System.out.println("Ingreso menor a 0");
        if (saldo<aux)
             System.out.println("No hay esa cantidad de libros para prestar");
        else {  
        sf=saldo-aux;
        }
        return sf;
    }
}
