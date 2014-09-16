// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 12th, 2014
//
// User Entered Bicycle Data
//
// Ask the user for two digits:
//  1) number of wheel turns
//  2) time in seconds
//
// Print out distance traveled and average speed (assuming bike wheel is 27in dia)
//

import java.util.Scanner;

public class Bicycle{
    
    public static void main(String[] args){
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        
        // ask the user for the inputs
        System.out.print("Enter the number of wheel turns during the trip: ");
        
        int nTurns = myScanner.nextInt();
        
        System.out.print("Enter the time in seconds of the trip: ");
        
        double time = myScanner.nextDouble();
        
        // wheel diameter is given at 27 in.
        //5280*12 = 63360 (in/mi)
        
        
        // calculate wheel circumference
        double wLength = 27*3.14159;
        
        // calculate total distance, average speed, and time in minutes
        double dTot = Math.round (((nTurns*wLength)/63360)*100)/100.0;
        double sAvg = Math.round((dTot/(time/3600))*100)/100.0;
        double tMin = time/60;
        
        
        // print out the answers
        System.out.println("The total distance traveled was " +dTot +" miles, and took " +tMin +" minutes.");
        System.out.println("The average speed during the trip was: " +sAvg +" mph");
        
    }
}