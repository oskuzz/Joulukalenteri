/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author osku0
 */
public class Luukku {

    private boolean avattu;
    private String music;
    private boolean avattavissa;

    public Luukku(boolean avattavissa, String music, boolean avattu) {
        this.avattu = avattu;
        this.music = music;
        this.avattavissa = avattavissa;
    }

    public void setAvattu(boolean avattu) {
        this.avattu = avattu;
    }

    public void setAvattavissa(boolean avattavissa) {
        this.avattavissa = avattavissa;
    }

    public String getMusic() {
        return music;
    }

    public boolean getAvattu() {
        return avattu;
    }

    public boolean getAvattavissa() {
        return avattavissa;
    }
}
