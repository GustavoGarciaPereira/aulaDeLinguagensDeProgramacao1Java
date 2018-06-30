/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abistrata;

/**
 *
 * @author usrlab06
 */
public abstract class Pessoa {
    public abstract void setNome();
    public abstract int getIdade();
    
    public void exibirMsg(){
        System.out.println("oi");
    }
}
