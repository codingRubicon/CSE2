// Dalyan Kosar
// CSE2 - Section 111
// Homework 9
// November 14, 2014

import java.util.Scanner;
public class BlockedAgain{
    public static void main(String[] args){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }
    
    public static int getInt() {
        boolean isTrue = true;
        int number=0;
        Scanner myScan = new Scanner( System.in );
        while(isTrue) {
            System.out.print("Enter an int between 1 and 9 inclusive: ");
            if(checkInt(myScan)) {
                number = myScan.nextInt();
            }
            else {
                System.out.print("You didn't enter an int, try again: ");
                number = myScan.nextInt();
            }
            if(checkRange(number)) {
                isTrue=false;
            }
            else {
                System.out.print("You didn't enter a number between 1 and 9 inclusive, try again: ");
                number = myScan.nextInt();
            }
        }
        
        return number;
    }
    
    public static boolean checkInt(Scanner scan) {
        if(scan.hasNextInt()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean checkRange(int num) {
        if(num>=1 && num<=9) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void allBlocks(int blocks) {
        for(int i = 1; i<=blocks; i++) {
            block(i,blocks);
        }
    }
    
    public static void block(int blockNum, int input) {
        for(int i = 1; i<=blockNum; i++) {
            line(blockNum,input);
        }
        for(int k = 0; k<input-blockNum; k++) {
            System.out.print(" ");
        }
        for(int j = 0; j<(1+((blockNum-1)*2)); j++) {
            System.out.print("-");
        }
        System.out.println("");
    }
    public static void line(int number, int i) {
        for(int j = 0; j<i-number; j++) {
            System.out.print(" ");
        }
        for(int j = 0; j<(1+((number-1)*2)); j++) {
            System.out.print(number);
        }
        System.out.println("");
    }
}
