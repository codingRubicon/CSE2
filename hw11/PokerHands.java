//Dalyan Kosar
//CSE2 - Section 111
//Homework 11 - Poker Hands
//December 4 - 2014

import java.util.Scanner;

public class PokerHands {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int suitNum, cardNum;
        int[] hand = new int[5];
        boolean isTrue = true;
        boolean inputValidity = false;
        String input = "";
        String[] cardValue = {"a","k","q","j","10","9","8","7","6","5","4","3","2"};
        String[] suitValue = {"c","h","d","s"};
        String[] yes = {"Y","y","a"};
        int[] cardFrequency = new int[13];
        int[] cards = new int[52];
        for(int i = 0; i<52; i++) {
            cards[i] = i+1;
        }
        while(isTrue){
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand: ");
            input = scan.next();
            
            inputValidity = checkInput(input, yes, 1);
            
            if(inputValidity==false){
                System.out.println("You did not enter the correct response");
                continue;
            }
            else{
                for(int i = 0; i<5; i++){
                    System.out.print("Enter the suit ('c','h','d','s'): ");
                    input = scan.next();
                    inputValidity = checkInput(input, suitValue, 1);
                    
                    if(inputValidity!=true){
                        System.out.println("You did not enter the correct response");
                        break;
                    }
                    
                    suitNum = letterNumberConversion(input, suitValue) + 1;
                    
                    System.out.print("Enter the card value ('a','k','q','j','10','9','8','7','6','5','4','3','2'): ");
                    input = scan.next();
                    inputValidity = checkInput(input, cardValue, 2);
                    
                    if(inputValidity!=true){
                        System.out.println("You did not enter the correct response");
                        break;
                    }
                    
                    cardNum = letterNumberConversion(input, cardValue);
                    
                    if(cards[cardNum*suitNum]==-1){
                        System.out.println("You already chose that card");
                        i--;
                        break;
                    }
                    
                    hand[i] = cards[cardNum*suitNum];
                    cards[cardNum*suitNum] = -1;
                }
                if(inputValidity!=true){
                        continue;
                    }
                
                showOneHand(hand);
            }
        }
    }
    
    public static int letterNumberConversion(String letter, String[] options){
        int answer=0;
        for(int i = 0; i<options.length;i++){
            if(letter.equals(options[i])){
                answer = i;
            }
        }
        return answer;
    }
    
    public static boolean checkInput(String input, String[] options, int desiredLength){
        boolean isTrue = false;
        if(input.length()>desiredLength){
            return false;
        }
        for(int j = 0; j<options.length;j++){
            if(input.equals(options[j])){
                isTrue = true;
            }
        }
        
        return isTrue;
    }
    
    public static void showOneHand(int hand[]){
	    String suit[]={"Clubs:	", "Diamonds:   ", "Hearts:   ", "Spades:   "};
	    String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
	    String out="";
	    for(int s=0;s<4;s++){
  	        out+=suit[s];
  	        for(int rank=0;rank<13;rank++)
    	        for(int card=0;card<5;card++)
     	            if(hand[card]/13==s && hand[card]%13==rank)
      	                out+=face[rank];
  	        out+='\n';
	    }
	    System.out.println(out);
        
    }

}