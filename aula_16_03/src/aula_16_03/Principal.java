package aula_16_03;

import javax.swing.JOptionPane;

public class Principal {
        public static int linha = 0;
        public static String catastro[][] = new String[1000][3]; 
    public static void main(String[] args) {
            
        for(;;){
            menu();
        }    
        
            
            
    }
    
    
    
    public static void menu(){
        String menu = "c para cadastrar\n l listar Nomes\n";
        char opcao = JOptionPane.showInputDialog(menu).charAt(0);
        switch (opcao){
            case 'c':{
           
                cadastrar();
                
            break;
            }
            case 'l':{
           
                listarNome();
                
            break;
            }
           default:{
            System.out.println("você não digitou uma opcao valida\n");
            break;
        } 
    }
    }
    public static void cadastrar(){
    
       String nome = JOptionPane.showInputDialog("Imforme o nome");
       String data = JOptionPane.showInputDialog("Imforme a data");
       String hora = JOptionPane.showInputDialog("Imforme a hora");
       
       catastro[linha][0] = nome;
       catastro[linha][1] = data;
       catastro[linha][2] = hora;
       linha++;
        System.out.println("catrastrado com sucesso\n");
    }
    public static void listarNome(){
       int i=0;
       String nome = JOptionPane.showInputDialog("informe o nome a ser procurado\n");
       
       for(i=0;i<linha;i++){
           if(nome.equals(nome)){
              JOptionPane.showMessageDialog(null,"Nome: "+catastro[i][0]+"data"+catastro[i][1]+"hora"+catastro[i][2]);
           }
           
       }
       
    }
    
    
}
