package MoralesTorres.Jonatan.Main;

import MoralesTorres.Jonatan.Persona;

public class Reproduccion {
    public static void main(String[] args) {
        Persona Juan = new Persona();
        Juan.setNombre("Juan");
        Juan.setSexo("Hombre");
        
        Persona Pedro = new Persona();
        Pedro.setNombre("Pedro");
        Pedro.setSexo("Hombre");
        
        Persona Maria = new Persona();
        Maria.setNombre("Maria");
        Maria.setSexo("Mujer");
        
        Juan.reproducirse(null);
        Persona hijo = Maria.reproducirse(Juan);
        
        System.out.println("Nombre del padre: " + hijo.getPadre().getNombre());
        System.out.println("Nombre de la madre: " + hijo.getMadre().getNombre());
    }
}
