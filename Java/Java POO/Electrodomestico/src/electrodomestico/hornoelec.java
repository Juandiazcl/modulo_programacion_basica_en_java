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
public class hornoelec extends electrodomesticocl{
private double btuCalor;
   private double precosto;
   
   
   public hornoelec (String marca, String modelo, double garantia, double btuCalor, double precosto){
       super(marca,modelo,garantia);
       this.btuCalor = btuCalor;
     this.precosto = precosto;  
   }
   
 public void setbtuCalor(double btuCalor){
    this.btuCalor = btuCalor;
}
    public double getbtuCalor(){
    return this.btuCalor; 
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
       System.out.println("Btu de Calor "+getbtuCalor()); 
       System.out.println("Precio de Costo "+getPrecosto());
   }
   public double calcularPrevta (double porcUtilidad)
           {
               return getPrecosto()*(1+(porcUtilidad*0.01));
           }
}
