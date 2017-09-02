package castillomendoza.eduardo.herencia;

public class TestPolimorfismo {
    
    
    public static void main(String[] args) {
        
        Animal animalL = new Leon();
        Animal animalC = new Caballo();       
    }
    
    
    public String adoptarMascota(Animal animal){
        String instrucciones = "Instrucciones para: ";
        
        if(animal instanceof Leon){
            instrucciones += " Come mucha carne y tambien Humanos, !!! Aguas !!!";
        }else if(animal instanceof Caballo){
            instrucciones += " Hay que peinarlo, darle de comer cebada y seras muy feliz";
        } else if(animal instanceof Perro){
            instrucciones += " hay que sacarlo a pasear y bañarlo";
        }
        return instrucciones;
                
    }
}
