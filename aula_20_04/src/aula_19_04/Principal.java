package aula_19_04;

import javax.swing.JOptionPane;

/*
Analise de requisitos

Metodilogia FDD

*/
public class Principal {
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        Contato contatos = new Contato();
        //menu.exibir();
        
        int t = 0;
        while(t==0){
            contatos.nome = JOptionPane.showInputDialog("Nome:");
            contatos.telefone = JOptionPane.showInputDialog("Telefone:");
            t = Integer.parseInt(JOptionPane.showInputDialog("0 para continuar gravando"));
            contatos.inserir();
        }
        
//        contatos.nome = JOptionPane.showInputDialog("Nome:");
//        contatos.telefone = JOptionPane.showInputDialog("Telefone:");
//        contatos.nome = "Gustavo";
//        contatos.telefone = "99999-90999";
//        
//        contatos.inserir();
//        
//        contatos.nome = "Garcia";
//        contatos.telefone = "44444-44444";
        
        contatos.inserir();
        JOptionPane.showMessageDialog(null,contatos.consulta("Gustavo"));
    }
    
}