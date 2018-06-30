/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import javax.swing.JOptionPane;

/**
 * @author usrlab06
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float v1 = Float.parseFloat(JOptionPane.showInputDialog("Ingorme valor 1"));
        
        char operacao = (JOptionPane.showInputDialog("Operacao")).charAt(0);
        
        float v2 = Float.parseFloat(JOptionPane.showInputDialog("Ingorme valor 2"));
        
        Calculadora calculadora = new Calculadora();
        
        calculadora.calcular(v1,v2);
    
        calculadora.calcular(v1,operacao,v2);
        
        
        //calculadora.calcular(v1, v2);
        
        
    }
    
}
