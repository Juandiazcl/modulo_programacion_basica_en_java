/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudadanocl;

/**
 *
 * @author Hola
 */
public class Padre extends Persona {
    private boolean soypadre;
    private double canthijos;

public void setSoypadre(boolean soypadre){
    this.soypadre = soypadre;
}
    public boolean getSoypadre(){
    return this.soypadre; 
}
    public void setCanthijos(double canthijos){
    this.canthijos = canthijos;
}
    public double getCanthijos(){
    return this.canthijos; 
}   
    
    public Padre(String nombre, boolean sexo, double edad, boolean soypadre, double canthijos){
     super(nombre,sexo,edad);
     this.soypadre = soypadre;
     this.canthijos = canthijos;
     
     
}
    @Override
    public void mostrarDatos()
    {
        System.out.println ("Marca : "+getNombre());
        System.out.println ("Marca : "+getSexo());
        System.out.println ("Garantia en año : "+getEdad());
        System.out.println ("Soy Padre (T/F): "+getSoypadre());
        System.out.println ("Num. Hijos : "+getCanthijos());
        
    }
    
}
