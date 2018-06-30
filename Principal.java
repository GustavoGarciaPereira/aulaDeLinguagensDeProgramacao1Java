package sorteio;
import java.util.Random;
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int sorteio, tentativa = 0;
        boolean parada = false;//adicionei
       
        Random geraTentativas = new Random();
        sorteio = geraTentativas.nextInt(4)+1;
        do{
            
            String numero1  = JOptionPane.showInputDialog("Escolha o copo que vocês acha que está a moeda\ncopo - 1\ncopo - 2\ncopo - 3\ncopo - 4\ncopo - 5\ncopo - 6\ncopo - 7\ncopo - 8\ncopo - 9\ncopo - 10\ncopo - 11\ncopo - 12\ncopo - 13\ncopo - 14\ncopo - 15\ncopo - 16\ncopo - 17\ncopo - 18\ncopo - 19\ncopo - 20");
            JOptionPane.showMessageDialog(null, "Número de tentativas: " + tentativa);
           
            tentativa++;
            
           parada = sorteiComDicas(Integer.parseInt(numero1),sorteio, tentativa);
        }while (tentativa < 6 && parada);

    }
    
    public static boolean /*<-adicionei*/sorteiComDicas(int numero1, int numero2, int tentativa){
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "Está mais a esquerda.");
        }else if(numero1 < numero2){ //mudei aqui
            JOptionPane.showMessageDialog(null, "Está mais a direita.");
            }
        else {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou! O número era " + numero2);
            JOptionPane.showMessageDialog(null, "Você tentou " + tentativa + " vezes antes de acertar!");
            return false;//adicionei
            }
        return true;//adicionei
        }
}