/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorialopez.carlos;

/**
 *
 * @author carlos
 */
public class Jugador {
    // Al menos 4 tipos de datos
    public String nombre;
    public String posicion;
    public int numero;
    public double sueldo;
    public int numeroPartidos;
    
    
    //Metodos (1 void, 1 return, Acepte Parametros)
    public void registrarJugador(){
        System.out.println("Registrando al jugador: " + nombre + " con el numero: " +numero );
    }
    
    public void bajaJugador(int numero){
        System.out.println("Dando de baja al jugador: " + nombre + " con el numero: " +numero );
    }
        
    public Jugador buscarJugador(int numero){
        System.out.println("Buscando al jugador: " + numero);
        return new Jugador();
    }
    
    public void actualizarPartidos(Jugador jugador, int partidos){
        jugador.numeroPartidos = jugador.numeroPartidos + partidos;
        System.out.println("Actualizando el numero de partidos al jugador: " + jugador.nombre);
        System.out.println("Numer de Partidos jugados de " + jugador.nombre + ": "+ jugador.numeroPartidos);
    }
    
    public void mostrarDatosJugador(){
        System.out.println("===== Informacion Jugador ==========");
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero: " + numero);
        System.out.println("Posicion: " + posicion);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Partidos jugados: " + numeroPartidos);
    }
}
