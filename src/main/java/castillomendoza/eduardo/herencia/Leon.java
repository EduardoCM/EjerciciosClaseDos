package castillomendoza.eduardo.herencia;

public class Leon extends Animal {
    
    
    

    @Override
    protected void comer(String alimento) {
       if(alimento.equals("Carne")){
           System.out.println(nombre + " Esta comiendo " + alimento);
       }
    }

    @Override
    protected void dormir() {
        System.out.println("Durmiendo como Leon");
    }

    @Override
    protected void ruido() {
        System.out.println("Rugir");
    }
    
    
}
