// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 22th, 2014
//
// Days in a Month Calculator
//
// 1. Prompts the user for an int indicating the month (1-12)
// 2. Returns the number of days in the month
//
// *if february is entered, user is asked for the year to specify if leap year
//

import java.util.Scanner;

public class Month {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in ); // set up the user input method
        
        System.out.print("Enter a number (1-12) to indicate the month: "); // ask the user for the month
        
        boolean isInt = myScanner.hasNextInt(); // creates a boolean which will be set to either true or false depending on whether or not the user input is an int
        
        if(isInt == false) // if the input isn't an int, display an error message and end the program
        {
            System.out.println("You did not enter an int");
            return;
        }
        
        int month = myScanner.nextInt(); // set the user input to an int
        
        int year = 0000; // intialize the year integer
        
        if(month>12 || month<1) // checks that the input is within the range of acceptable entries
        {
            System.out.print("You did not enter an int between 1 and 12"); // prints an error message and ends the program if not within the acceptable boundaries
            return;
        }
        
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) // if a month that has 31 days, print that and end program
        {
            System.out.println("The month has 31 days.");
            return;
        }
        else if(month != 2) // any other month that's not feb will have 30 days so print that and end program
        {
            System.out.println("The month has 30 days.");
            return;
        }
        else // if feb, ask for the year
        {
            
            // a leap year is divisible by four, unless it's a century year in which it must also be divisible by 400
            System.out.println("What is the year?");
            year = myScanner.nextInt();
            if(year % 100 == 0) // if a century year..
            {
                if(year % 400 == 0) //...check that it's divisible by 400
                {
                    System.out.println("The month has 29 days."); // leap year
                    return;
                }
                else
                {
                    System.out.println("The month has 28 days."); // not a leap year
                    return;
                }
            }
            else
            {
                if(year % 4 == 0) // if not a century year, check if divisible by 4
                {
                    System.out.println("The month has 29 days."); // leap year
                    return;
                }
                else
                {
                    System.out.println("The month has 28 days."); //  not a leap year
                    return;
                }
            }
            
        }
    }
}