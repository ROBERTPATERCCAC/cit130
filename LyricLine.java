/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * Models a single line of a lyric in a song
 * @author Robert
 */
public class LyricLine {
    // member variables 
    public String lineText;
    public long timeToDisplayinMilli;
    
    // Default, no-argument constructor lives here\
    // Constructor names are always identical to the class name with optional with input arguments
    /**
     * Constructor names 
     */
    public LyricLine() {
        // Initializing member variables to sensible defaults
        lineText = "[no lyric]";
        timeToDisplayinMilli = 1000;
    } // close no-arg constrctor
    
    /**
     * Creates an instance of LyricLine
     * @param lt
     * @param ms 
     */
    public LyricLine(String lt, long ms) {
        System.out.println("Inside two-arg constructor");
        System.out.println("Received lt: " + lt);
        System.out.println("Received ms: " + ms);

        // Transfer the input parameters to our member variables
        lineText = lt;
        timeToDisplayinMilli = ms;
        
    } // close two-arg constructor
    
    
} // close class
