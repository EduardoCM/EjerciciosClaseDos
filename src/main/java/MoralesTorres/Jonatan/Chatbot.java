package MoralesTorres.Jonatan;

import java.util.Date;

public class Chatbot {
    public String nombre;
    public String tema = "Marcas";
    public Date now = new Date();
    
    public void saludar(Date fecha){
        if(now.before(fecha)){
            System.out.println("Hola, buenos días");
        }else{
            System.out.println("Hola, buenas tardes");
        }
    }
    
    public void seleccionarTema(String tema){
        if(tema.equals(this.tema)){
            System.out.println("Ok, hablemos del tema de Autos");
        }else{
            System.out.println("Desconozco ese tema, lo siento");
        }
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    
    @Override
    public String toString() {
        return "Chatbot{" + "nombre=" + nombre + ", tema=" + tema + ", now=" + now + '}';
    }    
}
