
package aula23_02cadastro;

import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
        
        /*
        1)Desenvolva um software para cadastro de pessoas:
        -Ler nome;sobrenome e idade
        -Apresenta as informações na tela;
        
        */
     String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
     String sobrenome = JOptionPane.showInputDialog("Digite o seu Sobrenome: ");
     int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));
      
     //JOptionPane.showMessageDialog(null, "Nome Informado: "+nome);
     //JOptionPane.showMessageDialog(null, "Sobrenome Informado: "+sobrenome);
     //JOptionPane.showMessageDialog(null, "Idade Informada: "+idade);
     
     JOptionPane.showMessageDialog(null, "Nome Informado: "+nome+"\nSobrenome Informado: "+sobrenome+"\nIdade Informada: "+idade+"\nAperte no OK para confirmar");
     
    }
    
}
