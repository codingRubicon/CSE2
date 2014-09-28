// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 22th, 2014
//
// Time of Day Calculator
//
// 1. Prompt the user for the number of seconds passed in the day
// 2. Return the time of day in conventional form
//

import java.util.Scanner;

public class TimePadding {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in ); // set up user input method
        
        System.out.println("Enter the number of seconds elapsed: "); // ask for the number of seconds
        
        int numSec = myScanner.nextInt(); // create an int for the number of seconds the user input
        
        int hours = (int)(Math.ceil(numSec / 3600)); // the seconds divided by 3600 gives the number of hours
        int minutes = (int)(Math.ceil( (numSec - (hours * 3600) ) / 60)); // the remaining seconds divided by 60 gives minutes
        int seconds = (int)(numSec - (3600*hours) - (60*minutes)); // all that remains are the seconds
        
        System.out.println(""); // add a line for spacing
        
        // for the next part, I check if any of the units are less than 10. If they are, I print them with an added 0 before it to space it out correctly
        
        if(hours<10)
        {
            System.out.print("0"+hours);
        }
        else
        {
            System.out.print(hours);
        }
        if(minutes<10)
        {
            System.out.print(":0" +minutes);
        }
        else
        {
            System.out.print(":" +minutes);
        }
        if(seconds<10)
        {
            System.out.print(":0" +seconds);
        }
        else
        {
            System.out.println(":" +seconds);
        }
    }
}