package castillomendoza.eduardo.encapsulacion.template;

public abstract class Pedido {
    
    protected double importeSinIva;
    protected double importeIVA;
    protected double importeConIVA;

    protected abstract void calculaIVA();
    
    public void calculaPrecioConIVA(){
        this.calculaIVA();
        importeConIVA = importeSinIva + importeIVA;
    }

    public void setImporteSinIva(double importeSinIva) {
        this.importeSinIva = importeSinIva;
    }

    @Override
    public String toString() {
        return "Pedido{" + "importeSinIva=" + importeSinIva + ", importeIVA=" + importeIVA + ", importeConIVA=" + importeConIVA + '}';
    }
    
}
