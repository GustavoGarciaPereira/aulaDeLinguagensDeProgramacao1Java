/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27_04;

/**
 *
 * @author usrlab06
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Motor motor = new Motor("WEG1002",2400);
        
        //System.out.println("Modelo:"+motor.getModelo()+"\nRPM:"+motor.getRpm());
        String email = null;
        String senha = null;
        
        email = "gus@gmail.com";
        //senha = "1234";
        
        if(email==null&&senha==null){
            Validacao validasao = new Validacao();
            }else if(email != null &&senha == null){
                Validacao validasao = new Validacao(email);
        
            }else{
                Validacao validasao = new Validacao(email,senha);
            }
        
        
        
        
        
        
    }
    
}
