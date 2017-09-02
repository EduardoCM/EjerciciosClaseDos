package castillomendoza.eduardo.herencia;

public abstract class Animal {
    
    protected String nombre;
    protected String especie;
    
    protected abstract void ruido();
    
    protected abstract void comer(String alimento);
    
    
    protected abstract void dormir();
    
}
