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
    String ciudad;
    String comuna;
    
  /*  public void setCiudad(String ciudadi);{
    this.ciudad=ciudadi;
}*/
    public analisis(String ciudadi, String comunai){
        this.ciudad=ciudadi;
        this.comuna=comunai;
        if (this.ciudad=="SANTIAGO")
            System.out.println("Es de la región metropolitana.");
        else
            System.out.println("No es de la región metropolitana.");
    }
  
    
}
