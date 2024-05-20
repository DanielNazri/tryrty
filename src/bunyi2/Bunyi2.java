/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bunyi2;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import javax.sound.sampled.*;


/**
 *
 * @author muhammaddanielmohdnazri
 */
public class Bunyi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        
        URL url = new URL("https://www2.cs.uic.edu/~i101/SoundFiles/PinkPanther30.wav");
        Scanner x = new Scanner(System.in);
        File file = new File("/Users/muhammaddanielmohdnazri/Downloads/nasyid.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        while(true){
            clip.start();
           
        }
        
        //afiqah najla busuk gila
            
        
        
        
        
        
    }
    
}
