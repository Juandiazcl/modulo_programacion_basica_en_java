/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Busquedabinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner leer=new Scanner(System.in);      
int b,j,k,i; 
k=0;
int v[] = new int [12];
for(i=0;i<12;i++){
v[i]=i*10;
System.out.println(v[i]);
}
System.out.println("ingrese numero a buscar ");
b=leer.nextInt();
i=0;
j=12-1;
do {
k=(i+j)/2;
if (v[k]<=b)
i=k+1;
if (v[k]>=b)
j=k-1;
} while (i<=j);
System.out.println("El elemento "+v[k]+" Posicion "+k);
    }
    
}
