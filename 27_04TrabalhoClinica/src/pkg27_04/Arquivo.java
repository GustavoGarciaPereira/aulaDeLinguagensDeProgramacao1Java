/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author usrlab06
 */
public class Arquivo {
    public void inserir(Paciente paciente){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(paciente.nome+".txt",true));
            bw.write(paciente.nome);
            bw.newLine();
            bw.write(""+paciente.idade);
            bw.newLine();
            bw.write(paciente.genero);
            bw.newLine();
            bw.write(""+paciente.peso);
            bw.newLine();
            bw.write(""+paciente.altura);
            bw.close();
            System.out.println("Dados Guardados no Arquivo");
        } catch (Exception e) {
        }
    }
    
    public String consulta(String nome){
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
