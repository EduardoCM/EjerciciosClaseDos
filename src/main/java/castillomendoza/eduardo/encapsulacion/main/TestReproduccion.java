package castillomendoza.eduardo.encapsulacion.main;

import castillomendoza.eduardo.encapsulacion.Persona;


public class TestReproduccion {

    public static void main(String[] args) {
        
        Persona juan = new Persona();
        juan.setNombre("Juan");
        juan.setSexo("M");
        
        
        Persona karo = new Persona();
        karo.setNombre("Karolina");
        karo.setSexo("F");
        
        
        Persona hijo = juan.reproducirse(karo);
        
        System.out.println("Madre: " + hijo.getMadre().getNombre());
        
        System.out.println("Padre: " + hijo.getPadre().getNombre());
       
    }


    
}
