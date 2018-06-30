
package jogocanibais;

import javax.swing.JOptionPane;

/**
 * @author usrlab06
 */
public class Principais {
   
    public static void main(String[] args) {
        menu();
    }
    
    public static int menu(){
        int op;
        MostraCenario cenario = new MostraCenario();
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("==========Missionarios e Canibais==========\n"
                    + "Jogar(1)\n"
                    + "Sair(2)"));
            switch(op){
                case 1:{
                    cenario.iniciarCenario();
                    do{
                    
                    cenario.mostrarCenario();
                    cenario.validarJogada();
                    //cenario.mostrarCenario();
                    }while(cenario.jogando==true);
                    break;
                }
                case 2:{
                    System.exit(0);
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null,"Opção Invalida\n");
                }
            }
            op=menu();
        }while(op!=2);
        return 1;
    }
}
