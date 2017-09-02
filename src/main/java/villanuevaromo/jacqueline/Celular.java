
package villanuevaromo.jacqueline;


public class Celular {
    public String marca;
    public String color;
    public long IMEI;
    public String compania;
    public String sistemaOperativo;
    public boolean pantallaTactil;
    public String modelo;
    public int numeroCelular;


    public void agregarCelular(Celular celular){
    }
    public void darDeBaja (long IMEI){
    }
    public Celular buscarCelular(int numCelular){
        return new Celular();
    }
    public void modificarCelular (long IMEI){
        
    }
    public void mostrarDatos(){
        System.out.println ("===========INFORMACION DEL CELULAR===========");
        System.out.println("Marca: " + marca);
        System.out.println ("Compñia:" + compania);
        System.out.println("Identificador: " + IMEI);
        System.out.println("SO: " + sistemaOperativo);
        System.out.println("Numero Celular: " + numeroCelular);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Pantalla Tactil: " + pantallaTactil);
        
    }
}
        