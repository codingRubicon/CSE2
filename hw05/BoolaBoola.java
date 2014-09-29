// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 28th, 2014
//
// Random Boolean Statement Generator
//

import java.util.Scanner;

public class BoolaBoola {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in ); // create a method for user input
        
        int randomNum = (int)(Math.random() * 10 + 1); // randomize the value of randomNum
        
        boolean one, two, three, statement; // initialize 4 booleans, 3 for the randomly generated statment and 1 for the overall answer
        
        String first, second, answer; // initialize 3 strings, 2 for the strings && and || in the randomly generated statement and 1 for the user's input
        
        
        // if the randomly generated number is less than 5, it's false, otherwise it's true. Therefore there's a 50-50 chance for each option.
        if(randomNum >= 1 && randomNum <= 5) 
        {
            one = false;
        }
        else
        {
            one = true;
        }
        
        // re-randomize randomNum and repeat the last step
        randomNum = (int)(Math.random() * 10 + 1);
        
        if(randomNum >= 1 && randomNum <= 5)
        {
            two = false;
        }
        else
        {
            two = true;
        }
        
        // re-randomize randomNum and repeat the last step
        randomNum = (int)(Math.random() * 10 + 1);
        
        if(randomNum >= 1 && randomNum <= 5)
        {
            three = false;
        }
        else
        {
            three = true;
        }
        
        // re-randomize randomNum and set the string as && or || depending on the value of randomNum, again there's a 50-50 chance for each
        randomNum = (int)(Math.random() * 10 + 1);
        
        if(randomNum >= 1 && randomNum <= 5)
        {
            first = "&&";
        }
        else
        {
            first = "||";
        }
        
        // re-randomize randomNum and repeat the last step
        randomNum = (int)(Math.random() * 10 + 1);
        
        if(randomNum >= 1 && randomNum <= 5)
        {
            second = "&&";
        }
        else
        {
            second = "||";
        }
        
        
        // depending on the values in the strings first and second, the overall statement changes and the value of "statement" changes as well.
        if(first.equals("&&") && second.equals("&&"))
        {
            statement = one && two && three;
            //System.out.println(statement);
        }
        else if(first.equals("&&") && second.equals("||"))
        {
            statement = one && two || three;
            //System.out.println(statement);
        }
        else if(first.equals("||") && second.equals("&&"))
        {
            statement = one || two && three;
            //System.out.println(statement);
        }
        else if(first.equals("||") && second.equals("||"))
        {
            statement = one || two || three;
            //System.out.println(statement);
        }
        
        // Print out the statement and prompt the user for their answer
        System.out.println("Does " +one +" " +first +" " +two +" " +second +" " +three +" hold the value true (T/t) or false (F/f)?");
        
        answer = myScanner.next(); // set their input as answer
        
        switch(answer) {
            
            // if they responded false...
            case "F":
                
            case "f":
                
                //...depending on whether or not statement is true/false, their answer is either correct or wrong
                System.out.println(statement ? "Wrong; try again":"Correct");
                break;
            
            // if they responded true...
            case "T":
                
            case "t":
                
                //...depending on whether or not statement is true/false, their answer is either correct or wrong
                System.out.println(statement ? "Correct":"Wrong; try again");
                break;
                
            default: // if the input was none of the above options, print an error message and end the program
                System.out.println("Wrong; try again");
                break;
        }
        return;
        
    }
}

// notes:
//
// I keep getting an error saying that on lines 119 and 128, where I use the ternary statements with the boolean "statement," "statement" isn't
// initialized. I went to test that by adding printlns to where I set the value of "statement" with if statements (lines 84-104), just to see if
// there was a value being calculated for "statement". When I ran the program then, (by cntrl + x to lines 111-134: the only way it would compile w/o error)
// either true or false would print for "statement", but when I pasted back in lines 111-134, I would get the same error message. HELP PLEASE.