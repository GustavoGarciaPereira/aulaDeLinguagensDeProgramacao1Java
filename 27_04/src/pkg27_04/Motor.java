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
public class Motor {
    private String modelo;
    private int rpm;
    
    public Motor(String modelo,int rpm){
        this.modelo = modelo;
        this.rpm = rpm;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    
    public String getModelo() {
        return modelo;
    }

    public int getRpm() {
        return rpm;
    }
    
    
    
}
