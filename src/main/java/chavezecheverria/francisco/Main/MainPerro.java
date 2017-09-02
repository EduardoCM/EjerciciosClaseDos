
package chavezecheverria.francisco.Main;

import chavezecheverria.francisco.Perro;


public class MainPerro {
    
    public static void main(String[] args) {
        
        
     Perro dog = new Perro();
     
     dog.nombre = "Firulais";
     dog.raza = "Poodle";
     dog.altura =30 ;
     dog.edad = 5;
     
     
        
    dog.mostrarDatos();
      System.out.println("Edad en escala canina: "+dog.calcularEdadPerro(dog.edad));
    
        
    }
    
}
