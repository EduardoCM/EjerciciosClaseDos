package MoralesTorres.Jonatan;

public abstract class Animal {
    protected String nombre;
    protected String especie;
    
    protected abstract void comer(String alimento);
    
    protected abstract void dormir();
}
