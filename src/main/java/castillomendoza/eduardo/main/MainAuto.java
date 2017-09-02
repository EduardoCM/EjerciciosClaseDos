package castillomendoza.eduardo.main;

import castillomendoza.eduardo.Auto;

public class MainAuto {
    
    public static void main(String[] args) {
        
        Auto auto = new Auto();
        
        auto.color = "Rojo";
        auto.marca = "BMW";
        
        auto.arrancar();
        auto.apagar();
    }
    
}
