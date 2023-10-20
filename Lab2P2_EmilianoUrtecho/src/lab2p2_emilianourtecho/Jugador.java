
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
    //Metodo de compra de carro
    public void ComprarCarro(Carro carro){
        if (carros.contains(carro)) {
            carros.add(carro);
            DineroBanco -= carro.getPrecio();
            System.out.println("Ha comprado el carro con exito");
        }else{
            System.out.println("No puede comprar el carro");
        }
    }
    public void VenderCarro(Carro carro){
        if (carros.contains(carro)) {
            carros.remove(carro);
            DineroBanco += carro.getPrecio();
            System.out.println("Ha vendido su carro");
        }else{
            System.out.println("El jugador no tiene acceso a ese carro.");
        }
    }
    public void puntosReputacion(int reputacion){
        reputacionCarros += reputacion;
        System.out.println("Usted tiene " + reputacionCarros + " puntos de reputacion");
    }
    
    public void Banco(double sueldo){
        DineroBanco += sueldo;
        System.out.println("Usted tiene "+DineroBanco+" dinero disponible");
    }
    
    //SETTERS
    public void setReputacionPuntos(int reputacionPuntos){
        this.reputacionCarros = reputacionPuntos;
    }
    public void setDineroBanco(double dineroBanco){
        this.DineroBanco = dineroBanco;
    }
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }    
}
