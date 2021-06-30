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
public class lavadoraCl extends electrodomesticocl{
   private double kgcarga;
   private double precosto;
   
   
   public lavadoraCl (String marca, String modelo, double garantia, double kgcarga, double precosto){
       super(marca,modelo,garantia);
       this.kgcarga = kgcarga;
     this.precosto = precosto;  
   }
   
 public void setkgcarga(double kgcarga){
    this.kgcarga = kgcarga;
}
    public double getKgcarga(){
    return this.kgcarga; 
    }  
    public void setPrecosto(double precosto){
    this.precosto = precosto;
}
    public double getPrecosto(){
    return this.precosto; 
    }  
   @Override
   public void mostrarCarac(){
       System.out.println ("Marca : "+getMarca());
        System.out.println ("Marca : "+getModelo());
        System.out.println ("Garantia en año : "+getGarantia());
       System.out.println("Kilos de carga "+getKgcarga()); 
       System.out.println("Kilos de carga "+getPrecosto());
   }
}
