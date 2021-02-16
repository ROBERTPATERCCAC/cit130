/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Client class of Lyric Machine
 * @author Robert
 */
public class SongWorld {
      public static void main(String[] args) {
    
    //  testLyricLine();
      buildLyricLineArray();
      
      } // close main

      public static void testLyricMachine() {
        // make instance of machine
        LyricMachine lm = new LyricMachine();
        lm.InitializeArray(5, 4);
        lm.readInLyricLine();
        lm.displayLyrics();

    }
      
      public static void testLyricLine() {
        // Creating an instance of lyric line
        LyricLine lineTest1 = new LyricLine();
        // Assign a lyric to our line
  //      lineTest1.lineText = "I walked along the avenue";
         
        LyricLine lineTest2 = new LyricLine("I never thought I'd meet a girl like you", 4480);
        displayLyricLineInfo(lineTest2);
} // close test Lyric Line
      
      /**
       * 
       */
      public static void buildLyricLineArray() {
         //Create an array size of how long the song is
         LyricLine[] superLyrics = new LyricLine[28]; 
         superLyrics[0] = new LyricLine("I walked along the avenue", 3000);
         superLyrics[1] = new LyricLine("I never thought I'd meet a girl like you", 5000);
         superLyrics[2] = new LyricLine("meet a girl like you", 5000);
         superLyrics[3] = new LyricLine("With auburn hair and tawny eyes", 3000);
         superLyrics[4] = new LyricLine("The kind of eyes that hypnotize me through", 4000);
         superLyrics[5] = new LyricLine("Hypnotize me through", 5000);
         superLyrics[6] = new LyricLine("And I ran, I ran so far away", 7000);
         superLyrics[7] = new LyricLine("I just ran, I ran all night and day", 6000);
         superLyrics[8] = new LyricLine("I couldn't get away", 14000);
         superLyrics[9] = new LyricLine("A cloud appears above your head", 4000);
         superLyrics[10] = new LyricLine("A beam of light comes shining down on you", 4000);
         superLyrics[11] = new LyricLine("Shining down on you", 6000);
         superLyrics[12] = new LyricLine("The cloud is moving nearer still", 3000);
         superLyrics[13] = new LyricLine("Aurora borealis comes in view", 5000);
         superLyrics[14] = new LyricLine("Aurora comes in view", 4000);
         superLyrics[15] = new LyricLine("And I ran, I ran so far away", 6000);
         superLyrics[16] = new LyricLine("I just ran, I ran all night and day", 6000);
         superLyrics[17] = new LyricLine("I couldn't get away", 35000);
         superLyrics[18] = new LyricLine("Reached out a hand to touch your face", 3000);
         superLyrics[19] = new LyricLine("You're slowly disappearing from my view", 5000);
         superLyrics[20] = new LyricLine("Pearing from my view", 5000);
         superLyrics[21] = new LyricLine("Reached out a hand to try again", 3000);
         superLyrics[22] = new LyricLine("I'm floating in a beam of light with you", 5000);
         superLyrics[23] = new LyricLine("A beam of light with you", 4000);
         superLyrics[24] = new LyricLine("And I ran, I ran so far away", 7000);
         superLyrics[25] = new LyricLine("I just ran, I ran all night and day", 6000);
         superLyrics[26] = new LyricLine("And I ran, I ran so far away", 6000);
         superLyrics[27] = new LyricLine("I just ran, I couldn't get away", 7000);
         karaokeSimulation(superLyrics);
                  
      } // close Test
      
      /**
       * Displays lines of lyrics with the timings
       */
      public static void karaokeSimulation(LyricLine[] kTape) {
          for(int line = 0; line < kTape.length; line++) {
              // Extract the lyric line object fro mthe current row and store temporary
              LyricLine tempLine = kTape[line];
              // dump lyric to console
              System.out.println(tempLine.lineText);
              try {
                  Thread.sleep(tempLine.timeToDisplayinMilli);
              } catch (InterruptedException ex) {
                  Logger.getLogger(SongWorld.class.getName()).log(Level.SEVERE, null, ex);
              } // close try catch
              
              
          } // close for
          
      } // close Karaoke
      
      /**
       * 
       * @param line 
       */
      private static void displayLyricLineInfo(LyricLine line) {
        System.out.println("Text: " + line.lineText);
        System.out.println("time to display: " + line.timeToDisplayinMilli);
          
      } // close utility methods

} // close class
