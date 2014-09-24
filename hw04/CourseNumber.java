// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 22th, 2014
//
// Schedule Checker
//
// 1. Prompts the user for a six digit int
// 2. Returns when the class is scheduled
//

import java.util.Scanner;

public class CourseNumber {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in );
        
        System.out.print("Enter a six digit course number: ");
        
        int courseNum = myScanner.nextInt();
        
        int dig1, dig2, dig3, dig4, dig5, dig6;
        
        dig6 = (int)(courseNum) % 10;
        
        dig5 = (int)(courseNum/10) % 10;
        
        dig4 = (int)(courseNum/100) % 10;
        
        dig3 = (int)(courseNum/1000) % 10;
        
        dig2 = (int)(courseNum/10000) % 10;
        
        dig1 = (int)(courseNum/100000) % 10;
        
        int year = 1000*dig1 + 100*dig2 + 10*dig3 + dig4;
        
        int semester = 10*dig5 + dig6;
        
        if(year < 1865 || year > 2014)
        {
          System.out.println("The number was outside of the range [186510, 201440]");
          return;
        }
        else
        {
            if(semester % 10 != 0)
            {
                System.out.println(semester +" is not a valid semester");
                return;
            }
            else if(semester > 40 || semester < 10)
            {
                System.out.println(semester +" is not a valid semester");
                return;
            }
            else if(semester == 10)
            {
                System.out.println("The course was offered in the Spring of " +year);
                return;
            }
            else if(semester == 20)
            {
                System.out.println("The course was offered in Summer 1 of " +year);
                return;
            }
            else if(semester == 30)
            {
                System.out.println("The course was offered in Summer 2 of " +year);
                return;
            }
            else if(semester == 40)
            {
                System.out.println("The course was offered in the Fall of " +year);
                return;
            }
        }
        
        //System.out.println(""+dig1 +""+dig2 +""+dig3 +""+dig4 +""+dig5 +""+dig6);
    }
}