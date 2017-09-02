package GuerrerodelaVega.Joel.main;

import GuerrerodelaVega.Joel.Animal;

public class MainAnimal {
    
    public static void main(String[] args) {
        
        
        Animal doobutsu = new Animal();
        
        doobutsu.color = "blanco";
        doobutsu.raza = "Jack Rousell Terrier";
        doobutsu.nombre= "Leroy";
        doobutsu.peso = 4.567;
        doobutsu.edad = 4;
                
        doobutsu.registrar();
        doobutsu.ladrar();
        doobutsu.dormir();

    }
}
