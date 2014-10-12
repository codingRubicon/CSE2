/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;

public class Enigma3{
  public static void main(String[] args){
    
    int n=40,k=60;
    
    String out="";
    
    switch(k%14){
      case 12: 
      case 13: 
          out+=13;
          break;
      default: 
        out+=40; // out = 40
        n/=3; // n = 13
        k-=7; // k = 53
    }
    if( (n * k % 12) < 12){
      n-=20; // n = -7
      out+=n; // out = 40-7
    }
    if( n * n > k){
      n=42;
      out+=n+k;
    }
    else {
      n=45; // n = 45
      out += n+k; // out = 40-7+98
    }
    switch(n+k){ // n+k = 98
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5; // n = 9
        k/=9; // k = 5
      default:
        n-=3; // n = 6
        k-=5; // k = 0
    }
     out+=1/n + 1; // out = 40-7+98+1
    System.out.println(out);
  }
}

/*
 * Error report:
 * - divide by k which has a value of 0 at line 54 so changed to remove the division operation
 * 
 * 
 * 
 */

