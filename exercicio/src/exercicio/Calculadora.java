/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author usrlab06
 */
public class Calculadora {
    public void calcular(float v1,float v2){
        System.out.println(v1+" + "+v2+" = "+(v1+v2));
        System.out.println(v1+"\n - "+v2+" = "+(v1-v2));
        System.out.println(v1+"\n * "+v2+" = "+(v1*v2));
        System.out.println(v1+"\n / "+v2+" = "+(v1/v2));
    }
    
    public void calcular(float v1,char po,float v2){
        
        switch(po){
            case '+':
                System.out.println(v1+" + "+v2+" = "+(v1+v2));
                break;
            default:
                System.out.println("operacao imvalida\n");
        }
       
    }
}
