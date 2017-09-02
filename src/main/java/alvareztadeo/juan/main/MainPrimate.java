/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvareztadeo.juan.main;
import alvareztadeo.juan.Primate;

public class MainPrimate {
    
    public static void main(String[] args) {
        
        Primate primate = new Primate();
        
        primate.areaBosque=12443;
        primate.añoNacimiento=1992;
        primate.genero='M';
        primate.nombre="Pedro";
        
        
        primate.edad(1992);
        primate.aullar();
        primate.brincarRama();
    }
    
}
