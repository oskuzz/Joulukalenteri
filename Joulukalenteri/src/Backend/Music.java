/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.,
 */
package Backend;

import java.io.File;
import javax.sound.sampled.*;

public class Music {

    private Clip clip;

    public void audio(String audio) {
        try {
            if (!audio.equals("")) {
                File file = new File(audio);
                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(file));
                clip.start();
            }
        } catch (Exception e) {
            System.err.println("Put the music.wav file in the sound folder if you want to play background music, only optional!");
        }
    }

    

    public void stopMusic() {
        if (clip != null) {
            clip.stop();
        }
    }
}
