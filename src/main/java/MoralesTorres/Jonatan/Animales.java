package MoralesTorres.Jonatan;

public class Animales {
    public static void main(String[] args) {
        Caballo caballo = new Caballo();
        caballo.nombre = "Spirit";
        caballo.especie = "Mustang";
        caballo.comer("Pasto");
        
        Leon leon = new Leon();
        leon.nombre = "Simba";
        leon.comer("Carne");
        leon.dormir();
    }
 
}
