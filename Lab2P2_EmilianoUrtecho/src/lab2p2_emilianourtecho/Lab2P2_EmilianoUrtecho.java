
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
                    compraYventa();
                    break;
                case 4: // Instalacion de mejoras visuales
                    instMejorasVisuales();
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
                    System.out.print("Ingrese el nombre a modificar: ");
                    String nombre = escan.next();
                    System.out.print("Ingrese los puntos de reputacion que quiera modificar: ");
                    int puntosReputacion = escan.nextInt();
                    System.out.print("Ingrese la cantidad de dinero que desea modificar: ");
                    double dinero = escan.nextDouble();
                    modificarJugador(nombre, puntosReputacion, dinero);
                    break;
                case 3: // Listar Jugador
                    listarJugador();
                    break;
                case 4: // Eliminar Jugador
                    System.out.print("Ingrese el nombre que desea eliminar: ");
                    String nombreElim = escan.next();
                    eliminarJugador(nombreElim);
                    break;
                case 5: // Salir
                    System.out.println("Si desea salir presione otra vez la tecla 5. ");
                    break;
                default:// No se
                    System.out.println("Lo siento, no puedo leer eso, vuelva a presionar una tecla valida");
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
        System.out.println("2. Modificar Carro");
        System.out.println("3. Listar Carro"); // Listar carros, lista los jguadores y buscar el carro en base al nombre del jugador
        System.out.println("4. Eliminar Carro");
        System.out.println("5. SALIR");
        System.out.print("Elija una opcion: ");
        eleccionC = escan.nextByte();
        do {
            switch(eleccionC){
                case 1: // Crear Carro
                    crearCarro();
                    break;
                case 2: // Modificar CArro
                    System.out.print("Ingrese el nombre del jugador a modificar: ");
                    String nombreDueno1 = escan.next();
                    modificarCarro(nombreDueno1);
                    break;
                case 3: // Listar Carro
                    listarCarro();
                    break;
                case 4: // Eliminar Carro
                    System.out.print("Ingrese el nombre del dueno del carro para eliminarlo: ");
                    String nombreDueno = escan.next();
                    eliminarCarro(nombreDueno);
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
    
    public static void listarCarro(){
        System.out.println("Ingrese el nombre del jugador para listar sus autos");
        String nombre = escan.next();
        boolean bandera = false;
        
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                bandera = true;
                List<Carro> carros = jugador.getCarros();
                if (carros.isEmpty()) {
                    System.out.println("Aun no hay autos registrados");
                }else{
                    System.out.println("Carro del jugador: "+ nombre);
                    for (Carro carro : carros) {
                        System.out.println("Marca: "+carro.getMarca());
                        System.out.println("Modelo: "+carro.getModelo());
                        System.out.println("Color: " + carro.getColor());
                        System.out.println("Precio: "+carro.getPrecio());
                        System.out.println("Mejoras Visuales: "+carro.getMejorasVisuales());
                        System.out.println("Reconstruido: "+ (carro.getReconstruido() ? "Si" : "No"));
                        System.out.println("------------------------");
                    }
                }
                break;
            }
        }
        if (!bandera) {
            System.out.println("No se ha encontrado un jugador con ese nombre");
        }
    }
    
    public static void eliminarCarro(String nombre){
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                List<Carro> carros = new ArrayList();
                if (!carros.isEmpty()) {
                    carros.remove(carros);
                    System.out.println("Se ha eliminado el carro con exito");
                }else{
                    System.out.println("No tiene ningun carro que eliminar");
                }
            }
        }
        System.out.println("No se ha encontrado ningun jugador con ese nombre");
    }
    
    public static void modificarCarro(String nombreDueno) {
        boolean carroEncontrado = false;

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombreDueno)) {
                List<Carro> carros = jugador.getCarros();
                if (!carros.isEmpty()) {
                    System.out.println("Carros de " + nombreDueno + ":");
                    for (Carro carro : carros) {
                        System.out.println("Marca: " + carro.getMarca());
                        System.out.println("Modelo: " + carro.getModelo());
                        System.out.println("Color: " + carro.getColor());
                        System.out.println("Precio: " + carro.getPrecio());
                        System.out.println("Mejoras Visuales: " + carro.getMejorasVisuales());
                        System.out.println("Reconstruido: " + (carro.getReconstruido() ? "Sí" : "No"));
                        System.out.println("------------------------");
                    }
                    System.out.print("Ingrese la marca del carro que desea modificar: ");
                    String marcaCarro = escan.next();

                    for (Carro carro : carros) {
                        if (carro.getMarca().equalsIgnoreCase(marcaCarro)) {
                            System.out.println("Seleccione qué desea modificar:");
                            System.out.println("1. Color");
                            System.out.println("2. Precio");
                            System.out.println("3. Mejoras Visuales");
                            System.out.print("Elija una opción: ");
                            int opcion = escan.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.print("Nuevo color: ");
                                    String nuevoColor = escan.next();
                                    carro.setColor(nuevoColor);
                                    System.out.println("Color del carro modificado con éxito.");
                                    break;
                                case 2:
                                    System.out.print("Nuevo precio: ");
                                    double nuevoPrecio = escan.nextDouble();
                                    carro.setPrecio(nuevoPrecio);
                                    System.out.println("Precio del carro modificado con éxito.");
                                    break;
                                case 3:
                                    System.out.println("Mejoras visuales actuales: " + carro.getMejorasVisuales());
                                    System.out.print("Ingrese el índice de la mejora a eliminar (1, 2, 3, ...): ");
                                    int indiceMejora = escan.nextInt();
                                    if (indiceMejora >= 1 && indiceMejora <= carro.getMejorasVisuales().size()) {
                                        carro.getMejorasVisuales().remove(indiceMejora - 1);
                                        System.out.println("Mejora visual eliminada con éxito.");
                                    } else {
                                        System.out.println("Índice inválido. No se realizó ninguna modificación.");
                                    }
                                    break;
                                default:
                                    System.out.println("Opción inválida. No se realizó ninguna modificación.");
                            }
                            carroEncontrado = true;
                            break;
                        }
                    }
                } else {
                    System.out.println("El jugador no tiene carros registrados.");
                }
                break;
            }
        }

        if (!carroEncontrado) {
            System.out.println("No se encontró un carro con la marca especificada.");
        }
    }
    
    //Comprar y vender carro
    public static void compraYventa(){
        byte eleccion;
        System.out.println("   ~Compra y Venta de carros~");
        System.out.println("1. Compra Carro");
        System.out.println("2. Vender Carro");
        System.out.println("3. SALIR");
        System.out.print("Elija una opcion: ");
        eleccion = escan.nextByte();
        do {
            switch(eleccion){
                case 1: // Compra Carro
                    comprarCarro();
                    break;
                case 2: //Vender Carro
                    venderCarro();
                    break;
                case 3: // SALIR
                    System.out.println("Si quiere salir, presione la tecla 3 otra vez");
                    break;
                default://No se
                    System.out.println("No puedo leer eso, por favor presione una telca valida");
                    break;  
            }
        } while (eleccion != 3);
    }
    
    public static void comprarCarro(){
        System.out.print("Ingrese el nombre del jugador que comrpara el carro: ");
        String nombre = escan.next();
        
        Jugador comprador = null;
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                comprador = jugador;
                break;
            }
        }
        if (comprador == null) {
            System.out.println("No se encontro nignun jugador con ese nombre");
            return;
        }
        System.out.print("Ingrese la marca de carro que desea comprar: ");
        String marca = escan.next();
        Carro carroComprado = null;
        List<Carro> carrosDisponibles = new ArrayList();
        
        for (Carro carro : carrosDisponibles) {
            if (carro.getMarca().equalsIgnoreCase(marca)) {
                carroComprado = carro;
                break;
            }
        }
        if (carroComprado == null) {
            System.out.println("No se encontro ningun caror con esa marca");
            return;
        }
        double precioTotal = carroComprado.getPrecio();
        
        if (comprador.getDineroBanco()<precioTotal) {
            System.out.println("El jugador no tiene suficiente dinero para comprar el vehiculo");
            return;
        }
        comprador.getCarros().add(carroComprado);
        comprador.setDineroBanco(comprador.getDineroBanco()-precioTotal);
        carrosDisponibles.remove(carroComprado);
        System.out.println("El jugador "+nombre+" ha comprado un carro "+marca+" con exito!!!");
    }
    
    public static void venderCarro(){
        System.out.print("Ingrese el nombre del jugador que desea vender su carro: ");
        String nombre = escan.next();
        
        Jugador vendedor = null;
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                vendedor = jugador;
                break;
            }
        }
        if (vendedor == null) {
            System.out.println("No se encontro ningun jguador con ese nombre");
            return;
        }
        
        System.out.print("Ingrese la marca del carro que desea vender: ");
        String marcaCarro = escan.next();
        
        Carro carroAVender = null;
        List<Carro> carrosDelVendedor = vendedor.getCarros();
        
        for (Carro carro : carrosDelVendedor) {
            if (carro.getMarca().equalsIgnoreCase(marcaCarro)) {
                carroAVender = carro;
                break;
            }
        }
        
        if (carroAVender == null) {
            System.out.println("No se encontro un carro con esa marca");
            return;
        }
        double precioCarroAVender = carroAVender.getPrecio();
        
        vendedor.getCarros().remove(carroAVender);
        vendedor.setDineroBanco(vendedor.getDineroBanco()+precioCarroAVender);
        
        System.out.println("El jugador "+ nombre+" ha vendido el carro "+marcaCarro+" con exito");
    }
    
    //Instalacion
    public static void instMejorasVisuales(){
        System.out.print("Ingresa el nombre del jugador que desea instalar mejoras: ");
        String nombre = escan.next();
        
        Jugador jugador = null;
        for (Jugador jugad : jugadores) {
            if (jugad.getNombre().equalsIgnoreCase(nombre)) {
                jugador = jugad;
                break;
            }
        }
        if (jugador == null) {
            System.out.println("No se ha encontrado ningun jugador con ese nombre");
            return;
        }
        if (jugador.getCarros().isEmpty()) {
            System.out.println("El jugador no tiene autos para aplicarle mejoras");
            return;
        }
        
        System.out.println("Ingrese la marca del carro que desea instalarle las mejoras");
        String marca = escan.next();
        
        Carro carroAActualizar = null;
        List<Carro> carrosDelJugador = jugador.getCarros();
        
        for (Carro carro : carrosDelJugador) {
            if (carro.getMarca().equalsIgnoreCase(marca)) {
                carroAActualizar = carro;
                break;
            }
        }
        
        if (carroAActualizar == null) {
            System.out.println("No se ha encontrado un auto con esa marca");
            return;
        }
        String[] mejoraTipo = {"Spoiler", "Side Skirts", "Front Bumper", "Back Bumper", "Super Burlds"};
        double[] mejoraPrecio = {3500.00, 1800.00, 2000.00, 1500.00, 8800.00};
        
        System.out.println("Las mejoras visuales disponibles: ");
        
        for (int i = 0; i < mejoraTipo.length; i++) {
            System.out.println((i + 1) + ". " + mejoraTipo[i] + " - Precio: " + mejoraPrecio[i]);
            
        }
        System.out.print("Ingrese el número de la mejora visual que desea instalar: ");
        int seleccion = escan.nextInt();

        if (seleccion >= 1 && seleccion <= mejoraTipo.length) {
            String mejoraElegida = mejoraTipo[seleccion - 1];
            double precioMejora = mejoraPrecio[seleccion - 1];

            // Verifica si el jugador tiene suficiente dinero para instalar la mejora visual
            if (jugador.getDineroBanco() >= precioMejora) {
                List<String> mejorasVisuales = carroAActualizar.getMejorasVisuales();
                mejorasVisuales.add(mejoraElegida);
                carroAActualizar.setMejorasVisuales(mejorasVisuales);

                // Actualiza el dinero del jugador
                double nuevoDinero = jugador.getDineroBanco() - precioMejora;
                jugador.setDineroBanco(nuevoDinero);

                System.out.println("Mejora visual " + mejoraElegida + " instalada con éxito en el carro " + marca + ".");
            } else {
                System.out.println("El jugador no tiene suficiente dinero para instalar esta mejora visual.");
            }
        } else {
            System.out.println("Selección de mejora visual inválida.");
        }    }
    
}
