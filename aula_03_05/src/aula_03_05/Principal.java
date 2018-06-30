package aula_03_05;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author usrlab06
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Admin admin = new Admin();
        Convidado convidado = new Convidado();
        
        admin.nome = JOptionPane.showInputDialog("Informe nome: ");
        admin.senha = JOptionPane.showInputDialog("Informe senha: ");
        admin.nivelAcesso = Integer.parseInt(JOptionPane.showInputDialog("Informe nivel de Acesso: "));
        
        //admin.loga();
        if(admin.login(admin.nome, admin.senha)){
            System.out.println("Ok!!");
        }else{
            System.out.println("Falha!!");
        }
        
        
        convidado.nome = JOptionPane.showInputDialog("Informe nome: ");
        convidado.senha = JOptionPane.showInputDialog("Informe senha: ");
        convidado.setor = JOptionPane.showInputDialog("Informe nivel de Acesso:");
    }
    
}
