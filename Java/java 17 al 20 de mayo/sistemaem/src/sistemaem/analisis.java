package sistemaem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hola
 */
public class analisis {
    private String ciudad;
    private String comuna;
    
  /*  public void setCiudad(String ciudadi);{
    this.ciudad=ciudadi; */
public void setCiudad(String ciudad){
    this.ciudad=ciudad;
}
public void setComuna(String comuna){
    this.comuna=comuna;
}
public String getCiudad(){
           return this.ciudad; }
public String getComuna(){
           return this.comuna; }
   


public analisis(String ciudad){
        
        if (ciudad.equals("SANTIAGO"))
            System.out.println("Es de la región metropolitana.");
        else
            System.out.println("No es de la región metropolitana.");
    }
    public int distanTraslado(String comuna){
        int min;
        if (comuna.equals("PROVIDENCIA")){
            min=30;
            return min;
        }
        else {
            min=90;
            return min;}          
    }
}