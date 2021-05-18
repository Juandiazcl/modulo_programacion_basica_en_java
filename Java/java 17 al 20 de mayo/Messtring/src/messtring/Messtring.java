/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messtring;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Messtring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer2=new Scanner(System.in); 
        int i,num;
        String mess;
        mess=" ";
        System.out.println ("Leer numero de mes:  ");
        num=leer2.nextInt();
        switch (num) {
                    case 1:
                    mess="Enero";
                    break;
                    case 2:
                    mess="febrero";
                    break;
                    case 3:
                    mess="marzo";
                    break; 
                    case 4:
                    mess="Abril";
                    break;
                    case 5:
                    mess="mayo";
                    break;
                    case 6:
                    mess="junio";
                    break; 
                    case 7:
                    mess="julio";
                    break;
                    case 8:
                    mess="agosto";
                    break;
                    case 9:
                    mess="septiembre";
                    break; 
                    case 10:
                    mess="octubre";
                    break;
                    case 11:
                    mess="noviembre";
                    break;
                    case 12:
                    mess="diciembre";
                    break; 
                    default:
                        mess="no valido";
                    break; 
    }
        System.out.println ("Mes ingresado:  "+mess);
    }
    
}
