/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_10_05_farmacia;

import javax.swing.JOptionPane;

/**
 *
 * @author usrlab06
 */
public class Venda {
    Medicamento[] medicamento;
    Cliente cliente;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.realizaVenda();
    }
    public void realizaVenda(){
       cliente = new Cliente();
       medicamento = new Medicamento[100];
       
       medicamento[0] = new Medicamento();
       medicamento[0].descricao = JOptionPane.showInputDialog("Descrição");
       medicamento[0].laboratorio = JOptionPane.showInputDialog("Laboratorio");
       medicamento[0].quantidade = Float.parseFloat(JOptionPane.showInputDialog("Quantidade"));
       medicamento[0].valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
       
       cliente.CPF = JOptionPane.showInputDialog("CPF");
       cliente.nome = JOptionPane.showInputDialog("Nome");
       
       
       JOptionPane.showMessageDialog(null,medicamento[0].descricao+"\n "+medicamento[0].laboratorio+"\n "+medicamento[0].quantidade+"\n "
               +medicamento[0].valor+"\n "+cliente.CPF+"\n "+cliente.nome);
    }
}
