package com.mycompany.app;
//import com.mycompany.app.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int nMin = 0;
        int nMax = 100;
//        RandomNumbers obj = new RandomNumbers();
        
    	System.out.println( "Hello World!" );
        System.out.println( "Look, an integer between " + nMin + " and " + nMax + ": " + RandomNumbers.getRandomNumber(nMin, nMax) );
    }
}
