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
    
    boolean flag = false;
    boolean jogando = true;
    int lado1[][] = new int[1][2];
    int lado2[][] = new int[1][2];
    
    public void iniciarCenario(){
        
        lado1[0][0] = 3; //mi
        lado1[0][1] = 3; //ca
        
        lado2[0][0] = 0; 
        lado2[0][1] = 0;
        
//        
        
    }
    
    public void mostrarCenario(){
       // System.out.print("Margem um:   ");
        //for(int i=0;i<1;i++){
           // for(int j=0;j<2;j++){
            
         //       System.out.print(" " +lado1[i][j]);
        
        JOptionPane.showMessageDialog(null,"Margem um:> "+lado1[0][0]+" M "+lado1[0][1]+" C "
                +"\n\n"+"Margem dois:> "+lado2[0][0]+" M "+lado2[0][1]+" C ");
          //  }
            
      //  }
      //  System.out.println("");
      //  System.out.println("~~~~~~~~~~~~");
     ///   System.out.println("~~~~~~~~~~~~");
     //   System.out.println("~~~~~~~~~~~~");
   // /    
        //System.out.print("Margem dois: ");
        //for(int i=0;i<1;i++){
            //for(int j=0;j<2;j++){
            
                //System.out.print(" " +lado2[i][j]);
            //}
            
        //}
        //System.out.println("");   
    }
    
    public void validarJogada(){
        
        int m = Integer.parseInt(JOptionPane.showInputDialog("Mover M"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Mover C"));
        
        if(flag==false){//vou mover para direita
            realizaJogadaDireita(m, c);
            if((lado1[0][0]<lado1[0][1] && lado1[0][0]!=0) ||(lado2[0][0]<lado2[0][1] && lado2[0][0]!=0)){
                System.out.println("Perdeu!!");
                jogando=false;
            }
            flag=true;
        }else{//vou mover para a esquerda
            realizaJogadaEsquerda(m, c);
            if((lado1[0][0]<lado1[0][1] && lado1[0][0]!=0)||(lado2[0][0]<lado2[0][1] && lado2[0][0]!=0)){
                System.out.println("Perdeu!!");
                jogando=false;
            }
            flag=false;
        }
       
        
//        if((lado1[0][0]<lado1[0][1] && lado1[0][0]!=0) ||(lado2[0][0]<lado2[0][1] && lado2[0][0]!=0)){
//                    System.out.println("Perdeu!!");
//                    System.exit(0);
//                    jogando=false;
//                }
//        
       
        if(lado1[0][0]==0 && lado1[0][1]==0){
            JOptionPane.showMessageDialog(null,"Voce Ganhou !!");
            jogando=false;
        }
                         
    }
    
    public void realizaJogadaDireita(int m, int c){
        JOptionPane.showMessageDialog(null,"Esquerda para Direita");
        
            lado1[0][0] = lado1[0][0]-m; //m
            lado1[0][1] = lado1[0][1]-c; //ca

            lado2[0][0] = lado2[0][0]+m; //mi
            lado2[0][1] = lado2[0][1]+c; //ca
   
    }
    public void realizaJogadaEsquerda(int m, int c){
        JOptionPane.showMessageDialog(null,"Direita para Esquerda");
        
        
            lado1[0][0] = lado1[0][0]+m; //mi
            lado1[0][1] = lado1[0][1]+c; //ca

            lado2[0][0] = lado2[0][0]-m; //mi
            lado2[0][1] = lado2[0][1]-c; //ca
           
    }
    
    
}
