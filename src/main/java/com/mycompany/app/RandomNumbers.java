package com.mycompany.app;

import java.util.Random;

public class RandomNumbers {
    // Class method for the calculation of a random integer
    public static int getRandomNumber(int nMinValue, int nMaxValue)
    {
        // Temp object of Random class
        Random r1;
        r1 = new Random();

        // Calculate range
        int nRange = nMaxValue - nMinValue;
        // Create random integer between min and max values
        int nResult = (int)(r1.nextDouble()*nRange) + nMinValue;
        // Return the created random integer
        return nResult;
    }
}
