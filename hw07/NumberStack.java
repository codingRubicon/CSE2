//Dalyan Kosar
//CSE2 - Section 111
//HW07 Number Stack
//October 18, 2014

import java.util.Scanner;

public class NumberStack {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in );
        
        System.out.print("Enter a number between 1 and 9- ");
        
        int n = myScanner.nextInt();
        
        System.out.println();
        System.out.println("Using for loops: ");
        
        for(int i=0; i< n; i++) {
            for(int j=0; j<i+ 1; j++) {
                for(int k=0; k< 1+(i*2); k++) {
                    System.out.print(i+ 1);
                }
                System.out.println();
            }
            for(int j=0; j<1+(i*2); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Using while loops: ");
        
        int i=0,j=0,k=0;
        
        while(i<n) {
            j=0;
            while(j<i+ 1) {
                k=0;
                while(k<1+(i*2)) {
                    System.out.print(i+ 1);
                    k++;
                }
                System.out.println();
                j++;
            }
            j=0;
            while(j<1+(i*2)) {
                System.out.print("-");
                j++;
            }
            System.out.println();
            i++;
        }
        
        System.out.println();
        System.out.println("Using do while loops: ");
        
        i=0; j=0; k=0;
        
        do{
            j=0;
            do{
                k=0;
                do{
                    System.out.print(i+ 1);
                    k++;
                }while(k<1+(i*2));
                System.out.println();
                j++;
            }while(j<i+ 1);
            j=0;
            do{
                System.out.print("-");
                j++;
            }while(j<1+(i*2));
            System.out.println();
            i++;
        }while(i<n);
    }
}