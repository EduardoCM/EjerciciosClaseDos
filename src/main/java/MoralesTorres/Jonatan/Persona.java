package MoralesTorres.Jonatan;

public class Persona {
    public String nombre;
    public String sexo;
    
    public Persona madre;
    public Persona padre;
    
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }
    
    
}
