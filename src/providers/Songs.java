package providers;


import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gustavomiara
 */
public class Songs {

    static InputStream music;
    

    
    static public void startInitialSong(){
        try {
            music = new FileInputStream(new File("src/songs/javaRPG.wav"));
//            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(music);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            System.out.println("providers.songs.initialSong()" + e.getLocalizedMessage());
        }
    }
    
    static public void stopInitialSong(){
        try {
            AudioPlayer.player.stop(music);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            System.out.println("providers.songs.initialSong()" + e.getLocalizedMessage());
        }
    }
    
    static public void loadGamesSongs(){
    
    }
       

}
