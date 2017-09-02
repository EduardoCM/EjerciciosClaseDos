/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garciamolina.ale.main;
import garciamolina.ale.*;
/**
 *
 * @author AleAlejandro
 */
public class CantanteMain {
    
    public static void main(String[] args) {
        
        Cantante maluma = new Cantante();
        
        maluma.inicializa_cantante("Maluma", 28, "masculino", "colombiano");
        maluma.agregar_cancion("Felices los 4");
        maluma.eliminar_cancion("Borro cassette");
        System.out.println("Maluma cuenta con " + maluma.devuelve_canciones()+ " canciones en su repertorio");
        
        
        
    }
    
    
    
}
