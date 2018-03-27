package aula09_03;

import javax.swing.JOptionPane;

/**
 *
 * @author usrlab06
 */
public class Principal {

   public static void main(String[] args) {

       
        //JOptionPane.showMessageDialog(null, "d = "+mais(4));
        String nome = JOptionPane.showInputDialog("informe o nome");
        exibirNome(nome); 
    }

 static int mais(int i){
   
    i*=i;
 return i;
 }
 public static void exibirNome(String nome){
   
    //JOptionPane.showMessageDialog(null, "Meu nome não é Jhony");
    JOptionPane.showMessageDialog(null, "Meu nome não é "+nome);
       
 
 }


}
