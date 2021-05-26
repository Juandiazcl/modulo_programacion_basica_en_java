package clase2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hola
 */
public class TipoNum {
    float num;
    
    public float numValida(float a)
    {
        if (a>=0)
            System.out.println("Numero es positivo.");
        else
           System.out.println("Numero es negativo."); 
        return a;
    }
    }
