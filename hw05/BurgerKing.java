// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 28th, 2014
//
// BK Order Program
//

import java.util.Scanner;

public class BurgerKing {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in ); // create user input method
        
        System.out.println("Enter a letter to indicate a choice of\n \t Burger (B, or b) \n \t Soda (S, or s) \n \t Fries (F, or f)"); // prompt user for an order
        
        String choice1 = myScanner.next(), choice2 = ""; // create two strings, one for the main order and a second for the second decision
        
        if(choice1.length()>1) // if first answer longer than 1 character, print error message and end program
        {
            System.out.println("Single character expected");
            return;
        }
        
        switch(choice1) {
            
            // if they chose a burger...
            case "B":
                
            case "b":
                // ..ask if the user wants extras
                System.out.println("Enter a letter for your extras: \n \t All fixins (Enter A or a) \n \t Cheese (Enter C or c) \n \t None (Enter N or n)");
                choice2 = myScanner.next(); // sets the user response to choice2
                
                if(choice2.equals("A") || choice2.equals("a")) // if they chose all fixins, print that out and end program
                {
                    System.out.println("You ordered a burger with all of the fixins");
                    break;
                }
                else if(choice2.equals("C") || choice2.equals("c")) // if they chose cheese, print that out and end program
                {
                    System.out.println("You ordered a cheeseburger");
                    break;
                }
                else if(choice2.equals("N") || choice2.equals("n")) // if they chose none, print that out and end program
                {
                    System.out.println("You ordered a plain burger");
                    break;
                }
                else // if the input is one of the above options, print an error message and end the program
                {
                    System.out.println("You didn't enter one of the options");
                    break;
                }
            
            // if they chose a drink...   
            case "S":
                
            case "s":
                // ...prompt the user what kind of drink they want
                System.out.println("Which drink do you want? \n \t Pepsi (Press P or p) \n \t Coke (Press C or c) \n \t Sprite (Press S or s) \n \t Mountain Dew (Press M or m)");
                choice2 = myScanner.next(); // set the user response to choice2
                
                if(choice2.equals("P") || choice2.equals("p")) // if they chose a pepsi, print that out and end the program
                {
                    System.out.println("You ordered a Pepsi");
                    break;
                }
                else if(choice2.equals("C") || choice2.equals("c")) // if they chose a coke, print that out and end the program
                {
                    System.out.println("You ordered a Coke");
                    break;
                }
                else if(choice2.equals("S") || choice2.equals("s")) // if they chose a sprite, print that out and end the program
                {
                    System.out.println("You ordered a Sprite");
                    break;
                }
                else if(choice2.equals("M") || choice2.equals("m")) // if they chose a mountain dew, print that out and end the program
                {
                    System.out.println("You ordered a Mountain Dew");
                    break;
                }
                else // if the input is not one of the above options, print an error message and end the program
                {
                    System.out.println("You did not enter one of the choices"); 
                    break;
                }
            
            // if they chose fries...    
            case "F":
                
            case "f":
                //...prompt the user what size they want
                System.out.println("What size do you want? \n \t Large (Press L or l) \n \t Small (Press S or s) ");
                choice2 = myScanner.next(); // sets the input as choice2
                
                if(choice2.equals("L") || choice2.equals("l")) // if they chose large, print that and end the program
                {
                    System.out.println("You ordered large fries");
                    break;
                }
                else if(choice2.equals("S") || choice2.equals("s")) // if they chose small, print that and end the program
                {
                    System.out.println("You ordered small fries");
                    break;
                }
                else // if the input is not one of the above options, print an error message and end the program
                {
                    System.out.println("You didn't enter one of the specified options");
                    break;
                }
                
            default: // if the input is not one of the above options, print an error message and end the program
                System.out.println("You did not enter one of the options (B, b, S, s, F, or f)");
                break;
            
            
        }
        return;
    }
}