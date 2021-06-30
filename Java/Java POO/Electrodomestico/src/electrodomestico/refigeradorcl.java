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
public class refigeradorcl extends electrodomesticocl{
    private double gastoenergia;
   private double precosto;
   /*super(marca,modelo,garantia);*/
   
   public refigeradorcl (String marca, String modelo, double garantia, double gastoenergia, double precosto){
       super(marca,modelo,garantia);
       this.gastoenergia = gastoenergia;
     this.precosto = precosto;  
   }
   
 public void setGastoenergia(double gastoenergia){
    this.gastoenergia = gastoenergia;
}
    public double getGastoenergia(){
    return this.gastoenergia; 
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
       System.out.println("Kilos de carga "+getGastoenergia()); 
       System.out.println("Kilos de carga "+getPrecosto());
   }
}
