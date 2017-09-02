
package alvareztadeo.juan;


public class Primate {
   
    public String nombre;
    public int añoNacimiento;
    public long areaBosque;
    public char genero;

    
    public void aullar(){
        System.out.println("Aullando");
    }
    public int brincarRama(){
        System.out.println(nombre + " esta brincando a otro arbol");
        return 0;
    }
    public void edad(int añoDeNacimiento){
        int edad=2017-añoDeNacimiento;
        System.out.println(nombre + " tiene " + edad + " años");        
    }
            
}
