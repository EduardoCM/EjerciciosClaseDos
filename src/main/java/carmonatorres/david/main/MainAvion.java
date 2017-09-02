package carmonatorres.david.main;
import carmonatorres.david.Avion;

public class MainAvion {
    
    public static void main(String [] arg){
    
        Avion avion  = new Avion();
        
        avion.kilometros = 24567;
        avion.noVuelo = "220MEX";
        avion.volando = true;
        avion.noSerie = 122;
        
        
        avion.consultaNoSerie(avion.noSerie);
        avion.kilometraje();
        avion.consultaVuelo();
    
    }
}
