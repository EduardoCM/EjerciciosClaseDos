package MoralesTorres.Jonatan.Main;

import MoralesTorres.Jonatan.Persona;

public class Reproduccion {
    public static void main(String[] args) {
        Persona Juan = new Persona();
        Juan.nombre = "Juan";
        Juan.sexo = "Hombre";
        
        Persona Pedro = new Persona();
        Pedro.nombre = "Pedro";
        Pedro.sexo = "Hombre";
        
        Persona Maria = new Persona();
        Maria.nombre = "Maria";
        Maria.sexo = "Mujer";
      
        Persona hijo = Juan.reproducirse(Juan);
        
        System.out.println("Madre: " + hijo.madre.getNombre());
        System.out.println("Padre: " + hijo.padre.getNombre());

        
        

    }
}
