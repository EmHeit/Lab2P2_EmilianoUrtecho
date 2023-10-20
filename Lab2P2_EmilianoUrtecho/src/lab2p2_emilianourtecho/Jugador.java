
package lab2p2_emilianourtecho;

import java.util.ArrayList;

public class Jugador {
    
    ArrayList <Carro> carros;
    String nombre;
    int reputacionCarros;
    double DineroBanco;
    
    public Jugador(String nombre, int reputacionCarros, double DineroBanco){
        this.nombre = nombre;
        this.reputacionCarros = reputacionCarros;
        this.DineroBanco = DineroBanco;
        this.carros = new ArrayList<>();
    }
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public int getReputacionCarros(){
        return reputacionCarros;
    }
    public double getDineroBanco(){
        return DineroBanco;
    }
    
}
