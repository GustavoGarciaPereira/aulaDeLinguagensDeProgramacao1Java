/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_11_05polimorfismosobrecarga;

import javax.swing.JOptionPane;

/**
 *
 * @author usrlab06
 */
public class Mensagem {
    public void exibirMensagem(){
        System.out.println("Bem - Vindo!!");
    }
    public void exibirMensagem(String nome){
        System.out.println("Bem - Vindo "+nome);
    }
    public void exibirMensagem(String nome,int idade){
        JOptionPane.showMessageDialog(null,"Bem-vindo "+nome+"\nSua idade "+idade);
    }
    
    public void exibirMensagem(int idade,String nome){
        JOptionPane.showMessageDialog(null,"Bem-vindo2 "+nome+"\nSua idade "+idade);
    }
}
