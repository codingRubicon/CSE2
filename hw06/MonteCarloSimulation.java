// Dalyan Kosar
//
// CSE-2 Section 111
//
// October 11th, 2014
//
// Monte Carlo Simulation
//

public class MonteCarloSimulation {
    public static void main(String[] args){
        
        int c1=0,c2=0,guess,spin; // counters for the while loops, the int for the guess of each round, the int for the number the ball lands on each spin
        
        int wins=0,timesWon=0,timesLost=0,winnings=0; // number of spins won, number of games that turned a profit, games that didn't win a single spin, total earnings
        
        while(c1<1000){
            
            c2=0;
            guess = (int)(Math.random()*38 + 1); // randomize the guess for each 100-spin round
            winnings -= 100; // lose 100 for each 100 spins
            wins=0; // reset the number of wins after each round
            
            while(c2<100){ // spin 100 times
                
                spin = (int)(Math.random()*38 + 1); // the number spun changes every spin
                
                if(guess==spin) // if picked right
                {
                    winnings+=36; // win 36 dollars for every win
                    wins++; // increase the win counter
                }
                c2++;
            }
            
            if(wins>=3)
            {
                timesWon++; // if made more than $100, increase the counter for games which earned money
            }
            else if(wins==0)
            {
                timesLost++; // if never won a single spin, increase the counter for that stat
            }
            c1++;
        }
        
        System.out.println("You won $" +winnings +". You gained money " +timesWon +" games and the ball never landed on your number " +timesLost +" games."); // print out the results
    }
}