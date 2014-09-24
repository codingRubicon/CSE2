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
        
        Scanner myScanner = new Scanner( System.in );
        
        System.out.print("Enter a number (1-12) to indicate the month: ");
        
        boolean isInt = myScanner.hasNextInt();
        
        int month = myScanner.nextInt();
        
        int year = 0000;
        
        if(isInt == false) 
        {
            System.out.print("You did not enter an int");
            return;
        }
        
        if(month>12 || month<1)
        {
            System.out.print("You did not enter an int between 1 and 12");
            return;
        }
        
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            System.out.println("The month has 31 days.");
            return;
        }
        else if(month != 2)
        {
            System.out.println("The month has 30 days.");
            return;
        }
        else
        {
            System.out.println("What is the year?");
            year = myScanner.nextInt();
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println("The month has 29 days.");
                    return;
                }
                else
                {
                    System.out.println("The month has 28 days.");
                    return;
                }
            }
            else
            {
                if(year % 4 == 0)
                {
                    System.out.println("The month has 29 days.");
                    return;
                }
                else
                {
                    System.out.println("The month has 28 days.");
                    return;
                }
            }
            
        }
    }
}