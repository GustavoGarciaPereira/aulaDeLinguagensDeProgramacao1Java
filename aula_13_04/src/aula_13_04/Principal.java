package aula_13_04;



public class Principal {

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        Atuador atuador = new Atuador();
        sensor.getTemperatura();
        
        
        System.out.println("Status: "+atuador.ligar());

    }
    
}
