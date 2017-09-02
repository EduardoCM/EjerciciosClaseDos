/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orozco.aguilar.alejandra;
import orozco.aguilar.alejandra.IndiceM;
/**
 *
 * @author Ale
 */
public class AleMain {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double imc;
        IndiceM persona = new IndiceM();
        
        persona.edad = 18;
        persona.estatura = 1.57; 
        persona.peso = 42.5;
        persona.id= 517;
        persona.nombre="Alejandra";
        persona.sexo ='f';
        
        persona.bienvenida();
        persona.consultaDatos(persona.id);
        imc = persona.indice(persona.peso,persona.estatura);
        System.out.println("Tu indice de masa corporal es:"+imc);
        
        
        
    }
    
}
