package moctezumagutierrez.sebastian;

public class Animal {
    public String especie;
    public String clasificacion;
    public byte numeroPatas;
    public char genero;
    
    public Animal(String especie, String clasificacion, byte numeroPatas, char genero){
        this.especie = especie;
        this.clasificacion = clasificacion;
        this.numeroPatas = numeroPatas;
        this.genero = genero;
    }
    
    public String identificarEspecie(){
        return this.especie;
    }
    
    public void alimentar(){
        if (this.clasificacion == "Carnivoro")
            System.out.println("El/la " + this.especie + " esta comiendo carne");
        else if(this.clasificacion == "Herbivoro")
            System.out.println("El/la " + this.especie + " esta comiendo hierba");
        else
            System.out.println("El/la " + this.especie + " esta comiendo de todo");
}
    
    public byte contarPatas(String especie){
        return this.numeroPatas;
    }
    
    public char identificarGenero(Animal animal){
        return this.genero;
    }
}
