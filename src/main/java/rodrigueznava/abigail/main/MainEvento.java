/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigueznava.abigail.main;

import rodrigueznava.abigail.Evento;

/**
 *
 * @author Abigail
 */
public class MainEvento {
    public static void main(String[] args) {
        Evento evento = new Evento();
        evento.noEvento = 1192834121;
        evento.nombre = "Evento";
        evento.lugar = "ESCOM";
        evento.entrada = 0.0f;
        evento.cupo = 100;
        evento.estatus = 'A';
        
        evento.crearEvento(evento);
        evento.mostrarEvento();
        evento.cancelarEvento();
        System.err.println("Estatus evento :" + evento.obtenerStatusEvento() );
        
        
    }
}
