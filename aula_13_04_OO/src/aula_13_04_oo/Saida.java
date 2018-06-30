/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_13_04_oo;

/**
 *
 * @author usrlab06
 */
public class Saida{
//        Alarme alerme = new Alarme();
        
//        public void exibir(){
//            System.out.println("Sistema de Alarme");
//            System.out.println("Alarme: "+alerme.ligar()+"\nAlarme: "+alerme.desliga());
//
//        }
        
        public void exibir(String nome, String cidade){
            System.out.println("Nome: "+nome+"\nCidade: "+cidade);
            
        }
        
        public void exibir2(Pessoa pessoa){
            System.out.println("2)Nome: "+pessoa.nome+"\nCidade: "+pessoa.cidade);
            
        }
        
}
