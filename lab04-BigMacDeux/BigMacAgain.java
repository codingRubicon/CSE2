// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 19th, 2014
//
// BigMac Again
//
// 1. Prompt the user for an integer input of Big Macs
// 2. Check that they entered an integer > 0
// 3. Show the equation for calculating total cost, given the int entered, show total cost
// 4. Prompt the user for a y or an n, indicating if they want fries as well
// 5. Check that the value the user entered is a y or an n
// 6. Show the price of the fries if purchased, then the total cost
//

import java.util.Scanner;

public class BigMacAgain {
    
    public static void main(String[] args) {
        
        double BMprice = 2.22;
        double friesPrice = 2.15;
        
        Scanner myScanner = new Scanner( System.in );
        
        System.out.print("Enter the number of Big Macs: ");
        
        boolean isInt = myScanner.hasNextInt();
        
        int numBigMacs = myScanner.nextInt();
        
        // step 2
        if(isInt == true) 
        {
            if(numBigMacs > 0) 
            {
                // continue
            
                // step 3
        
                double totPrice = Math.round(BMprice * numBigMacs * 100) / 100.00;
        
                System.out.println("You ordered " +numBigMacs +" Big Macs for a cost of "
                    +numBigMacs +"x" +BMprice +" = $" +totPrice);
        
        
                // step 4
                
                System.out.print("Do you want an order of fries? (Y/y/N/n)?");
                
                String response = myScanner.next();
                
                if(response.equals("Y") || response.equals("y"))
                {
                    System.out.println("You ordered fries at a cost of $" +friesPrice);
                    totPrice = totPrice + friesPrice;
                    System.out.println("The total cost of the meal is: $" +totPrice);
                }
                else if(response.equals("N") || response.equals("n"))
                {
                    System.out.println("The total cost of the meal is: $" +totPrice);
                }
                else
                
                System.out.println("Did not enter a specified option");
                return;
            }
            else
            
            System.out.println("You did not enter an int > 0");
            return;
        }
        else
        
        System.out.println("You did not enter an int");
        return;
        
        
    }
}