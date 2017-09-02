package MoralesTorres.Jonatan;

public class Caballo extends Animal{

    @Override
    protected void comer(String alimento) {
        if(alimento.equals("Pasto")){
            System.out.println(this.nombre + " comiendo: " + alimento);
        }
    }

    @Override
    protected void dormir() {
        System.out.println(this.nombre + " durmiendo como caballo");
    }
    
}
