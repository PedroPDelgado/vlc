package com.mycompany.vlc;

import javax.swing.JFrame;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

public class TesteMedia {

    private final JFrame frame;

    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;

    public TesteMedia() throws InterruptedException {
        frame = new JFrame("Media Player");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        frame.setContentPane(mediaPlayerComponent);

        frame.setVisible(true);

        mediaPlayerComponent.mediaPlayer().media().play("/home/pedro/Videos/rr.mp4");
        Thread t = new Thread();
        mediaPlayerComponent.mediaPlayer().controls().pause();
        t.sleep(1000);
        mediaPlayerComponent.mediaPlayer().controls().play();
       //mediaPlayerComponent.mediaPlayer().media().play("/home/pedro/Music/rr.wav");
    }
    
    public static void main(String[] args) throws InterruptedException {
        TesteMedia thisApp = new TesteMedia();
    }
    
}