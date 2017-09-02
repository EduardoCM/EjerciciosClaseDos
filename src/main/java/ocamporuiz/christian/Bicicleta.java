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
        System.out.println("Se han guardados los datos de la bici " + marca + "con " + noEngranes + "engranes");
    }
    
    public void pedalea()
    {
        System.out.println("A tu manera, descompilado \n" +
        "En una clase que te lleve a todos lados \n" +
        "Un vallenato no declarado \n" +
        "Una cartica que yo guardo donde te escribíiiiIIIIIIIIII... ");
    }
    
    public int cuantoCuesta()
    {
        return precio;
    }
}
