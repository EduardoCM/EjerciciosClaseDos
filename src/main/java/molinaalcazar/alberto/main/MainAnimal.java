/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molinaalcazar.alberto.main;

import molinaalcazar.alberto.Animal;

/**
 *
 * @author Alcazar
 */
public class MainAnimal {
    public static void main (String[]args){
    
    
    Animal Blaki = new Animal();
    Blaki.nombre = "Blaki";
    Blaki.edad = 7;
    Blaki.peso = 10.5;
    Blaki.sexo = "MAsculino";
    
    Blaki.nombre(Blaki);
    Blaki.sexo(Blaki.sexo);
    Blaki.buscarAnimal(Blaki.nombre);
    Blaki.mostrarDatos();
    
    
    
    
    
    
    }
    
    
    
    
     
     
    }
    

