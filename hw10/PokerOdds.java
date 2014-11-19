// Dalyan Kosar
// CSE2 - Section 111
// Homework 10
// November 14, 2014

import java.util.Random;
import java.util.Scanner; // import util packages
public class PokerOdds{
  public static void main(String [] arg){
    showHands(); // create a random hand 
    simulateOdds(); // simulate random hand creation 10000 times
  }
  
  public static void simulateOdds() {
      int[] hand; // make an array for the hand
      int notOnePair = 0, pairCard=0, // int for the number of none single pair hands and the value of the specific card
      ace=0, king=0, queen=0, jack=0, ten=0, nine=0, eight=0, seven=0, six=0, five=0, four=0, three=0, two=0; // the ints for which cards have pair hands
      FindDuplicates finder = new FindDuplicates();
      
      for(int i = 0; i<10000; i++) { // simulate 10000 times
          hand = createHand(); // create a hand
          for(int j = 0; j<hand.length; j++) { // for each slot in the hand
              hand[j] = hand[j]%13; // mod card value by 13 to ignore suit and focus on card num
          }
          
          if(finder.exactlyOneDup(hand)==true) { // if only one duplicate
              for(int j = 0; j<hand.length; j++) {
                  for(int k = j+1; k<hand.length; k++) {
                      if(hand[j]==hand[k]) {
                          pairCard = hand[j]; // the pair value is set to the card value at that position
                      }
                  }
              }
          }
          else {
              notOnePair++; // if not only one pair
              continue; // skip the next part because no card pair int should increment
          }
          
          switch(pairCard){ // depending on the pair card value, increment the card pair int
                  case 0:
                      ace++;
                      break;
                  case 1:
                      king++;
                      break;
                  case 2:
                      queen++;
                      break;
                  case 3:
                      jack++;
                      break;
                  case 4:
                      ten++;
                      break;
                  case 5:
                      nine++;
                      break;
                  case 6:
                      eight++;
                      break;
                  case 7:
                      seven++;
                      break;
                  case 8:
                      six++;
                      break;
                  case 9:
                      five++;
                      break;
                  case 10:
                      four++;
                      break;
                  case 11:
                      three++;
                      break;
                  case 12:
                      two++;
                      break;
              }
      }
      
      System.out.println("rank \t freq of exactly one pair"); // print out the formatting and the other determined int
      System.out.println(" A \t  " +ace);
      System.out.println(" K \t  " +king);
      System.out.println(" Q \t  " +queen);
      System.out.println(" J \t  " +jack);
      System.out.println(" 10 \t  " +ten);
      System.out.println(" 9 \t  " +nine);
      System.out.println(" 8 \t  " +eight);
      System.out.println(" 7 \t  " +seven);
      System.out.println(" 6 \t  " +six);
      System.out.println(" 5 \t  " +five);
      System.out.println(" 4 \t  " +four);
      System.out.println(" 3 \t  " +three);
      System.out.println(" 2 \t  " +two);
      System.out.println("------------------");
      System.out.println("total not exactly one pair: " +notOnePair);
  }
  
  public static int[] createHand() { // a method for making a random hand
      int[] deck = new int[52]; // create an array of 52 slots
      int[] hand = new int[5]; // create an array of 5 slots
      int temp = 0;
      
      
      for(int i = 0; i<52; i++) {
          deck[i]=i; // each slot for the deck array is filled with a unique int increasing from 0 to 51
      }
      
      for(int i = 0; i<5; i++) {
          temp = randomInt(0,(51-i)); // temp is an index to pull a card from that index of the hand array
          
          hand[i] = deck[temp]; // take the value from the temp index of the deck array and put it in the hand[i] location
          
          deck[temp] = -1; // replace that position in the deck array with -1
          
          for(int j = temp; j<51; j++) { // switch numbers to get the -1 at the end of the array, then next time temp can only search from the first 51-i locations
              temp = deck[j];
              deck[j] = deck[j+1];
              deck[j+1] = temp;
          }
      }
      return hand;
  }
  
  public static void showHands() {
      int[] hand = createHand(); // create an hand
      
      System.out.print(" Clubs: \t"); // finds club values
      for(int i = 0; i<hand.length; i++) { // searches the entire hand
          if(hand[i]/13==0) { // if the card value, when divided by 13 = 0, it's a club
              printCard(hand[i]); // figure out which card the card value represents
          }
      }
      System.out.println(); // end line
      
      System.out.print(" Diamonds: \t"); // find diamond values
      for(int i = 0; i<hand.length; i++) { // searches the entire hand
          if(hand[i]/13==1) { // if the card value, when divided by 13 = 1, it's a diamond
              printCard(hand[i]); // figure out which card the card value represents
          }
      }
      System.out.println(); // end line
      
      System.out.print(" Hearts: \t"); // find heart values
      for(int i = 0; i<hand.length; i++) { // searches the entire hand
          if(hand[i]/13==2) { // if the card value, when divided by 13 = 2, it's a heart
              printCard(hand[i]); // figure out which card the card value represents
          }
      }
      System.out.println(); //end line
      
      System.out.print(" Spades: \t"); // find spade values 
      for(int i = 0; i<hand.length; i++) { // search the entire hand
          if(hand[i]/13==3) { // if the card value, when divided by 13 = 3, it's a spade
             printCard(hand[i]); // figure out which card the card value represents
          }
      }
      System.out.println(); // end line
  }
  
  public static int randomInt(int min, int max) { // generate a random number between the two input ints
      Random rand = new Random();
      int randomNum = rand.nextInt((max - min) + 1) + min;
      return randomNum;
  }
  
  public static void printCard(int cardNum) { // print a different value depending on the result of the int mod 13
     switch(cardNum%13){
                  case 0:
                      System.out.print("A ");
                      break;
                  case 1:
                      System.out.print("K ");
                      break;
                  case 2:
                      System.out.print("Q ");
                      break;
                  case 3:
                      System.out.print("J ");
                      break;
                  case 4:
                      System.out.print("10 ");
                      break;
                  case 5:
                      System.out.print("9 ");
                      break;
                  case 6:
                      System.out.print("8 ");
                      break;
                  case 7:
                      System.out.print("7 ");
                      break;
                  case 8:
                      System.out.print("6 ");
                      break;
                  case 9:
                      System.out.print("5 ");
                      break;
                  case 10:
                      System.out.print("4 ");
                      break;
                  case 11:
                      System.out.print("3 ");
                      break;
                  case 12:
                      System.out.print("2 ");
                      break;
              }
  }
}