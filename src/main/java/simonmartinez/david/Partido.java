
package simonmartinez.david;

public class Partido {
    
    String lugar;
    String nomArbitro;
    String eqLocal;
    String eqVisitante;
    double duracion;
    int jugExpulsados;
    String ganador;
    
    public void empezar(){
        System.out.println("El partido ha empezado");
    }
    
    public String terminar(){
        return "el partido ha terminado";
    }
    
    public void mostrarPartido(Partido partido){
        System.out.println("lugar: " + lugar);
        System.out.println("arbitro: " + nomArbitro);
        System.out.println("Equipo local: " + eqLocal);
        System.out.println("Equipo visitante: " + eqVisitante);
        System.out.println("Duración: " + duracion);
        System.out.println("Jugadores Expulsados: " + jugExpulsados);
    }
    
    public void llenarDatos(String lugar,String nomArbitro,String eqLocal,String eqVisitante,
                            double duracion,int jugExpulsados, String ganador){
        
        this.lugar = lugar;
        this.nomArbitro = nomArbitro;
        this.eqLocal = eqLocal;
        this.eqVisitante = eqVisitante;
        this.duracion = duracion;
        this.jugExpulsados = jugExpulsados;
        this.ganador = ganador;
    }
    
    public String ganador(){
        return ganador;
    }
    
    
    
    
}
