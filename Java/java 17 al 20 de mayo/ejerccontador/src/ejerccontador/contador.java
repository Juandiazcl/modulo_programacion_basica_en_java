package ejerccontador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hola
 */
public class contador {
 private int cont; 
 
 public void setCont(int cont){
if(cont>=0){
this.cont = cont;
}else{
this.cont = 0;
}
   }
    public int getCont(){
           return this.cont; 
}
public contador(int cont) {
 
if(cont>=0){
this.cont = cont;
}else{
this.cont = 0;
}
    System.out.println("p "+this.cont);
}

public int incrementar(){
return getCont()+1;
}
public int decrementar(){
    int ax;
    ax=getCont()-1;
   /* System.out.println("dec"+ax+" vv"+getCont()); */
 if(ax<0)
 ax = 0;
 return ax;
}

}
