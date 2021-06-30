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
public abstract class Persona {
 private String nombre   ;
    private boolean sexo;
    private double edad;

public void setNombre(String nombre){
    this.nombre = nombre;
}
    public String getNombre(){
    return this.nombre; 
}
    public void setSexo(boolean sexo){
    this.sexo = sexo;
}
    public boolean getSexo(){
    return this.sexo; 
}   
    public void setEdad(double edad){
    this.edad = edad;
}
    public double getEdad(){
    return this.edad; 
    }  
    
    public Persona(String nombre, boolean sexo, double edad) {
    this.nombre = nombre;
     this.sexo = sexo;
     this.edad = edad;
     
     
}
    public void mostrarDatos()
    {
        System.out.println ("Marca : "+getNombre());
        System.out.println ("Marca : "+getSexo());
        System.out.println ("Garantia en año : "+getEdad());
        
    }   
}
