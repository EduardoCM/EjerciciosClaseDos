/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelgadoOrtiz.Yordi.Main;
import DelgadoOrtiz.Yordi.Computadora;


/**
 *
 * @author yordi    public static void main(String[] args) {

 */
public class Main {
    public static void main(String[] args) {
        Computadora HP=new Computadora();
        HP.SetComputadora("HP","Corei5",1,10000,false);
        HP.EncederComputadora();
        System.out.println(HP.VerEstado()); 
        System.out.println(HP);
    }
   
    
    
}
