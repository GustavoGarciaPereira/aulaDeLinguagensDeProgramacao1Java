/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula22_03;

import javax.swing.JOptionPane;

/**
 *
 * @author usrlab06
 */
public class email {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Informe seu email");
        
        JOptionPane.showMessageDialog(null,"Nome: "+email.substring(0,email.indexOf('@')));
        
        //String dominio = email.substring(email.indexOf('@'),email.length());
        String dominio = email.substring(email.indexOf('@')+1,email.length());
        
        JOptionPane.showMessageDialog(null,"Dominio: "+dominio);
        
        JOptionPane.showMessageDialog(null,"Provedor: "+dominio.substring(0,dominio.indexOf('.')));
        
    }
}
