/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vlc;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.binding.RuntimeUtil;
import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.fullscreen.FullScreenStrategy;
import uk.co.caprica.vlcj.player.embedded.fullscreen.windows.Win32FullScreenStrategy;

public class VlcNative {
    public static void main(String args[]){
        
        JFrame f = new JFrame();
        f.setLocation(100,100);
        f.setSize(1000,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        Canvas c = new Canvas();
        c.setBackground(Color.black);
        JPanel p  = new JPanel();
        p.setLayout(new BorderLayout());
        
        p.add(c);
        f.add(p);
        
        NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "/usr/share/vlc");
        Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(),LibVlc.class);
        
        MediaPlayerFactory mpf = new MediaPlayerFactory();
        
        
    }
}
