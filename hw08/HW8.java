// Dalyan Kosar
// CSE2 - Section 111
// Hwk 8
// October 27, 2014

import java.util.Scanner;
public class HW8{
  
  public static void main(String []arg){
 char input;
 Scanner scan=new Scanner(System.in);
 System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");

 input=getInput(scan,"Cc");
 System.out.println("You entered '"+input+"'");
// 
// System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
// input=getInput(scan,"yYnN",5); //give up after 5 attempts
// if(input!=' '){
//    System.out.println("You entered '"+input+"'");
// }
// 
// input=getInput(scan,"Choose a digit.","0123456789");
// System.out.println("You entered '"+input+"'");
  }
  
  
  //
  public static char getInput(Scanner scan, String options) {
   
   boolean isTrue = true;
   char output = ' ';
   //String input =scan.next();  //here is the first time asking input
    String input = ""; //instead, you should initialize the input as an empty string. So it won't ask user to give input
   while(isTrue) {
    if(scan.hasNextInt() ) {     //scan.hasNextInt will ask user to give input, which is the place that pops out the second input box while running the program 
     System.out.print("You did not enter a char, try again-");
     input = scan.next();
     continue;
    }
    if(input.length()!=1) {
     System.out.print("You entered more than one character, try again-");
     input = scan.next();
     continue;
    }
    
    //correct below 
    for(int i = 0; i<options.length(); i++) {
     if(options.charAt(i) == input.charAt(0)) {
      output = input.charAt(0);
      isTrue = false; 
       
        
     }
     

    }
  
   }
   
   return output;
  }
  
  
//  ////////////////////////////////////////////////////////////////////////////////////////////////
//  public static char getInput(Scanner scan, String options, int times) {
//   
//   int j = 0;
//   char output = 'c';
//   
//   String input = scan.next();
//   
//   while(j<times) {
//    if(scan.hasNextInt() == true) {
//     System.out.print("You did not enter a char, try again-");
//     input = scan.next();
//     j++;
//     continue;
//    }
//    
//    if(input.length()!=1) {
//     System.out.print("You entered more than one character, try again-");
//     input = scan.next();
//     j++;
//     continue;
//    }
//    
//    for(int i = 0; i<options.length(); i++) {
//     if(options.charAt(i) == input.charAt(0)) {
//      output = input.charAt(0);
//     }
//    }
//    break;
//   }
//   
//   if(output==' ') {
//    System.out.print("You failed after " +times +" times.");
//    return output;
//   }
//   
//   return output;
//   
//  }
//  
//  
//  ///
//  public static char getInput(Scanner scan, String prompt, String options) {
//   
//   boolean isTrue = true;
//   char output = ' ';
//   String input = " ";
//   
//   while(isTrue) {
//    System.out.println(prompt);
//    System.out.print("Enter one of:");
//    for(int i = 0; i<options.length()- 1; i++) {
//     System.out.print(" " +options.charAt(i) +",");
//    }
//    System.out.print(" " +options.charAt(options.length()- 1));
//    
//    if(scan.hasNextInt()) {
//     System.out.print("You didn't enter a char, try again-");
//     input = scan.next();
//     continue;
//    }
//    
//    if(input.length()!=1) {
//     System.out.print("You entered too many characters, try again-");
//     input = scan.next();
//     continue;
//    }
//    
//    for(int j=0; j<options.length(); j++) {
//     if(input.charAt(0)==options.charAt(j)) {
//      output = input.charAt(0);
//      isTrue = false;
//      break;
//     }
//    }
//   }
//   
//   return output;
//  }
}