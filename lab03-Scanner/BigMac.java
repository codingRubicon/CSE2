// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 12th, 2014
//
// BigMac Cost Calculator
//
// Asks the user for cost of a single big mac, how many big macs are being purchased, and the tax percentage of the location

import java.util.Scanner;

public class BigMac{
    
    public static void main(String[] args){
        
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //Establishes a new scanner instance
        
        
        System.out.print(
            "Enter the number of Big Macs (an integer >0): ");
        
        int nBigMacs = myScanner.nextInt(); // gets the number of big macs from the user
        
        System.out.print(
            "Enter the cost per Big Mac as a double (in the form xx.xx): ");
        
        double cBigMacs = myScanner.nextDouble(); // gets the cost per big mac from the user
        
        System.out.print(
            "Enter the percent tax as a whole number (xx): ");
        
        double taxPercent = myScanner.nextDouble(); // gets the tax rate from the user
        
        taxPercent/=100; // converts the tax percentage to a decimal
        
        double totalCost = nBigMacs*cBigMacs*(1+taxPercent); // calculates the total cost
        
        int dollars, dimes, pennies; // creates variables to store individual values for each unit place
        
        dollars = (int)totalCost; // finds the number of dollars
        
        dimes = (int)(totalCost*10) % 10; // finds the number of dimes
        
        pennies = (int)(totalCost*100) % 10; // finds the number of pennies
        
        System.out.println("The total cost of " +nBigMacs +" Big Macs at $" 
            +cBigMacs +" per Big Mac with a sales tax of " +(int)(taxPercent*100)
            +"% is $" +dollars +"." +dimes +pennies); // prints all of the information found
        
        
        
        
    }
}