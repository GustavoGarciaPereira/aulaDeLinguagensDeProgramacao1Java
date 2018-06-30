/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_03_05;

/**
 *
 * @author usrlab06
 */
public class Usuario{
    public String nome;
    public String senha;
    
    public boolean login(String nome, String senha){
        if(nome.equals("root") && senha.equals("12345")){
            return true;
        }else{
            return false;
        }
        
    //System.out.println("Logango com usúario "+nome+" e senha: "+senha);
    }
    
    public boolean logout(){

        return true;

    }
}
