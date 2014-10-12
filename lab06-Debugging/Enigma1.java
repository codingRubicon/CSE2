/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;

public class Enigma1{
  
  public static void main(String[] args){
    
    double percent;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a value for the percent (0, 1,...99): ");
    
    double x = input.nextDouble();
    
    System.out.println("You entered "+x+"%");  //print out the proportion remaining for select percentages
    
    if((100-x)/100==0.93)  //when the user enters 7
    {
        System.out.println("The proportion remaining is "+0.93);
    }
    else if((100-x)/100==0.59)//when the user enters 41
    {
        System.out.println("The proportion remaining is "+0.59);
    }
    else if((100-x)/100==0.86)//when the user enters 14
    {
        System.out.println("The proportion remaining is "+0.86);
    }
    else if((100-x)/100==0.67)//when the user enters 33
    {
        System.out.println("The proportion remaining is "+0.67);
    }
    else if((100-x)/100==0.4)//when the user enters 60
    {
        System.out.println("The proportion remaining is "+0.40);
    }
    else
    {
        System.out.println("The proportion remaining is " +(100-x)/100);
    }
   }
}

/* Error report: 
 *  - wrong initialization of the scanner
    - wrong way to check values for the if statements:
        changed 1-(x/100) to (100-x)/100
    - added else to the end of the if statement to print out all other possibilities for the user input
    
 
 
 (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 * 
 * 
 * 
 */

