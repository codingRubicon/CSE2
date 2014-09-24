// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 22th, 2014
//
// Income Tax Calculator
//
// 1. Prompts the user to enter their salary
// 2. Calculates the income tax on the salary given a tax bracket
//

import java.util.Scanner;

public class IncomeTax {
    
    public static void main(String[] args) {
        
        double tax = 0.00;
        
        Scanner myScanner = new Scanner( System.in );
        
        System.out.println("Enter an int for your salary in thousands: ");
        
        boolean isInt = myScanner.hasNextInt();
        
        int pay = myScanner.nextInt();
        
        if(isInt == false) {
            
            System.out.println("You did not enter an int");
            return;
        }
        else {
            
            if(pay < 0) {
                
                System.out.println("You did not enter a number > 0");
                return;
            }
            else if(pay >= 0 && pay < 20) {
                
                tax = 0.05;
            }
            else if(pay >= 20 && pay < 40) {
                
                tax = 0.07;
            }
            else if(pay >= 40 && pay < 78) {
                
                tax = 0.12;
            }
            else if(pay >= 78) {
                
                tax = 0.14;
            }
            
            double taxTot = Math.round(pay * tax * 100000) / 100.0;
            
            double taxPercentage = Math.round(tax * 100) / 1.0;
            
            System.out.println("The tax rate on $" +pay +",000 is " +taxPercentage
                +"%, and the tax is $" +taxTot);
        }
    }
}