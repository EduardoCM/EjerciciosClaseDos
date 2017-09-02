/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocamporuiz.christian;

/**
 *
 * @author ChrisO
 */
public class Bicicleta {
    public String marca;
    public short noEngranes;
    public int precio;
    
    public void setBici(String ma, short e, int p)
    {
        marca=ma;
        noEngranes=e;
        precio=p;
    }
    
    public void pedalea()
    {
        System.out.println("A tu manera, descomplicado \n" +
        "En una bici que te lleve a todos lados \n" +
        "Un vallenato desesperado \n" +
        "Una cartica que yo guardo donde te escribíiiiIIIIIIIIII... ");
    }
    
    public int cuantoCuesta()
    {
        return precio;
    }
}
