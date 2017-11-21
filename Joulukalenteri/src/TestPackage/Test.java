package TestPackage;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

    public class Test {

        public static void audio() {
            try {
                File file = new File("Music/Jingle Bells - Boobs Dance.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(file));
                clip.start();
            } catch (Exception e) {
                System.err.println("Put the music.wav file in the sound folder if you want to play background music, only optional!");
            }
        }


        private static String arg;

        public static void main(String[] args){


        arg = "/Pictures/Jingle-Bells-Boobs-Dance.gif";
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JLabel l = new JLabel();
        ImageIcon icon = new ImageIcon(arg);    
        f.setSize(480, 360);
        f.setVisible(true);
        f.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        l.setIcon(icon);
        p.add(l);
        f.getContentPane().add(p);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        audio();

            }
        }
