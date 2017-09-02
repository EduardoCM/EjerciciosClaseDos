/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vazquezhernandez.yaxiri.main;

import vazquezhernandez.yaxiri.Doggy;
/**
 *
 * @author yax
 */
public class DoggyMain {
    public static void main(String [] args){
        Doggy bob = new Doggy();
        
        bob.nombre = "Gary";
        bob.edad= 5;
        bob.peso = 12;
        bob.adoptado= true;
        
        bob.buscar();
        bob.adoptado(bob.adoptado);
        bob.generarCodigo();
    }
}
