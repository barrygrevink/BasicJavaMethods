/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dieren;

/**
 *
 * @author Barry Grevink
 * @version 1.0
 */
public abstract class Dier {
    
    
    String naam;
    private String voedsel;
    static int aantal =0;

    public Dier(String naam, String voedsel) {
        this.naam = naam;
        this.voedsel = voedsel;
        aantal++;
        
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoedsel() {
        return voedsel;
    }

    public void setVoedsel(String voedsel) {
        this.voedsel = voedsel;
    }
    
    
    
    public abstract String kenmerken();
    
    
    final int geefAantal() {
    
        return aantal;
    
    }
    
    
}
