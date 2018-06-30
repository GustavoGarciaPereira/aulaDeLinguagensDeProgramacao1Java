/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27_04;

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
        Arquivo arquivo = new Arquivo();
        
        int i = menu();
        while(i!=3){
            
            if(i==1){
                paciente.nome = JOptionPane.showInputDialog("Infome seu nome: ");
                paciente.altura = Float.parseFloat(JOptionPane.showInputDialog("informe sua altura: "));
                paciente.idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade: "));
                paciente.genero = JOptionPane.showInputDialog("Genero M/F: ").charAt(0);
                paciente.peso = Float.parseFloat(JOptionPane.showInputDialog("informe seu peso: "));
                arquivo.inserir(paciente);
            }else if(i==2){
                String nome = JOptionPane.showInputDialog("Informe seu nome para pesquisa: ");
                JOptionPane.showMessageDialog(null,arquivo.consulta(nome));
            
            
            }
         i = menu();
        }
        
    }
    
    public static int menu(){
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar:\n2- Consultar:\n3- Sair"));
        return op;
    }
    
}
