// Dalyan Kosar
//
// CSE-2 Section 111
//
// October 11th, 2014
//
// Bisection Method
//

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in ); // prepare user input method
        
        System.out.println("Enter the number you want to calculate the square root of (must be greater than 0): "); // prompt user for a number
        
        int x = input.nextInt(); // store value in int x
        
        double low = 0.0, high = x + 1, middle = high/2; // initialize low, middle, high
        
        if(middle*middle == x) // if middle is the square root, print out and end program
        {
            System.out.println("The square root of " +x +" is " +middle);
            return;
        }
        
        while(high-low>0.0000001) // while difference is less than .0000001
        {
            middle = ((high-low)/2)+low; // make middle the middle value
            
            if(middle*middle>x) // if middle is greater than the root
            {
                high = middle; // set high to middle value
            }
            else
            {
                low = middle; // set low to middle value
            }
        }
        
        middle = ((high-low)/2)+low; // recalculate middle
        
        
        System.out.println("The square root of " +x +" is " +middle); // print out the answer
    }
}