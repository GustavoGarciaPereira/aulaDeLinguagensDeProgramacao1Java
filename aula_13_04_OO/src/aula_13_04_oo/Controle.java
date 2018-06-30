package aula_13_04_oo;

import javax.swing.JOptionPane;

public class Controle {

    public static void main(String[] args) {
        Saida saida = new Saida();
        
        //saida.exibir();
        
        
        
        
        Pessoa pessoa = new Pessoa();
        
        //pessoa.cidade = "sao";
        //pessoa.nome = "Gustavo";
        
        pessoa.cidade = JOptionPane.showInputDialog("Informe o Nome: ");
        pessoa.nome = JOptionPane.showInputDialog("Informe o Cidade: ");
        
        
        saida.exibir(pessoa.nome, pessoa.cidade);
        saida.exibir2(pessoa);
        
    }
    
}
