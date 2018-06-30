/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_11_05;

import javax.swing.JOptionPane;

/**
 *
 * @author usrlab06
 */
public class MensagemGrafica extends Mensagem{
    @Override
    public void exibirMensagem(){
        JOptionPane.showMessageDialog(null,"Bem-Vindo!! De novo");
    }
}
