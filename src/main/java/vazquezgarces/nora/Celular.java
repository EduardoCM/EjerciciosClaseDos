package vazquezgarces.nora;

public class Celular 
{
    public byte ram;
    public short memoria;
    public short saldo; 
    public String marca;
    public boolean resistenciaAgua;
    
    public void datosMoviles(int saldo)
    {
        System.out.println("Conexion exitosa.");
    }
    
    public void wiFi()
    {
        System.out.println("Conexion exitosa.");
    }
    
    public int numeroTelefonico()
    {
        return 55396825;
    }
}
