/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula22_02;

/**
 *
 * @author usrlab06
 */
public class Principal {
      
    public static void main(String[] args) {
        /*
        int x = 10,y = 3;
        double dolar = 3.3;
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(dolar);
        
        System.out.println("x : "+x);
        System.out.println("y : "+y);
        System.out.println("x + y = "+(x+y));
        
        System.out.println("-x : "+(-x));
        
        System.out.println("x + 1 : "+(++x));
        
        System.out.println("x / y : "+(x/y));
        
        */
        
        /*
        1)Decremento de um número inteiro;
        2)Troque para positivo um número inteiro negativo;
        3)Some dois números inteiros positivos e torne o resultado negativo;
        4)Exiba na tela o resultado dos quatro aperaçõs aritméticas entre dois
          números de tipo double;
        */
        
        int num = 10, num2 = 20;
        System.out.println("número inteiro: "+num);
        //1)
        System.out.println("número inteiro decrementado: "+(--num));
        
        
        //2)
        num = -num;
        System.out.println("-num: "+(num));
        
        //3)
        
        int soma = num2+num2;
        System.out.println("soma: "+(soma = -soma));
        
        //4)
        double a = 25,b = 35;
        System.out.println("\nSoma: a+b: "+(a+b)+"\nSubitração: a-b: "+(a-b)+"\nDivisão: a/b: "+(a/b)+"\nDivisão: a/b: "+(a/b)+"\nMultiplicação: a*b: "+(a*b));
        
        
        
        int c = 34,v = 23;
        System.out.println();
        
    }
    
}
