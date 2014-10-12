import java.util.Scanner;
public class Enigma2{
  public static void main(String[] args){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * 
    - cannot divide by zero, therefore an arithmetic java.lang exception
 
 Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 * 
 * 
 * 
 * 
 */

