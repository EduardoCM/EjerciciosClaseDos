/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orozco.aguilar.alejandra;

/**
 *
 * @author Ale
 */
public class IndiceM {
    
    int id;
    String nombre;
    char sexo;
    int edad;
    double estatura;
    double peso;
    double res;
    
    public void bienvenida(){
        System.out.println("Hola " + nombre + " bienvendo");
    }
    public void consultaDatos (int id) {
        System.out.println("Tus datos son");
        System.out.println("Nombre:"+nombre);
        System.out.println("Sexo:"+sexo);
        System.out.println("Edad:"+ edad );
        System.out.println("Peso:"+ peso);
        System.out.println("Estatura:"+ estatura);
    }
    public double indice(double peso, double estatura){
        res= peso/estatura;
        return res;
    }
    
    
    
}
