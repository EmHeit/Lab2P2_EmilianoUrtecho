
package lab2p2_emilianourtecho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab2P2_EmilianoUrtecho {

    static Scanner escan = new Scanner (System.in);
    static List <Jugador> jugadores = new ArrayList();
    
    public static void main(String[] args) {
        byte eleccion;
        System.out.println("        ~MENU PRINCIPAL~");
        System.out.println("    1. CRUD Jugadores");
        System.out.println("    2. CRUD Carros");
        System.out.println("    3. Compra y venta de carros");
        System.out.println("    4. Instalacion de mejoras visuales");
        System.out.println("    5. SALIR");
        System.out.print("Usted elija: ");
        eleccion = escan.nextByte();
        do {
            
            switch(eleccion){
                case 1: // CRUD JUGADORES
                    crudJugadores();
                    break;
                case 2: // CRUD CARROS
                    crudCarros();
                    break;
                case 3: // Compra y venta de carros
                    
                    break;
                case 4: // Instalacion de mejoras visuales
                    
                    break;
                case 5: // SALIR
                    System.out.println("Si quiere salir, presione la misma tecla");
                    break;
                default: // SEPA
                    System.out.println("Lo siento no puedo leer eso, por favor elija una opcion valida...");
                    break;  
            }

            System.out.println("        ~MENU PRINCIPAL~");
            System.out.println("    1. CRUD Jugadores");
            System.out.println("    2. CRUD Carros");
            System.out.println("    3. Compra y venta de carros");
            System.out.println("    4. Instalacion de mejoras visuales");
            System.out.println("    5. SALIR");
            System.out.print("Usted elija: ");
            eleccion = escan.nextByte();
            
        } while (eleccion != 5);
    }
    //CRUD JUGADORES
    public static void crudJugadores(){
        byte eleccionJ;
        System.out.println("    ~CRUD JUGADORES~");
        System.out.println("1. Crear Jugador");
        System.out.println("2. Buscar Jugador");
        System.out.println("3. Modificar Jugador");
        System.out.println("4. Eliminar Jugador");
        System.out.println("5. SALIR");
        System.out.print("Elija una opcion: ");
        eleccionJ = escan.nextByte();
        do {
            switch(eleccionJ){
                case 1: // Crear Jugador
                    crearJugador();
                    break;
                case 2: // Modificar Jugador
                    break;
                case 3: // Listar Jugador
                    break;
                case 4: // Eliminar Jugador
                    break;
                case 5: // Salir
                    break;
                default:// No se
                    break;
            }
            System.out.println("    ~CRUD JUGADORES~");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Modificar Jugador");
            System.out.println("3. Listar Jugador");
            System.out.println("4. Eliminar Jugador");
            System.out.println("5. SALIR");
            System.out.print("Elija una opcion: ");
            eleccionJ = escan.nextByte();
        } while (eleccionJ != 5);
    }
    
    public static void crearJugador(){
        System.out.print("Ingrese el nombre del jugador: ");
        String nombreJugador = escan.next();
        int reputacionPuntos = 100;
        System.out.print("Sus puntos de reputacion "+reputacionPuntos);
        double dineroBanco = 15000.00;
        System.out.print("Su dinero disponible en el banco "+dineroBanco);
        Jugador jugadorNuevo = new Jugador(nombreJugador, reputacionPuntos, dineroBanco);
        jugadores.add(jugadorNuevo);    
        System.out.println("Usted ha creado a '"+nombreJugador+"' con exito");
        
    }
    
    public static void modificarJugador(String nombre, int puntosReput, double dineroActual){
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                jugador.setReputacionPuntos(puntosReput);
                jugador.setDineroBanco(dineroActual);
                System.out.println("El jugador se ha actualizado con exito!!!");
            }
        }
        System.out.println("El jugador no se pudo encontrar");
    }
    
    public static void listarJugador(){
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores creados aun");
        }else{
            System.out.println("Jugadores: ");
            for (int i = 0; i < jugadores.size(); i++) {
                Jugador jugador = jugadores.get(i);
                System.out.println("Nombre: " +jugador.getNombre());
                System.out.println("Puntos de reputacion: " + jugador.getReputacionCarros());
                System.out.println("Dinero en el Banco: "+ jugador.getDineroBanco());
                System.out.println("");
                System.out.println("-----------------");
                System.out.println("");
            }
        }
    }
    
    public static void eliminarJugador(String nombre){
        Jugador jugadorEliminar= null ;
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                jugadorEliminar = jugador;
                break;
            }
        }
        if (jugadorEliminar != null) {
            jugadores.remove(jugadorEliminar);
            System.out.println("El jugador se ha eliminado con exito");
        }else{
            System.out.println("No se pudo encontrar el jugador para eliminarlo");
        }
    }
    
    //CRUD CARROS
    public static void crudCarros(){
        byte eleccionC;
        System.out.println("    ~CRUD CARROS~");
        System.out.println("1. Crear Carro");
        System.out.println("2. Modificar Carro"); // No cambiar color o precio
        System.out.println("3. Listar Carro"); // Listar carros, lista los jguadores y buscar el carro en base al nombre del jugador
        System.out.println("4. Eliminar Carro");
        System.out.println("5. SALIR");
        System.out.print("Elija una opcion: ");
        eleccionC = escan.nextByte();
        do {
            switch(eleccionC){
                case 1: // Crear Carro
                    break;
                case 2: // Modificar CArro
                    break;
                case 3: // Listar Carro
                    break;
                case 4: // Eliminar Carro
                    break;
                case 5://SALIR
                    System.out.println("Si quiere salir, presione la tecla 5 otra vez");
                    break;
                default: // SEPA
                    System.out.println("Opcion invalida, elija una de las opciones validas porfavor.");
                    break;
            }
            System.out.println("    ~CRUD JUGADORES~");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Buscar Jugador");
            System.out.println("3. Modificar Jugador");
            System.out.println("4. Eliminar Jugador");
            System.out.println("5. SALIR");
            System.out.print("Elija una opcion: ");
            eleccionC = escan.nextByte();
        } while (eleccionC != 5);        
    }
    public static void crearCarro(){
        System.out.print("Ingrese la marca del carro: ");
        String marca = escan.next();
        
        System.out.print("Ingrese el modelo del carro: ");
        String modelo = escan.next();
        
        System.out.print("Ingrese el color del carro: ");
        String color = escan.next();
        
        System.out.print("Ingrese el precio del nuevo carro: ");
        double precioCarro = escan.nextDouble();
        
        String[] mejoraTipo = {"Spoiler", "Side Skirts", "Front Bumper", "Back Bumper", "Super Burlds"};
        double[] mejoraPrecio = {3500.00, 1800.00, 2000.00, 1500.00, 8,800.00};
        
        List<String> mejorasSeleccionadas = new ArrayList();
        System.out.println("Ingrese la cantidad de mejoras visuales que quiera: ");
        int cantidadMejoras = escan.nextInt();
        for (int i = 0; i < cantidadMejoras; i++) {
            System.out.println("Seleccione la mejora visual #" + (i + 1) + ":");
            for (int j = 0; j < mejoraTipo.length; j++) {
                System.out.println((j + 1) + ". " + mejoraTipo[j] + " - Precio: " + mejoraPrecio[j]);
            }
            int seleccion = escan.nextInt();
            mejorasSeleccionadas.add(mejoraTipo[seleccion - 1]);
        }

        System.out.print("Ingrese el nombre del jugador que tendrá el carro: ");
        String nombreJugador = escan.next();
    }
    
}
