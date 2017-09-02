/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reyes.guerrero.omar.main;

import reyes.guerrero.omar.Auto;


/**
 *
 * @author jarvis
 */
public class MainAuto {
    public static void main(String[] args) {
        Auto gtr34 = new Auto ();
        gtr34.color = "azul";
        gtr34.marca = "Nissan GTR";
        gtr34.numID = 4344;
        gtr34.numSerie = 433434343;
        gtr34.precio = 1158000.67;
        
        gtr34.arrancar();
        gtr34.apagar();
        System.out.println("Existencia: "+gtr34.existencia(gtr34.numID));
        
        
        
    }
    
}