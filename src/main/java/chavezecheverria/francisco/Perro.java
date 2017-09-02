
package chavezecheverria.francisco;

public class Perro {
    
    
 public String nombre;
 public byte edad;
 public float altura;
 public String raza;
 
 
 public void comer(){
     System.out.println("Estoy comiendo....");
 }
 

 
 public int calcularEdadPerro(byte edad){
     int edadPerro;
     edadPerro = edad*7;
     return edadPerro;
 }

public void mostrarDatos(){
    System.out.println("::::::Datos del perro::::::");
    System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nRaza: "+raza+"\nAltura (cm's): "+altura);
    
}
 
}
