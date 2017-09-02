package MoralesTorres.Jonatan;

public class Persona {
    private String nombre;
    private String sexo;
    
    private Persona madre;
    private Persona padre;
    
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
    
    public Persona reproducirse(Persona persona){
        Persona hijo = null;
        if(persona == null){
            System.out.println("Error");
        }else if(this.sexo.equals(persona.sexo)){
            System.out.println("No se reproducieron exitosamente");
        }else{
            hijo = new Persona();
            if(this.sexo.equals("Hombre")){
                hijo.padre = this;
                hijo.madre = persona;
            }else{
                hijo.padre = persona;
                hijo.madre = this;
            }
            hijo.nombre = "JonyD";
            hijo.sexo = "Masculino";
            System.out.println("Se reproducieron exitosamente");
        }
        return hijo;
    }
}
