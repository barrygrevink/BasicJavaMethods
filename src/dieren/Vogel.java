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
public class Vogel extends Dier {
    
    
    private boolean tam;
    private String soort;
    

    public Vogel(String naam, String voedsel) {
        super(naam, voedsel);
    }

    public Vogel(boolean tam, String soort, String naam, String voedsel) {
        super(naam, voedsel);
        this.tam = tam;
        this.soort = soort;
    }

    
    
    
    
    
    @Override
    public String kenmerken() {
        
        if (tam)
            return getNaam() + "behoort tot de soort: " + soort + " eet " + getVoedsel() + " is tam";
            return getNaam() + "behoort tot de soort: " + soort + " eet " + getVoedsel() + "leeft in het wild";
        
        
        
        
    }
    
}
