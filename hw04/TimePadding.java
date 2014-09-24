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
        
        Scanner myScanner = new Scanner( System.in );
        
        System.out.println("Enter the number of seconds elapsed: ");
        
        int numSec = myScanner.nextInt();
        
        int hours = Math.ceil(numSec / 3600) - 1;
        int minutes = Math.ceil( (numSec - (hours * 3600) ) / 60) - 1;
        int seconds = numSec - (3600*hours) - (60*minutes);
        
        System.out.println(hours +":" +minutes +":" +seconds);
        
    }
}