/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usrlab06
 */
public class Aula01_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* String s = "Pablo";
        String numero = "10";
        
        int num = 5;
        
        int valor = Integer.parseInt(numero);
        
        float preco = Float.parseFloat(numero);
        
        double total = Double.parseDouble(numero);
        
        String resultado = String.valueOf(num);
               resultado = num+"";
        
        
        System.out.println("valor: "+num);
        System.out.println("valor:"+valor);
        
        System.out.println("resultado :"+resultado);

*/
       
       //nome = entrada.nextLine();
       /*
        String descricao;
        
      
      
        
        System.out.println("programa de compras");
        
        
        
        
        descricao = JOptionPane.showInputDialog("Informe a Descricao");
        //JOptionPane.showMessageDialog(null, descricao);
        
                
        double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade do produto"));
       // JOptionPane.showMessageDialog(null, quantidade);
        
        
        double unidade = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitario/kg"));
        
        
      //  JOptionPane.showMessageDialog(null, unidade);
        
        double valorTo = quantidade*unidade;
        
        String resultado = String.valueOf(valorTo)+"";
               //resultado = valorTo+"";
               
        JOptionPane.showMessageDialog(null,"Descrição: "+descricao+
                "\nquantidade: "+quantidade+
                "\nvalor unitario: "+unidade+
                "\nvalor da compra: "+valorTo);
        
        
        */
        
        int matri[][] = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matri[i][j] = j*i;    
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("matri[i][j] = "+i+","+j+" = "+matri[i][j]);    
            }
        }
    
        
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int [5];
        int maior;
        int menor;
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("informe os numeros no vetor");
            vetor[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("informe os numeros no vetor"+vetor[i]);
            
        }
        
    }
    
    
    
    
}
