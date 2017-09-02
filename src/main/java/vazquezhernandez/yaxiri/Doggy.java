/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vazquezhernandez.yaxiri;

/**
 *
 * @author yax
 */
public class Doggy {
    
    public String nombre;
    public int peso;
    public byte edad;
    public boolean adoptado;
    
    public void buscar(){
        System.out.println("Buscando a " + nombre );
        System.out.println("Datos: ");
        System.out.println(peso + " kg ");
        System.out.println(edad + " años ");
    }
    public int generarCodigo(){
        int codigo = peso * 642;
        System.out.println("Codigo generado: "+ codigo);
        return codigo;
    }
    public void adoptado(boolean adoptado){
        if(adoptado == true){
            System.out.println(nombre +" ya esta adoptado");
        }else{
            System.out.println(nombre +" no esta adoptado");
        }
    }
    
}
