/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_04_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author usrlab06
 */
public class Arquivo {
    
    
  
    
    public void cadastrar(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nome+".txt",true));
            bw.write();
            bw.newLine();
            bw.write();
            bw.newLine();
            bw.newLine();
            bw.close();
            System.out.println("Dados Guardados no Arquivo");
        } catch (Exception e) {
        }
    }
    
    public String consulata(String nome){
        String conteudo = " ";
        String linha;
        try {
            BufferedReader br = new BufferedReader(new FileReader(nome+".txt"));
            while((linha=br.readLine())!=null){
                conteudo = conteudo + linha+"\n";
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Arquivo não existe");
        }
        return conteudo;
    }
}
