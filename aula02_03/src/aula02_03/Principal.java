/*
 * 1)Desenvolva um software para catalogacao para jogadores games players

requisitos
->Solicitar a quantidade de jogadores a serem catalogados;
->Catalogador os jogadores com as seguintes informacoes
E)->nome do jogador
E)->novel de experiência(1-iniciante, 2-intermediario, 3-avansado)
E)->solicitar a pontiacao

P)->Atribuir um bôns ao jogador(Cálculo:Nível de experiência dele * pontuação)
S)->Exibir os dados de todos os jogadores na tela;


*/
package aula02_03;

import javax.swing.JOptionPane;

/**
 *
 * @author usrlab06
 */
public class Principal {

    public static void main(String[] args) {
        
        int numero_jogadors;
        
        String nome;               
        
        JOptionPane.showMessageDialog(null,"Programa para catalogar os jogadores");
        
       
        numero_jogadors = Integer.parseInt((JOptionPane.showInputDialog(null,"Informe a quantidade de jogados")));
        String matriz[][] = new String[numero_jogadors][4];
        
        
        
        // nome 
        
        //matriz[0][1] = "dfadfad"
        //matriz[0][2] = "1"
        //matriz[0][3] = "56"
                
        //matriz[1][1] = "dfadfad"
        //matriz[1][2] = "1"
        //matriz[1][3] = "56"
                
      //  
        
        for (int i = 0; i < numero_jogadors; i++) {
            matriz[i][0] = JOptionPane.showInputDialog("informar os nome: ");
            matriz[i][1] = JOptionPane.showInputDialog("nivel de experiencia 1-Inciante 2-intermediario 3-avansado");
            matriz[i][2] = JOptionPane.showInputDialog("pontuacao do jogador");
            matriz[i][3] = Integer.parseInt(matriz[i][1]) * Integer.parseInt(matriz[i][2])+""; 
            
           // matriz[3][numero_jogadors] = JOptionPane.showInputDialog(null,"");
        }
        
        for (int i = 0; i < numero_jogadors; i++) {
            JOptionPane.showMessageDialog(null,"Nome: "+matriz[i][0]+"\nNivel: "+matriz[i][1]+"\nPontuação: "+matriz[i][2]+"\nBons: "+matriz[i][3]);
            
            
           // matriz[3][numero_jogadors] = JOptionPane.showInputDialog(null,"");
        }
        
    }
    
}
