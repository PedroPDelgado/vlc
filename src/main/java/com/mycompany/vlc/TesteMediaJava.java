
package com.mycompany.vlc;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Reproducao de um ficheiro wav usando apenas a API do Java. 
 * @author Grupo 44
 */



public class TesteMediaJava {
   
    public static void main(String args[]) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{
        
                File f = new File("/home/pedro/Music/rr.wav").getAbsoluteFile();
                AudioInputStream ais = AudioSystem.getAudioInputStream(f);
                Clip clip = AudioSystem.getClip();
                clip.open(ais);
                clip.start();
                Thread t = new Thread();
                t.sleep(clip.getMicrosecondLength());
                
                 
                
    }
}
