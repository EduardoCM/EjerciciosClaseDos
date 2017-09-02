package cuevasjuarez.lisset;
/**
 *
 * @author lisse
 */
public class Pizza {
    public int cantidad;
    public String ingrediente;
    public byte noIngrediente; 
    public boolean pedidoDomicilio;
    
    public void ingredientes(Pizza pizza){
        System.out.println("Su pizza llevara" + pizza.ingrediente );
    }
    
    public void pedirPizza(){
        System.out.println("Su pizza esta siendo preparada");
    }
    
    public String pedido(boolean pedidoDomicilio){
        if(pedidoDomicilio == true){
            String envio = "Su pizza llegara a su casa";
            return envio;
        }else{
            String envio = "Ya puede recoger su pizza en sucursal";
            return envio;
        }
        
    }
}
