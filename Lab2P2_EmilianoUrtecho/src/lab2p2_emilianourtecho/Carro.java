
package lab2p2_emilianourtecho;

import java.util.List;

public class Carro {

    String Modelo;
    String Color; 
    double precio;
    String marca;
    List<String> mejorasVisuales;
    
    public Carro(String Modelo, String Color, double precio, String marca, List<String> mejorasVisuales){
        this.Modelo = Modelo;
        this.Color = Color;
        this.precio = precio;
        this.marca = marca;
        this.mejorasVisuales = mejorasVisuales;
    }
    
    //GETTERS
    public String getModelo(){
        return Modelo;
    }
    public String getColor(){
        return Color;
    }
    public double getPrecio(){
        return precio;
    }
    public String getMarca(){
        return marca;
    }
    public List<String> getMejorasVisuales(){
        return mejorasVisuales;
    }
    
    
    
}
