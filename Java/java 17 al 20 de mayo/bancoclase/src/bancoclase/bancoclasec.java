/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoclase;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class bancoclasec {
    private String nombre;
    private String cuenta;
    private double saldo;
    
    public void setNombre(String nombre){
    this.nombre = nombre;
}
    public String getNombre(){
    return this.nombre; 
}
    public void setCuenta(String cuenta){
    this.cuenta = cuenta;
}
    public String getCuenta(){
    return this.cuenta; 
}
    public void setSaldo(double saldo){
    this.saldo = saldo;
}
    public double getSaldo(){
    return this.saldo; 
}
    public bancoclasec(String nombre, String cuenta, double saldo)
    {
     this.nombre=nombre;
     this.cuenta=cuenta;
     this.saldo=saldo;
     
    }
    public double deposito (double saldo)
    {
    double aux,sf;
    Scanner leer2;
    leer2=new Scanner(System.in); 
    sf=saldo;
        System.out.println("Ingrese monto del deposito:");
        aux=leer2.nextDouble();
        if(aux<=0)
            System.out.println("Monto menor a 0");
        else
            sf=saldo+aux;
    return sf;   
    }
    public double giro (double saldo)
    {
    double aux,sf;
    Scanner leer2;
    leer2 = new Scanner(System.in); 
        sf=saldo;
        System.out.println("Ingrese monto del giro:");
        aux=leer2.nextDouble();
        if(aux<=0)
            System.out.println("Monto menor a 0");
        if (saldo<aux)
             System.out.println("Saldo insuficiente");
        else {  
        sf=saldo-aux;
        }
       
    return sf;   
    }
   public double transferir (double saldo)
    {
    String _nombre,_cuenta;    
    double aux,sf;
    Scanner leer2;
    leer2 = new Scanner(System.in); 
        sf=saldo;
        System.out.println ("Ingrese Datos de Transferencia ");
        System.out.println ("Ingrese nombre ");
        _nombre=leer2.next();
        System.out.println ("Ingrese Cuenta ");
        _cuenta=leer2.next();
         System.out.println("Ingrese monto:");
        aux=leer2.nextDouble();
        if(aux<=0)
            System.out.println("Monto menor a 0");
        if (saldo<aux) 
             System.out.println("Saldo insuficiente");
        else 
          sf=saldo-aux; 
    return sf;   
    } 
}
