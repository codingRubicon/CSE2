// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 16th, 2014
//
// Cube Root Estimator
//
// 1. Prompt the user to enter a double
// 2. Calculate and return a crude estimate of the cube root
// 3. Calculate and return the estimate cubed
//
//
import java.util.Scanner;

public class Root {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in );
        
        System.out.print("Enter a double: ");
        
        double x = myScanner.nextDouble();
        
        double guess = x/3;
        double guess1 = (2*guess*guess*guess+x)/(3*guess*guess);
        double guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1);
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
        
        double ansCub = guess5*guess5*guess5;
        
        System.out.println("The approx. cube root of " +x +" is " +guess5
                            +" and the approx. cube root, cubed is " +ansCub);
                            
        
    }
}