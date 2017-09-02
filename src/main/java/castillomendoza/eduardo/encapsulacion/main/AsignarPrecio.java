package castillomendoza.eduardo.encapsulacion.main;

import castillomendoza.eduardo.encapsulacion.Camisa;

public class AsignarPrecio {
    
    public static void main(String[] args) {
        
        
        Camisa camisa = new Camisa();
        camisa.setPrecio(100);
        camisa.setTalla(20);
        camisa.setColor("ROJO");
        camisa.setCuello("V");
        
        
        System.out.println(camisa);
        
        
        
    }
    
}
