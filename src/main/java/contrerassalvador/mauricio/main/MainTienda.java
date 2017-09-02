
package contrerassalvador.mauricio.main;

import contrerassalvador.mauricio.Tienda;

public class MainTienda {
    
    public static void main(String[] args) {
    
        
        Tienda laptop = new Tienda();
        laptop.producto = "Laptop HP";
        laptop.idProducto = 123;
        laptop.precio = 10000;
        laptop.numeroDePiezas = 1;
        
        laptop.comprar(laptop);
        laptop.vender(laptop.idProducto);
        laptop.mostrar();
       
    }
    
    
    
    
}
