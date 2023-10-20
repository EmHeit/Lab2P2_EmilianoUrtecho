
package lab2p2_emilianourtecho;

import java.util.Scanner;

public class Lab2P2_EmilianoUrtecho {

    static Scanner escan = new Scanner (System.in);
    
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
    
}
