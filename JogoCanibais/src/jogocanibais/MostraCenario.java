/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogocanibais;

import javax.swing.JOptionPane;

/**
 *
 * @author usrlab06
 */
public class MostraCenario {
    int lado1[][] = new int[1][2];
    int lado2[][] = new int[1][2];
    
    public void iniciarCenario(){
        
        lado1[0][0] = 3; //mi
        lado1[0][1] = 3; //ca
        
        lado2[0][0] = 0; 
        lado2[0][1] = 0;
        
//        if(lado2[0][0]<lado2[0][1] || lado1[0][0]<lado1[0][1]){
//            System.out.println("fim");
//        }
        
    }
    
    public void mostrarCenario(){
        System.out.print("Margem um:   ");
        for(int i=0;i<1;i++){
            for(int j=0;j<2;j++){
            
                System.out.print(" " +lado1[i][j]);
            }
            
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~");
        
        System.out.print("Margem dois: ");
        for(int i=0;i<1;i++){
            for(int j=0;j<2;j++){
            
                System.out.print(" " +lado2[i][j]);
            }
            
        }
        System.out.println("");   
    }
    
    public void validarJogada(){
        
        int m = Integer.parseInt(JOptionPane.showInputDialog("Mover M"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Mover C"));
        
        if(m+c==2){
            realizaJodada(m,c);
        }else{
            System.out.println("Nao Valida");
        }
        
        
                        
        
    }
    
    public void realizaJodada(int m, int c){
        lado1[0][0] = lado1[0][0]-m; //mi
        lado1[0][1] = lado1[0][1]-c; //ca
        
        lado2[0][0] = lado2[0][0]+m; //mi
        lado2[0][1] = lado2[0][1]+c; //ca
    
    }
    
    
}
