package cuevasjuarez.lisset.main;
import cuevasjuarez.lisset.Pizza;
/**
 *
 * @author lisse
 */
public class Main {
    public static void main(String[] args){
        Pizza uno = new Pizza();
        uno.ingrediente = "Peperoni";
        uno.cantidad = 50;
        uno.noIngrediente = 3;
        uno.pedidoDomicilio = true;
        
        uno.ingredientes(uno);
        uno.pedido(uno.pedidoDomicilio);
        uno.pedirPizza();
    }
}
