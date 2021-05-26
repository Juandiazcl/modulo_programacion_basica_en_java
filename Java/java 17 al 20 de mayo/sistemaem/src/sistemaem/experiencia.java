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
public class experiencia {
    private String profesion;
    private String especialidad;
    
   public void setProfesion(String prof){
    this.profesion=prof;  
   
}
   public String getProfesion(){
           return this.profesion; }
   
   public void setEspecialidad(String espec){
    this.especialidad=espec;  
}
   public String getEspecialidad(){
           return this.especialidad; }
   public void imprimirp(){
       System.out.println("La Profesion es "+getProfesion());
       System.out.println("La especialidad es "+getEspecialidad());
   }
           
}
