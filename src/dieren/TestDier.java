/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dieren;

/**
  *@author Barry Grevink
 * @version 1.0
 */
public class TestDier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dier dier = new Vogel(true, "duif", "Tortelduif ", "mais");
        System.out.println(dier.kenmerken());
        System.out.println("het aantal = " + dier.geefAantal());
        
        Vogel diera = new Vogel(false, "vink", "Streepvink ", "insecten ");
        System.out.println(diera.kenmerken());
        System.out.println("het aantal = " + diera.geefAantal());
        
        Zoogdier zoogdiera = new Zoogdier(true, "zwemt", "Flipper", "eten");
        System.out.println(zoogdiera.kenmerken());
        System.out.println("het aantal = " + zoogdiera.geefAantal());
        
        
        
        
        
    }
    
}
