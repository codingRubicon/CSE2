// Dalyan Kosar
// CSE2 - Section 111
// Hwk 8
// October 27, 2014

import java.util.Scanner;

public class HW8 {
  public static void main(String []arg){
	
	char input;
	boolean isTrue = true;
	
	Scanner scan=new Scanner(System.in);
	
	while(isTrue) {
	    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
    	
    	if(scan.hasNextInt() == true) {
    	    System.out.println("You didn't enter a letter, try again. ");
    	    continue;
    	}
    	
    	if(scan.next().length()!=1) {
    	    System.out.println("You entered more than one character, try again.");
    	    continue;
    	}
    	
    	input=getInput(scan,"Cc");
    	
    	if(input == 'e') {
			System.out.println("You did not enter one of the options, try again. ");
			continue;
		}
		
    	isTrue = false;
	}
	
	System.out.println("You entered '"+input+"'");
	
	
	
	
	for(int i = 0; i<5; i++) {
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	
	}
	if(input!=' ') {
   	    System.out.println("You entered '"+input+"'");
	}
	
	input=getInput(scan,"Choose a digit.","0123456789");
	
	System.out.println("You entered '"+input+"'");
  }  
}

public static char getInput(char letter, String options) {
    
    int length = options.length();
    
    for(int i=0; i<length; i++) {
    	switch letter{
	        
	        case options.charAt(i):
	            return letter;
	            break;
	        
	        default: 
	            continue;
	        
	    }
    }
    
    return 'e';
    
    
}

public static char getInput(char letter, String options, int tries) {
    
    int length = options.length();
    
    for(int i=0; i<length; i++) {
    	switch letter{
	        
	        case options.charAt(i):
	            return letter;
	            break;
	        
	        default: 
	            continue;
	        
	    }
    }
    
    return 'e';
    
}