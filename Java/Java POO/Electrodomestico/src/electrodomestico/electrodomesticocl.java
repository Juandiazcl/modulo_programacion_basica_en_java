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
public class electrodomesticocl {
 private String marca;
    private String modelo;
    private double garantia;

    
    public void setMarca(String marca){
    this.marca = marca;
}
    public String getMarca(){
    return this.marca; 
}
    public void setModelo(String modelo){
    this.modelo = modelo;
}
    public String getModelo(){
    return this.modelo; 
}   
    public void setGarantia(double garantia){
    this.garantia = garantia;
}
    public double getGarantia(){
    return this.garantia; 
    }  
    
    public electrodomesticocl(String marca, String modelo, double garantia) {
    this.marca = marca;
     this.modelo = modelo;
     this.garantia = garantia;
     
     
}
    public void mostrarCarac()
    {
        System.out.println ("Marca : "+getMarca());
        System.out.println ("Marca : "+getModelo());
        System.out.println ("Garantia en año : "+getGarantia());
        
    }
}
