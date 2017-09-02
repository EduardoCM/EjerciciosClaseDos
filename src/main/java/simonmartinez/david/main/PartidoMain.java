
package simonmartinez.david.main;

import simonmartinez.david.Partido;

public class PartidoMain {
    
    public static void main(String[] args){
        
        Partido par = new Partido();
        par.empezar();
        
        System.out.println(par.terminar());
        
        par.llenarDatos("DF", "Pedro Lopez", "america", "chivas", 2.5, 2,"chivas");
        
        par.mostrarPartido(par);
        
        System.out.println("El ganador fue: " + par.ganador());
    }
    
}
