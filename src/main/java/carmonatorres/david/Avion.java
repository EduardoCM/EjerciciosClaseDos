
package carmonatorres.david;


public class Avion {
    
    public byte noSerie;
    public String noVuelo;
    public boolean volando;
    public long kilometros;
    
    public void consultaVuelo(){
    
        System.out.println("El vuelo no: " +noVuelo+ " del avion no. " + noSerie + " consultada.");
    }
    
    public long kilometraje(){
    
        System.out.println("Kilometraje del avion: " + kilometros);
        return kilometros;
    }
    
    public void consultaNoSerie(int numSerie){
    
        System.out.println("El numero de serie de la avion es: " + numSerie);
    }
    
    public boolean vueloEnCurso(){
    
        return volando;
    }
}