/*REFERENCES
  ADDITIONAL FEATURE - SOUND (https://www.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html)
  ADDITIONAL FEATURE - SOUND (https://docs.oracle.com/javase/7/docs/api/java/io/File.html#pathSeparatorChar)
 */
package PROG;

import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.WindowEvent;

public class AdditionalFeatureAudio {

    private static String soundFilePath = "";
    Clip clip;

    public AdditionalFeatureAudio(String sfp) {

        soundFilePath = sfp;

        try {
            //STREAM AUDIO
            File soundFile = new File(soundFilePath);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

            //GET SOUND CLIP RESOURCE 
            clip = AudioSystem.getClip();

            //OPEN CLIP AND LOAD STREAM AUDIO
            clip.open(audioIn);
            clip.start();

            //EXCEPTIONS 
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        clip.stop();
    }
}
