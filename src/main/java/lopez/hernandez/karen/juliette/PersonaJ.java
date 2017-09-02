/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopez.hernandez.karen.juliette;

/**
 *
 * @author Juliette
 */
public class PersonaJ {
    public String nombre;
    public String apellido;
    public String profesion;
    public int edad;
    public int id;
    public double peso;
    public boolean vive;
    
    
   
  public PersonaJ BuscarPersonaJ(int id){
        return new PersonaJ();
    }
  
  public void modificarPersona(PersonaJ persona){
      
  }
  
  public void mostrarDatos(){ //método para msotrar datos
      System.out.println("============ Informacion de persona =============");
      System.out.println("id: " + id);
      System.out.println("Nombre: " + nombre);
      System.out.println("Apellido: " + apellido);
      System.out.println("Profesion: " + profesion);
      System.out.println("Peso: " + peso);
  }
}
