package vazquezgarces.nora.main;

import vazquezgarces.nora.Celular;

public class MainCelular 
{
    public static void main(String[] args) 
    {
        Celular celular = new Celular();
        celular.ram = 4;
        celular.memoria = 128; 
        celular.saldo = 1000; 
        celular.marca = "Samsung";
        celular.resistenciaAgua = true; 
        
        System.out.println("RAM: " + celular.ram + "GB");
        System.out.println("Memoria: " + celular.memoria + "GB");
        System.out.println("Saldo: $" + celular.saldo);
        System.out.println("Marca: " + celular.marca);
        System.out.println("Resistencia al Agua: " + celular.resistenciaAgua);
        celular.datosMoviles(celular.saldo);
        celular.wiFi();
        System.out.println("El numero telefonico es: " + celular.numeroTelefonico());
    }
}
