package castillomendoza.eduardo.herencia;

public class TestAnimales {
    
    
    public static void main(String[] args) {
        
        Caballo spirit = new Caballo();
        spirit.nombre = "Spirit";
        spirit.especie = "Mustang";
        spirit.comer("Carne");
        spirit.dormir();
        
        
        Leon simba = new Leon();
        simba.nombre = "Simba";
        simba.especie = "Rey Leon";
        simba.comer("Hierba");
        simba.dormir();
        
        
    }
    
}
