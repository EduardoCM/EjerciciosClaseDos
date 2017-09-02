package MoralesTorres.Jonatan;

public class Persona {
    public String nombre;
    public String sexo;
    
    Persona madre;
    Persona padre;
    
    public Persona reproducirse(Persona persona){
        Persona hijo = null;
        if(this.sexo.equals(persona.sexo)){
            System.out.println("No se reproducieron exitosamente");
        }else{
            //try{
                hijo = new Persona();
                //this.padre = this;
                //this.madre = persona;
                hijo.padre = this;
                hijo.madre = persona;
                hijo.nombre = "JonyD";
                hijo.sexo = "Masculino";
                System.out.println("Se reproducieron exitosamente");
            //}catch(Exception e){}
        }
        return hijo;
    }
}
