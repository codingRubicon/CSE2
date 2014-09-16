// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 16th, 2014
//
// Printing Beyond the Decimal
//
// 1.Prompt the user for a double
// 2.Print out the first four digits past the decimal point
//

import java.util.Scanner;

public class FourDigits {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in );
        
        System.out.println("Enter a double and I will display the four digits to the right of the decimal point: ");
        
        double number = myScanner.nextDouble(); // created double from user input
        
        int tenths = (int)(number*10) % 10; // brings the digit in the .1s pos to the 1s pos and then mods by ten to have only the 1s remain
        int hundredths = (int)(number*100) % 10; // brings the digit in the .01s pos to the 1s pos and then mods by ten to have only the 1s remain
        int thousandths = (int)(number*1000) % 10; // brings the digit in the .001s pos to the 1s pos and then mods by ten to have only the 1s remain
        int tenThousandths = (int)(number*10000) % 10; // brings the digit in the .0001s pos to the 1s pos and then mods by ten to have only the 1s remain
        
        //double numberRound = Math.round(number*100)/100.0000; // cuts off the number of decimal places to four
        
        //System.out.println(numberRound); // prints out the number cut off at four decimal places
        System.out.println("The four digits are: " +tenths +hundredths +thousandths +tenThousandths); // prints out the four digits after the decimal point
        
        
    }
}