package castillomendoza.eduardo.encapsulacion.template;

public class PedidoBrasil extends Pedido {

    @Override
    protected void calculaIVA() {
        importeIVA = importeSinIva * .20;
    }
    
    
}
