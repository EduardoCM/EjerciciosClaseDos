package castillomendoza.eduardo.encapsulacion.template;

public class PedidoMexico extends Pedido {

    @Override
    protected void calculaIVA() {
       importeIVA = importeSinIva * .16;
    }
    
    
    
}
