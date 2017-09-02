/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocamporuiz.christian.main;
import ocamporuiz.christian.Bicicleta;
/**
 *
 * @author ChrisO
 */
public class Principal {
    public static void main(String[] args) {
        short gears=7;
        Bicicleta b=new Bicicleta();
        b.setBici("Gazelle",gears, 21000);
        int precio=b.cuantoCuesta();
        b.pedalea();
        
    }
    
    
}
