
package olveraneria.giselle.main;

import olveraneria.giselle.Bibliotecario;

public class MainBibliotecario {

    public static void main(String[] args) {
        
        Bibliotecario b1 = new Bibliotecario();
        b1.nombre="Giselle";
        b1.edad=21;
        b1.folio=123;
        b1.activo=true;
       
        b1.mostrarinfo();
        b1.nuevobibliotecario(b1);
        b1.prestarlibro(b1.nombre);
        b1.desactivar(b1.folio);
                b1.cambiarfolio(b1.folio);

        b1.mostrarinfo();

    }
           
}
