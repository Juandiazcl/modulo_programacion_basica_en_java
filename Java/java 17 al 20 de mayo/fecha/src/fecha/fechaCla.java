/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

/**
 *
 * @author Hola
 */
public class fechaCla {
    private int dia;
    private int mes;
    private int an;
    public void setDia(int dia){
this.dia = dia;
}
    public int getDia(){
           return this.dia; 
}
    public void setMes(int mes){
this.mes = mes;
}
    public int getMes(){
           return this.mes; 
}
    public void setAn(int an){
this.an = an;
}
    public int getAn(){
           return this.an; 
}
    public fechaCla(int dia, int mes, int an)
    {
     this.dia=dia;
     this.mes=mes;
     this.an=an;
    }
    public boolean fechaCorrecta (int dia, int mes, int an){
        boolean v,abi;
        v=false;
        int diaf;
        abi=EsBisiesto(an);
        if (abi)
            diaf=29;
         else
            diaf=28;
            
        System.out.println("dIA "+dia+mes+an+v);
        if (mes==2){
            if (dia>diaf || dia<=0)
            v= false;
            else
            v=true;
        }
        else{
                if (mes==4 || mes==6 || mes==9 || mes==11){ 
                   if (dia>30 || dia<=0)
                          v= false;
                   else
                       v=true;
                    }
                   else {
                       if (dia>31 || dia<=0)
                       v = false;
                       else
                      v= true;  
                     }   
        }
         System.out.println("b1  "+v);
        if (v){
         if (mes>12 || mes<=0)
                        v=false;
                     else{
                          if (an<=0)
                             v=false;
                               else
                             v=true;
                       }
        }
        System.out.println(v);
        return v;
     } 
    public void diaSiguiente(int dia, int mes, int an){
        boolean vn,abi;
        int diax,mesx,anx,diaf;
        diax=dia;
        mesx=mes;
        anx=an;
        vn=fechaCorrecta(dia,mes,an);
        abi=EsBisiesto(anx);
        if (abi)
            diaf=29;
         else
            diaf=28;
        if (vn)
        {
            if (mesx==2 && diax==diaf)
            {
                diax=0;
                mesx=3;
            }
            else{
               if (mesx==4 || mesx==6 || mesx==9 || mesx==11 ){
                   if (diax==30){
                   diax=0;
                   mesx=mesx+1;
                   }
               }
               else
                   {
                       if (diax==31)
                       {
                           if (mesx==12){
                                diax=0;
                                mesx=1;
                                anx=anx+1;
                           }
                           else{
                       diax=1;
                       mesx=mesx+1;
                                   }
                       }
                   }
                   
            }
        }   
        if (vn){
        diax=diax+1;
        System.out.println("EL Dia siguiente es "+diax+"/"+mesx+"/"+anx);
        }
        else
            System.out.println("Fecha incorrecta. ");
                
    }
 public boolean EsBisiesto(int an){
boolean aux;
     System.out.println("Año es bisiesto()"+an);
if (an%4==0 && an%100!=0)
aux=true;
else
aux=false;
return aux;
}
}
    

