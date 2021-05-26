package sistemaem;


import java.util.Scanner;

/**
 *
 * @author Juan Diaz
 */
public class cargadatos {
    private String nombre;
    private String rut;
    private Scanner leer;
    private int edad;
    
    public void setNombre(String nombre){
    this.nombre=nombre;
}
public void setRut(String rut){
    this.rut=rut;
}
public void setEdad(int edad){
    this.edad=edad;
}
public String getNombre(){
           return this.nombre; }
public String getRut(){
           return this.rut; }
public int getEdad(){
           return this.edad; 
}
    public void cargadatosf(){
        String _nombre,_rut;
        int _edad;
       leer=new Scanner(System.in); 
        System.out.println ("Ingrese nombre ");
        _nombre=leer.next();
        setNombre(_nombre);
        System.out.println ("Ingrese Rut ");
        _rut=leer.next();
        setRut(_rut);
        System.out.println ("Ingrese Edad ");
        _edad=leer.nextInt();
        setEdad(_edad);
    }
    public void imprimir(){
        System.out.println ("Ficha:");
        System.out.println ("Nombre "+getNombre());
        System.out.println ("Ingrese Rut "+getRut());
        System.out.println ("Ingrese Edad "+getEdad());  
    }
    }
