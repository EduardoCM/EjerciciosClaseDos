package MoralesTorres.Jonatan;

public class Animales {
    public static void main(String[] args) {
        Animal caballo = new Caballo();
        caballo.nombre = "Spirit";
        caballo.especie = "Mustang";
        caballo.comer("Pasto");
        
        Animal leon = new Leon();
        leon.nombre = "Simba";
        leon.comer("Carne");
        leon.dormir();
        
        System.out.println(adoptarMascota(leon));
    }
    
    public static String adoptarMascota(Animal animal){
        String instrucciones = "Instrucciones: ";
        if(animal instanceof Leon){
            instrucciones += "leon come mucho";
        }else if(animal instanceof Caballo){
            instrucciones += "caballo muchos cuidados";
        }
        return instrucciones;
    }
}
