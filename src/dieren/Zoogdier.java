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
public class Zoogdier extends Dier {
    
    private boolean zoogdier;
    private String zwemt;
    

    public Zoogdier(String naam, String voedsel) {
        super(naam, voedsel);
    }

    public Zoogdier(boolean zoogdier, String zwemt, String naam, String voedsel) {
        super(naam, voedsel);
        this.zoogdier = zoogdier;
        this.zwemt = zwemt;
    }

    
    
    
    
    
    
    
    
    @Override
    public String kenmerken() {
        
            if (zoogdier)
                return "eet vloeibaar voedsel" + zwemt + "en zijn naam is " + naam;
            return "eet geen vloeibaar voedsel" + zwemt + "en heeft geen naam";
        
        
       
    }
    
    
    
    
    
}
