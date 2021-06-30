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
public class registrocivil extends Persona {
    private String nacion   ;
    private String rut;

public void setNacion(String C){
    this.nacion = nacion;
}
    public String getNacion(){
    return this.nacion; 
}
    public void setRut(String rut){
    this.rut = rut;
}
    public String getRut(){
    return this.rut; 
}   
    
    public registrocivil(String nombre, boolean sexo, double edad, String nacion, String rut ) {
     super(nombre,sexo,edad);
     this.nacion = nacion;
     this.rut = rut;
     
     
}
    public void mostrarDatos()
    {
        System.out.println ("Marca : "+getNombre());
        System.out.println ("Marca : "+getSexo());
        System.out.println ("Garantia en año : "+getEdad());
        System.out.println ("nacionalidad : "+getNacion());
        System.out.println ("Rut : "+getRut());
        
    }
}