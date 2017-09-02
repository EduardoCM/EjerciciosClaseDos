
package lopez.hernandez.karen.juliette.main;
import lopez.hernandez.karen.juliette.PersonaJ;
/**
 *
 * @author Juliette
 */
public class PersonaJMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaJ alex = new PersonaJ();
        alex.nombre = "Alex";
        alex.apellido = "Trimble";
        alex.profesion = "Vocalista de Two Door Cinema Club";
        alex.id = 123;
        alex.peso = 78.9;
        
        alex.BuscarPersonaJ(alex.id);
        alex.mostrarDatos();
        
        
    }
    
}
