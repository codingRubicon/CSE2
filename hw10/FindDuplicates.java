// Dalyan Kosar
// CSE2 - Section 111
// Homework 10
// November 14, 2014

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in); // initialize the method for user input
    int num[]=new int[10]; // create an array with 10 spaces
    String answer=""; // initialize the string for the answer that will be printed
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt(); // for the next ten ints, separated by spaces, place them in the corresponding slots in the num array
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ 
        out+="has "; // if it has duplicates, add it to the output string...
      }
      else{
        out+="does not have "; // else, print it doesn't
      }
      out+="duplicates."; // add "duplicates" to the answer string
      System.out.println(out); // print out the string
      out="The array "; // reinitialize the string
      out+=listArray(num); // add the array to the string using a methid
      if(exactlyOneDup(num)){
        out+="has "; // if it has exactly one duplicate, add it to the string
      }
      else{
        out+="does not have "; // else, add that it doesn't have one duplicate to the string
      }
      out+="exactly one duplicate.";
      System.out.println(out); // print the answer string
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); // ask the user if they want to repeat
      answer=scan.next(); // store the user reponse in the string answer
    }while(answer.equals("Y") || answer.equals("y")); // if the answer is y or Y, repeat
  }

  public static String listArray(int[] num){ // method for printing out an array
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int[] num) { // method for finding duplicates
      for(int i = 0; i<num.length; i++) {
          for(int j = i+ 1; j<num.length; j++) {
              if(num[i]==num[j]) { // search the index and the positions in front of it for equal integers
                  return true; // return true if one is found
              }
          }
      }
      return false; // else return false
  }
  
  public static boolean exactlyOneDup(int[] num) { // method for finding out if only one pair exists
      boolean answer=true; // intialize a boolean
      int[] temp = createZeroArray(num.length); // create an array of zeros that is the length of the num array
      
      for(int i = 0; i<num.length; i++) {
          for(int j = i+ 1; j<num.length; j++) {
              if(num[i]==num[j]) { // search the indexes in front of the i position for equal integers...
                  temp[i]++; // ...if one is found, increment the i position in the temp array to indicate that there was a pair of that integer
              }
          }
      }
      int counter = 0;
      for(int i = 0; i<temp.length; i++) {
          if(temp[i]>1) { // if any position in the temp array has a value >1, it means that there were more than two instances of that int which means, it's not a pair
              answer = false; // therefore return false
          }
          if(temp[i]==1) {
              counter++; // if a one is found, increment the counter
          }
      }
      if(counter!=1) { // if the counter is more or less than one, it means there are either more or less than one pair 
          answer = false; // therefore false
      }
      return answer; // if the conditions are met, return true
  }
  
  public static int[] createZeroArray(int length) { // create an array of length 'length'
      int[] temp = new int[length];
      for(int i = 0; i<length; i++) {
          temp[i] = 0;
      }
      return temp;
  }
}