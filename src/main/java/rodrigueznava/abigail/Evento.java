/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigueznava.abigail;

/**
 *
 * @author Abigail
 */
public class Evento {
    public int noEvento;
    public String nombre;
    public float entrada;
    public char estatus;
    public String lugar;
    public byte cupo;
            
    public void crearEvento(Evento evento)  {
        System.out.println(" Creando evento  " + evento.nombre );
    }
            
    public char obtenerStatusEvento(){
        return this.estatus;
    }
    
    public void cancelarEvento(){
        estatus = 'C';
        System.out.println("Evento cancelado");
    }
    
    public void mostrarEvento(){
        System.out.println("------- Evento --------");
        System.out.println("noEvento: " + noEvento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Lugar: " + lugar);
        System.out.println("Cupo: " + cupo);
        System.out.println("Entrada: " + entrada);
        System.out.println("Estatus: " + estatus);

    }
    
}
