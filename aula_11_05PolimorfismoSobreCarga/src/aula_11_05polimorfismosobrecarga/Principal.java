/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_11_05polimorfismosobrecarga;

/**
 *
 * @author usrlab06
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mensagem mg = new Mensagem();
        mg.exibirMensagem();
        mg.exibirMensagem("Gustavo");
        mg.exibirMensagem("Gustavo Garcia", 22);
        mg.exibirMensagem(22,"Gustavo Garcia");
    }
    
}
