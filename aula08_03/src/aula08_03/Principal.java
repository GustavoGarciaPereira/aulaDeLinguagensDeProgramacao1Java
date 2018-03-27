
package aula08_03;

import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Dugite"));
        
        if(num == 3){
            System.out.println("Primeira");
        }else if(num>10){
            System.out.println("Segunda opção");
        }else{
           System.out.println("terceira opção");
        }
        
    }
    
}
