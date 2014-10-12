// Dalyan Kosar
//
// CSE-2 Section 111
//
// October 11th, 2014
//
// Loop the Loop
//

import java.util.Scanner;

public class LoopTheLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in ); // prepare user input method
        
        while(true) // infinite loop
        {
            System.out.println("Enter a number between 1-15: "); // prompt user for input
            
            boolean isInt = input.hasNextInt(); // check if an int
            
            int nStars = input.nextInt(); // set input to nStars
            
            if(isInt) // if an int
            {
                if(nStars>=1 && nStars<=15) // if between 1 and 15
                {
                    for(int i = 0; i<nStars; i++) // print out nStars, stars
                    {
                        System.out.print("*");
                    }
                    
                    System.out.println(); // make line for spacing
                    
                    for(int i = 1; i<nStars + 1; i++) // prints out nStars lines, starting from one star to nStars stars
                    {
                        for(int j = 0; j<i; j++)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                else
                {
                    System.out.println("You didn't enter a number within the parameters."); // if not an int within the parameters, end program
                    return;
                }
            }
            else
            {
                System.out.println("You didn't enter an int."); // if not an int, end program
                return;
            }
            
            System.out.println("Enter y/Y to run again: "); // ask if the user wants to run the program again
            
            String response = input.next();
            
            switch(response) { // if they type y or Y, run the program again, else end the program
                
                case "Y":
                    
                case "y":
                    break;
                
                default:
                    return;
            }
        }
        
    }
}