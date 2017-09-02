
package olveraneria.giselle;

public class Bibliotecario {

public String nombre;
public boolean activo;
public byte edad;
public int folio;


public Bibliotecario nuevobibliotecario(Bibliotecario bibliotecario) {
    System.out.println("Registrando bibliotecario "+bibliotecario.nombre);

return new Bibliotecario();
}

public void prestarlibro (String nombre){
    System.out.println("El bibliotecario " +nombre+" Esta prestando un libro");
}

public void mostrarinfo (){
     System.out.println("Nombre="+nombre);
     System.out.println("Activo="+activo);
     System.out.println("Edad="+edad);
     System.out.println("Folio="+folio);
}

public  void desactivar (int folio)
{
    if (activo=true){
       activo=false;
       System.out.println("El bibliotecario " +folio+" Esta desactivado");
    }
    else 
    {
       activo=true;
       System.out.println("El bibliotecario " +folio+" Esta activado");
    }
}

public int cambiarfolio(int folio)
{
    int folio2=321;
    System.out.println("El Folio " +folio+" esta cambiando a "+folio2);
    this.folio=folio2;
    return folio;
}
    
}
