package MoralesTorres.Jonatan.Main;
import MoralesTorres.Jonatan.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();
        
        chatbot.nombre = "Robocop";
        Date hoy = new Date();
        chatbot.saludar(hoy);
        
        chatbot.seleccionarTema("Aviones");
        chatbot.seleccionarTema("Marcas");
        
        String nombre = chatbot.obtenerNombre();
        
        System.out.println("El nombre del chatbot es: " + nombre);
    }
}
