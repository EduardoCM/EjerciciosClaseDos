package moctezumagutierrez.sebastian.main;

import moctezumagutierrez.sebastian.Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Animal leon = new Animal("Leon", "Carnivoro", (byte)4, 'M');
        String especie = leon.identificarEspecie();
        byte numeroPatas = leon.contarPatas(especie);
        char genero = leon.identificarGenero(leon);
        
        System.out.println("La especie es: " + especie);
        System.out.println("El numero de pata de la especie " + especie + " son: " + numeroPatas);
        
        leon.alimentar();
    }
}
