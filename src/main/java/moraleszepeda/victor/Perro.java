
package moraleszepeda.victor;


public class Perro {
    public String nombre;
    public byte edad;
    public int numeroVacunas;
    public String raza;
    
    public String obtenerNombre(String nombre){
        System.out.println("El nombre del perro es : "+ nombre + " ");
        return nombre;
    }
    
    public void mostrarEdad(int edad){
        System.out.println("La edad del perro es : " + edad);
    }
    
    public void vacunas(int v){
        System.out.println("El perro tiene "+ v + " vacunas");
    }
    
     public void raza(String raza){
        System.out.println("La raza del perro es : " + raza );
    }
}
