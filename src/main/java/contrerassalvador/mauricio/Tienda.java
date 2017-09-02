
package contrerassalvador.mauricio;

public class Tienda {
    
    public String producto;
    public int precio;
    public int idProducto;
    public int numeroDePiezas;
    
    public void comprar(Tienda tienda){
        
        System.out.println("Acabas de comprar: " + tienda.producto);
        
    }
    
    public void vender(int idProducto){
    
        System.out.println("Producto con numero de ID " + idProducto + " dado de alta");
    }
    
    public Tienda buscar(int idProducto){
        
        return new Tienda();
    }
    
    public void mostrar(){
    
        System.out.println("Nombre del producto " + producto);
        System.out.println("Precio del producto " + precio + " pesos");
        System.out.println("Id del producto " + idProducto);
        System.out.println("Piezas " + numeroDePiezas);
    }
}
