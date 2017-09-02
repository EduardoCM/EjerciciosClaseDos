package castillomendoza.eduardo.encapsulacion.template;

public class Usuario {
    
    public static void main(String[] args) {
        
        Pedido pedidoMx = new PedidoMexico();
        pedidoMx.setImporteSinIva(1_000);
        pedidoMx.calculaPrecioConIVA();
        System.out.println(pedidoMx);
        
        Pedido pedidoBr = new PedidoBrasil();
        pedidoBr.setImporteSinIva(1_000);
        pedidoBr.calculaPrecioConIVA();
        System.out.println(pedidoBr);
        
        
    }
    
}
