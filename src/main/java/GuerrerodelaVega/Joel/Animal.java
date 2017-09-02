package GuerrerodelaVega.Joel;

public class Animal {
    
    public String nombre, raza, color;
    public double peso;
    public int edad, id;  
    
    public void registrar(){
        System.out.println("El   id   es: "+ id);
        System.out.println("El nombre es: "+ nombre);
        System.out.println("La  raza  es: "+ raza);
        System.out.println("El color  es: "+ color);
        System.out.println("El  peso  es: "+ peso+ " Kg");
        System.out.println("La  edad  es: "+ edad+ " años");
        System.out.println("Registro completo ...  ");
    }
    public Animal registro(int id){
        return new Animal();
    }
    public void ladrar(){
        System.out.println("El perro ladra ");
    }
    public void dormir(){
        System.out.println("Duerme (-.-)zzZZ ");
    }
}