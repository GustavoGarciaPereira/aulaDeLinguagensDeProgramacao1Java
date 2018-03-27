package aula23_02;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
     
      
      /*
        System.out.println("Digite o seu nome: ");
        
        Scanner scanner = new Scanner(System.in);
        
        String nome = scanner.nextLine();
        System.out.println("Seja bem vindo senhor "+nome);
     */
      
      String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
      //System.out.println("Seja bem vindo senhor "+nome);
     
      
      JOptionPane.showMessageDialog(null, "o nome é: "+nome);
      
    }
    
}
