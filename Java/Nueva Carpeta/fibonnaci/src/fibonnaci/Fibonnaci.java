/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;

 /**
 * @author Hola[ **/
 public class Fibonnaci {
    
    public int tamaño;
    public String nombre;
 
    
    public Fibonnaci(String nombre, int tamaño){
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    Fibonnaci() {
        
    }

    
    public void mostrarSerie(){
        System.out.println(this.nombre+" de tamaño "+this.tamaño+":");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(fibonnaci(i)+" ");
        }
        System.out.println();
    }
    
    
    int fibonnaci(int n)
    {
        if (n>1){
           return fibonnaci(n-1) + fibonnaci(n-2); 
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1; 
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
  



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fibonnaci f1 = new Fibonnaci("fibonnaci 1",10); 
        f1.mostrarSerie();
        
        Fibonnaci f2 = new Fibonnaci();
        f2.setNombre("fibonnaci 2");
        f2.setTamaño(10);
        f2.mostrarSerie();
        
    }
 }