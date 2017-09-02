package castillomendoza.eduardo.herencia;

public class Caballo extends Animal {

    @Override
    protected void comer(String alimento) {
    
        if(alimento.equals("Hierba")){
            System.out.println(nombre + " Comiendo " + alimento);
        }
    
    }

    @Override
    protected void dormir() {
        System.out.println("Durmiendo como caballo");
    }

    @Override
    protected void ruido() {
        System.out.println("Relinchar");
    }
    
}
