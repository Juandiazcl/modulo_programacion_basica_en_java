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
public class Empleado extends Persona {
    private String empresa   ;
    private double sueldo;

public void setEmpresa(String empresa){
    this.empresa = empresa;
}
    public String getEmpresa(){
    return this.empresa; 
}
    public void setSueldo(double sueldo){
    this.sueldo = sueldo;
}
    public double getSueldo(){
    return this.sueldo; 
}   
    
    public Empleado(String nombre, boolean sexo, double edad, String empresa, double sueldo ) {
     super(nombre,sexo,edad);
     this.empresa = empresa;
     this.sueldo = sueldo;
     
     
}
    public void mostrarDatos()
    {
        System.out.println ("Marca : "+getNombre());
        System.out.println ("Marca : "+getSexo());
        System.out.println ("Garantia en año : "+getEdad());
        System.out.println ("Empresa : "+getEmpresa());
        System.out.println ("Sueldo : "+getSueldo());
        
    }
    
}
