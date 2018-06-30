/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_04_05;

import javafx.scene.AccessibleRole;
import javax.swing.JOptionPane;

/**
 *
 * @author usrlab06
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        //Arquivo arquivo = new Arquivo();
        
        while(true){
            
            switch(menu()){
                case 1:
                    JOptionPane.showMessageDialog(null, "Cadastrar:\n ");
                    paciente.nome = JOptionPane.showInputDialog("Informe o nome: ");
                    paciente.genero = (JOptionPane.showInputDialog("Sexo M/F: ")).charAt(0);
                    paciente.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
                    paciente.altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
                    paciente.peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso: "));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Consultar:\n ");
                    paciente.nome = JOptionPane.showInputDialog("Informe o nome para consulta: ");
                    paciente.genero = (JOptionPane.showInputDialog("Sexo M/F: ")).charAt(0);
                    paciente.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
                    paciente.altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura: "));
                    paciente.peso = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso: "));
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida ");
            }
            
        
        
        
        }
    }
    static int menu(){

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("(1)Cadastrar:\n (2)Consulta:\n"));
        
    
    return opcao;
    }
    
}
