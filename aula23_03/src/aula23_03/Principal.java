
package aula23_03;

import java.util.Scanner;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static char menbrosPrimeiraMargem[] = new char[6];
    public static char menbrosSegundaMargem[] = new char[6];
    
    public static void main(String[] args) {
        
        
        
        
        
        inicializa();
        //Senario
        mostraCenario();
        realizaJogada();
        mostraCenario();
        
        // TODO code application logic here
    }
    public static void inicializa(){
        menbrosPrimeiraMargem[0]='M';
        menbrosPrimeiraMargem[1]='M';
        menbrosPrimeiraMargem[2]='M';
        menbrosPrimeiraMargem[3]='C';
        menbrosPrimeiraMargem[4]='C';
        menbrosPrimeiraMargem[5]='C';
        
        menbrosSegundaMargem[0]=' ';
        menbrosSegundaMargem[1]=' ';
        menbrosSegundaMargem[2]=' ';
        menbrosSegundaMargem[3]=' ';
        menbrosSegundaMargem[4]=' ';
        menbrosSegundaMargem[5]=' ';
        
        
    
    }
    
    public static void mostraCenario(){
        System.out.print("Primeira margem -> ");
        for(int i = 0;i<6;i++){
            System.out.print(menbrosPrimeiraMargem[i]+" ");
        
        }
        System.out.println("==== Segunda Margem -> ");
        
        for(int i = 0;i<6;i++){
            System.out.print(menbrosSegundaMargem[i]+" ");
        
        }
       
    }
    
    public static void realizaJogada(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o movimento:> ");
        char Membro1Barco = (entrada.nextLine()).charAt(0);
        char Membro2Barco = (entrada.nextLine()).charAt(0);
        
        System.out.println("Barco "+Membro1Barco);    
        System.out.println("Barco "+Membro2Barco);
        
        for(int i=0; menbrosSegundaMargem.length<6;i++){
            if(menbrosSegundaMargem.equals(' ')){
                menbrosSegundaMargem[i] = Membro1Barco;
                i++;
                menbrosSegundaMargem[i] = Membro2Barco;
                System.out.println("ffff");
                
            }
        }
        for(int i = 0;i<6;i++){
            System.out.print(menbrosSegundaMargem[i]+" ");
        
        }

    }
    
    public static void testaPerdeu(){
        
    }
    
    
    
}
