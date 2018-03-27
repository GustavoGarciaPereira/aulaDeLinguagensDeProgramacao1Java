/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08_03;

import javax.swing.JOptionPane;

/**
 *
 * @author usrlab06
 */
public class Principal2 {
    
    public static void main(String[] args) {
    //int num = Integer.parseInt(JOptionPane.showInputDialog("Digite"));
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite"));
    char num3 = JOptionPane.showInputDialog("Sinal").charAt(0);
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite"));
    
    /*
    switch(num){
        case 3:{
            System.out.println("Primeira");
            break;
        }
        case 10:{
            System.out.println("Segunda opção");
            break;
        }
        default:{
            System.out.println("Terceira opção");
            break;
        }
    */
        
        
     switch(num3){
        case '+':{
            
            System.out.println(num1+" + "+num2+" = "+(num1+num2));
            break;
        }
        case '-':{
            System.out.println(""+(num1-num2));
            JOptionPane.showMessageDialog(null,num1+" - "+num2+" = "+(num1-num2));
            break;
        }
        case '*':{
            System.out.println(""+(num1*num2));
            break;
        }
        case '/':{
            System.out.println(""+(num1/num2));
            break;
        }
        default:{
            System.out.println("você não digitou uma opração da matematica");
            break;
        }
    }
}
}