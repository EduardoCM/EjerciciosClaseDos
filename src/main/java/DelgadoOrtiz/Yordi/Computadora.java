/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelgadoOrtiz.Yordi;

/**
 *
 * @author yordi
 */
public class Computadora {
    String marca;
    String procesador;
    int id;
    float precio;
    boolean estado;
    public void SetComputadora(String marca,String procesador,int id,float precio,boolean estado){
        this.marca=marca;
        this.procesador=procesador;
        this.id=id;
        this.precio=precio;
        this.estado=estado;
    
}

public boolean VerEstado(){
      
    return estado;
}
public void EncederComputadora(){
    this.estado=true;
}    
public void ApagarComputadora(){
    this.estado=false;
}

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", procesador=" + procesador + ", id=" + id + ", precio=" + precio + ", estado=" + estado + '}';
    }

}
