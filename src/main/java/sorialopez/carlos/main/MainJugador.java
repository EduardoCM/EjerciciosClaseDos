/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorialopez.carlos.main;

import sorialopez.carlos.Jugador;

/**
 *
 * @author carlos
 */
public class MainJugador {
    public static void main(String args[]){
            
        Jugador juan = new Jugador();
        juan.nombre = "Juan";
        juan.numero = 9;
        juan.posicion = "Pitcher";
        juan.sueldo = 25250.50;
        juan.numeroPartidos = 10;
        int partidos = 2;
               
        juan.registrarJugador();
        juan.mostrarDatosJugador();
        juan.buscarJugador(9);
        juan.actualizarPartidos(juan, partidos);
        juan.bajaJugador(9);
        
        
    }
}
