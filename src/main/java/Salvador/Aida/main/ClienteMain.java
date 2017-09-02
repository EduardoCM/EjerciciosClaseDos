/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salvador.Aida.main;

import Salvador.Aida.Cliente;

/**
 *
 * @author Aida
 */
public class ClienteMain {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.NumCliente = 1234;
        cliente.NombreCompleto = "Aida Salvador";
        cliente.SaldoFavor = 20000.00;
        cliente.SaldoDeudor = 5200.50;
        
        cliente.ConsultaCliente(cliente);
        double SaldoFavor = cliente.ConsultaSaldosFavor(cliente.SaldoFavor);
        double SaldoContra = cliente.ConsultaSaldosContra(cliente.SaldoDeudor);
        double SaldosTotales = cliente.ConsultaSaldosTotales(SaldoFavor, SaldoContra);
        
        System.out.println("Saldo a favor: " + SaldoFavor);
        System.out.println("Saldo deudor: " + SaldoContra);
        System.out.println("Saldos totales: " + SaldosTotales);
        
    }
}
