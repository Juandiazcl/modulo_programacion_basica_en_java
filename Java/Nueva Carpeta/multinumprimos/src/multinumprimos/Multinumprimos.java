/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multinumprimos;

import java.util.Scanner;

/**
 *
 * @author Hola
 */
public class Multinumprimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

/*int num, i, multi = 1;
Scanner iN = new Scanner(System.in);

System.out.println("Multiplo Primo ciclo For");

System.out.println("Ingrese numero mayor a 0; ");
num = iN.nextInt();

for(i = 2; i < num; i++){
if (num % i == 0){
multi=multi*i;
System.out.println(i);
}
}
System.out.println("Los multiplicacion de primos es: " + multi); */


        // TODO code application logic here
        Scanner leer2=new Scanner(System.in); 
        int i,contador;
        float num,promedio;
        promedio=1;
        contador=2;
        boolean primo=true;
        i=2;
        System.out.println ("Ingresar cantidad de numero a analizar: (rango)  ");
        num=leer2.nextFloat();
  do {
     while ((primo) && (contador!=i)){
  if (i % contador == 0 && i!=num && i!=1){
    primo = false;   
  }
  contador++;  
}
     System.out.println (primo);
     
        if (primo== true){
            promedio=promedio*i;
           System.out.println (i); 
           contador=2;
           
        }
        else
        {
            primo= true;
        }
      i +=1;
  }
              while (i<=num);
          System.out.println ("Multiplicacion de num. primos : "+promedio);
    }
    
}
