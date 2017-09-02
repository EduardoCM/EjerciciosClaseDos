package MoralesTorres.Jonatan;

public class Leon extends Animal{

    @Override
    protected void comer(String alimento) {
        if(alimento.equals("Carne")){
            System.out.println(this.nombre + " comiendo: " + alimento);
        }
    }

    @Override
    protected void dormir() {
        System.out.println(this.nombre + " durmiendo como leon");
    }
    
}
