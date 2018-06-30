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
public class Carro extends Veiculo{
    public String modelo;

    public Carro() {
        super("GM");
        modelo = "ONIX";
        this.exibirMsg();
    }
   
    @Override
    public void exibirMsg() {
        //super.exibirMsg(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Eu sou a subclasse!!");
    }
    
}
