/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reyes.guerrero.omar;

/**
 *
 * @author jarvis
 */
public class Auto {
    public String marca;
    public String color;
    public int numSerie;
    public short numID;
    public double precio;
    public boolean b;
    
    public void arrancar()
    {
        System.out.println("Arrancando Auto"+marca);
        
    }
    
    public void apagar()
    {
        System.out.println("Apagando Auto"+marca);
    }
   
    
    public boolean existencia(short numID)
    {
        
    if(numID-100>0)
    {
        return b=true;
    }
    else
    {
        return b=false;
    }
            
    }
    
    
}
