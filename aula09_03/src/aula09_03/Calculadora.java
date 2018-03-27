/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09_03;
import javax.swing.JOptionPane;
/**
 *
 * @author usrlab06
 */
public class Calculadora {
    
    public static void main(String[] args) {
    //int num = Integer.parseInt(JOptionPane.showInputDialog("Digite"));
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite"));
    char sinal = JOptionPane.showInputDialog("Sinal").charAt(0);
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite"));
    
    calcular(num1,sinal,num2);
        
        
     
}
    
    
    
    
    
    
    public static void calcular(int num1, char sinal,int num2 ){
    
       switch(sinal){
        case '+':{
            JOptionPane.showMessageDialog(null,num1+" - "+num2+" = "+adicao(num1,num2));
            //System.out.println(num1+" + "+num2+" = "+adicao(num1,num2));
            break;
        }
        case '-':{
            //System.out.println(""+(num1-num2));
            JOptionPane.showMessageDialog(null,num1+" - "+num2+" = "+subitracao(num1,num2));
            break;
        }
        case '*':{
            //System.out.println(""+multiplicacao(num1,num2));
            break;
        }
        case '/':{
            //System.out.println(""+divisao(num1,num2));
            JOptionPane.showMessageDialog(null,num1+" / "+num2+" = "+divisao(num1,num2));
            break;
        }
        default:{
            System.out.println("você não digitou uma opração da matematica");
            break;
        }
    } 
        
        
    }
    
    public static int adicao(int num1,int num2){
        int s;
        s = num1+num2;
        
    return s;
    }
    public static int subitracao(int num1,int num2){
    int s;
        s = num1-num2;
        
    return s;
    
    }
    static int multiplicacao(int num1,int num2){
    
    int s;
        s = num1+num2;
        
    return s;
    }
    public static int divisao(int num1,int num2){
    int s;
        s = num1/num2;
        
    return s;
    
    }
    
    
}