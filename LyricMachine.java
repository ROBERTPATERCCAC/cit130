/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Scanner;

/**
 * Object "blueprint" class for a tool storing and displaying lyrics
 * @author Robert
 */
public class LyricMachine {
    String[][] lyrics;
    String songTitle;
    String artist;
    int releaseYear;
    
    /**
     * Call this method first to create the container in which we'll
     * store our song's lyrics
     * @param maxLinesInVerse
     * @param numVerses 
     */
    public void InitializeArray(int maxLinesInVerse, int numVerses) {
        // Check input parameters to ensure both our above zero
        if(maxLinesInVerse > 0 && numVerses > 0 ) {
        // Initialize array of a given size
        lyrics = new String[maxLinesInVerse][numVerses];
        System.out.println("Created array with max line count: " + lyrics.length);
        System.out.println("Created array with verse count: " + lyrics[0].length);  
        } else {
            System.out.println("Incorrect size input: Lines and verses must be above zero");
        } // close if/else
    } // close initialize array
    
    // Method to read in lyrics one line at a time
    public void readInLyricLine() {
        // IDEA: input line, hit enter
        // then some signal that you're
        // done with that verse
        
        // Create Scanner
        Scanner inScan = new Scanner (System.in);
        
        // Read in first verse only
        // Loop that  will ask user for line, then inject into current row of column 1
        for(int line=0;line < lyrics.length; line++) {
            //Read in a single line from user, store temp in UserLine
            String userLine = inScan.nextLine();
            // Inject userLine into the array
            lyrics[line][0] = userLine;
        } // end for over first column
        
    } // close ReadInLyrics
    
    
    /**
     * 
     */
    public void displayLyrics() {
        // Display values of the array
        // outer for loop iterates over the rows of our 6x3 array
        for(int row=0; row < lyrics.length; row++){
            System.out.println("Row " + Math.addExact(row, 0) + ":");
            // this inner for() loops over each column in our CURRENT row
            for(int col=0; col < lyrics[row].length; col++ ){
                // now, send to console the value of the current row and col
                System.out.println("Bin contents: " + lyrics[row][col]);
            } // close inner for over the columns
            // add a return character to start a new row on console
            System.out.println();
    } // close outer for over the rows
   
    }
    
} // close class
