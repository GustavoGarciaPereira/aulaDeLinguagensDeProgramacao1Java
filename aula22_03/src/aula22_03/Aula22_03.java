package aula22_03;

/**
 *
 * @author usrlab06
 */
public class Aula22_03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Programando em Java ";
        System.out.println("Tamannho de s: "+s.length());
        System.out.println("terceira letra é: "+s.charAt(2));
        System.out.println("s em caixas alta:"+s.toUpperCase()+"\nEm caixas baixa:"+s.toLowerCase());
        System.out.println("uma parte de s: "+s.substring(0,4));
        System.out.println("Remover espaços em branco de s: "+s.trim());
        
        System.out.println("substituir caracteres em s: "+s.replace('a', 'c'));
        System.out.println("Posição do primeiro caractere a em s: "+s.indexOf('a'));
        System.out.println("Posição do útimo caractere a em s: "+s.lastIndexOf('a'));
        
        
        
        
    }
    
}
