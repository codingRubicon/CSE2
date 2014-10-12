/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String[] args){
    
    Scanner scan=new Scanner(System.in);
    
    int k=4,p=6,q=7,r=8,n;
    
    System.out.print("Enter an int- ");
    
    
    if(scan.hasNextInt()){
        
      n=scan.nextInt();
      System.out.println("You entered "+n);
    
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("Again, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
     - must initialize scanner before printing out the question
     - "String[] args" instead of "String arg []"
     - initialized n twice, change to initialize all variables at the beginning
     - changed "to repeat" to "Again"
 */

