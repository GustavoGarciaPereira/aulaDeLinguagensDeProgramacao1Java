/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

/**
 *
 * @author usrlab06
 */
public class Veiculo {
    public String marca;
    public Veiculo(String marca){
        this.marca = marca;
    
    }
    public void exibirMsg(){
        System.out.println("Eu sou a SUPERCLASSE");
    }
}
