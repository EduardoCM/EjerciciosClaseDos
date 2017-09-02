/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garciamolina.ale;

import java.util.ArrayList;

/**
 *
 * @author AleAlejandro
 */
public class Cantante {
    
    //Atributos
    String nombre;
    int edad;
    String sexo;
    String nacionalidad;
    //String[ ] canciones = new  String[20];
    ArrayList<String> canciones = new ArrayList<String>();
    int contador=0;
    
    public void datos_cantante(){
        System.out.println("\t--Datos del Cantante--");
        System.out.println("\tCantante: " + nombre);
        System.out.println("\tEdad: " +edad);
        System.out.println("\tNacionalidad: " + nacionalidad);
        System.out.println("\tSexo: " + sexo);
    }
    
    public void inicializa_cantante(String nombre, int edad, String sexo, String nacionalidad){
        this.nombre= nombre;
        this.edad=edad;
        this.nacionalidad = nacionalidad;
        this.sexo=sexo;
        datos_cantante();
    }
    
    public void agregar_cancion(String cancion){
        canciones.add(cancion);
        System.out.println("Se ha agregado la cancion: " + cancion);
    }
    
    public void eliminar_cancion(String cancion){
    if(canciones.indexOf(cancion)!=-1){
        canciones.remove(cancion);
        System.out.println("Se ha eliminado la cancion: " + cancion);
    }
    else {
        System.out.println("El artista " + nombre + " no cuenta con la cancion "+ cancion + " en su repertorio");
    }   
    }
    
   public int devuelve_canciones(){
   return canciones.size();
   }
    
    
    
}
