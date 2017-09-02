/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salvador.Aida;

/**
 *
 * @author Aida
 */
public class Cliente {
    /*Atributos*/
    public int NumCliente;
    public String NombreCompleto;
    public double SaldoFavor;
    public double SaldoDeudor;
    
    public void ConsultaCliente(Cliente cliente){
         System.out.println("Numero Cliente: " + cliente.NumCliente );
         System.out.println("NombreCompleto: " + cliente.NombreCompleto);
         System.out.println("");
         System.out.println("");
    }
    
    public double ConsultaSaldosFavor (double Favor){
        return Favor;
    }
    
    public double ConsultaSaldosContra (double Contra){
        return Contra;
    }
    
    public double ConsultaSaldosTotales (double Favor, double Contra){
        
        return Favor - Contra;
    }
   
    /*Metodos: void, return, reciba parametros*/
}
