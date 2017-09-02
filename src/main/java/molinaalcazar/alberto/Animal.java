/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molinaalcazar.alberto;

/**
 *
 * @author Alcazar
 */
public class Animal {
    public int edad;
    public String nombre;
    public double peso;
    public String sexo;

    
     
    
   
    public void nombre(Animal animal){
        System.out.println("El nombre del animal es : "+ animal.nombre);
    }
    public void sexo (String sexo){
        System.out.println("El sexo del Animal es : "+sexo);
    }
    public Animal buscarAnimal(String nombre){
        System.out.println("Buscando Animal: "+nombre);
        
        return new Animal();
    }
   
       
    public void mostrarDatos(){
        System.out.println("==========INFORMACION ANIMAL=========");
        System.out.println("Nombre Animal: "+ nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Peso: "+ peso);
        System.out.println("Sexo: "+sexo);
     
    }
}