
package villanueva.jacki.main;

import villanuevaromo.jacqueline.Celular;


public class MainCelular {
    public static void main (String[] args) {
        Celular jacki = new Celular();
        jacki.marca = "NOKIA";
        jacki.modelo = "NK10023";
        jacki.color = "AZUL";
        jacki.IMEI = 556254762;
        jacki.compania = "TELCEL";
        jacki.numeroCelular = 432105852;
        jacki.pantallaTactil = true;
        jacki.sistemaOperativo = "WINDOWS PHONE";
       
     
        jacki.mostrarDatos();
        
    }
      
}
