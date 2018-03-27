/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08_03;

import javax.swing.JOptionPane;

/**
 *
 * @author usrlab06
 */
public class Principal3 {
     public static void main(String[] args) {
     
         int num = Integer.parseInt(JOptionPane.showInputDialog("Digite"));
         int fat=1;
         while (num!=1) {
                
             fat*=(num--);
        //     --num;
             
         }
         
     
         //System.out.println("fat:"+fat);
         JOptionPane.showMessageDialog(null,fat);
     
   
     }
}
