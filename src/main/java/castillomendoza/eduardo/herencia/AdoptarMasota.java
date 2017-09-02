package castillomendoza.eduardo.herencia;

public class AdoptarMasota {
    
    public static void main(String[] args) {
        
        TestPolimorfismo mascotas = new TestPolimorfismo();
        
        
        
       String instrucciones = mascotas.adoptarMascota(new Perro());
        
        System.out.println(instrucciones);
    }
    
}
