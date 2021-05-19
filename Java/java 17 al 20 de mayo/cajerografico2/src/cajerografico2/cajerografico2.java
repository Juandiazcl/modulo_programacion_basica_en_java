import javax.swing.JOptionPane;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author Madeus
*/
public class cajerografico2 {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here

int continuar=0;
while(continuar==0){

int saldo = 6500;
int seleccion = JOptionPane.showOptionDialog(
null,
"Que operacion desea realizar?",
"Red de cajeros Trencitobank",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null, // null para icono por defecto.
new Object[] { "Consulta Saldo", "Deposito", "Giro" }, // null para YES, NO y CANCEL
"Consulta Saldo");

switch(seleccion){
case 0:
JOptionPane.showMessageDialog(
null,
"su saldo es $"+saldo);
break;
case 1:
String montoDeposito = JOptionPane.showInputDialog(
null,
"ingrese el monto que desea depositar",
JOptionPane.QUESTION_MESSAGE); // el icono sera un iterrogante
int montoInt = Integer.parseInt(montoDeposito);

JOptionPane.showMessageDialog(
null,
"usted ha depositado $"+montoDeposito + " su nuevo saldo es $" + (montoInt+saldo) );
break;
case 2:
String montoGiro = JOptionPane.showInputDialog(
null,
"su saldo es " + saldo + " ingrese el monto que desea retirar",
JOptionPane.QUESTION_MESSAGE); // el icono sera un iterrogante
int montoGiroInt = Integer.parseInt(montoGiro);
JOptionPane.showMessageDialog(
null,
"usted ha retirado $"+montoGiro + " su nuevo saldo es $" + (saldo-montoGiroInt) );
break;
}
continuar = JOptionPane.showOptionDialog(
null,
"Desea realizar otra operacion?",
"Red de cajeros Trencitobank",
JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE,
null, // null para icono por defecto.
new Object[] { "Si", "No" }, // null para YES, NO y CANCEL
"No");
}
}

}
