// Dalyan Kosar
//
// CSE-2 Section 111
//
// September 5th, 2014
//
// Aritmetic Java Program
//
//
public class Arithmetic {
    
    public static void main(String[] args) {
        
        
        double taxPercent=0.06;
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;
        double sockCost= Math.round(sockCost$*100)/100.0;
        
        double sockTax$= sockCost$*taxPercent;
        double sockTax= Math.round(sockTax$*100)/100.0;
        
        double totalSockCost$=(sockCost$*taxPercent)+sockCost$;   //total cost of socks
        double totalSockCost=Math.round(totalSockCost$*100)/100.0;
        
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        double glassCost= Math.round(glassCost$*100)/100.0;
        
        double glassTax$= glassCost$*taxPercent;
        double glassTax= Math.round(glassTax$*100)/100.0;
        
        double totalGlassCost$=(glassCost$*taxPercent)+glassCost$;   //total cost of glasses
        double totalGlassCost = Math.round(totalGlassCost$*100)/100.0;
        
        //Number of boxes of envelopes
        double nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double envelopeCost= Math.round(envelopeCost$*100)/100.0;
        
        double envelopeTax$=envelopeCost$*taxPercent;
        double envelopeTax=Math.round(envelopeTax$*100)/100.0;
        
        double totalEnvelopeCost$=(envelopeCost$*taxPercent)+envelopeCost$;   //total cost of envelopes
        double totalEnvelopeCost= Math.round(totalEnvelopeCost$*100)/100.0;
        
        
        
        
        System.out.println("Pairs of Socks");
        System.out.println("The number of pairs of socks bought is: " +nSocks);
        System.out.println("The cost per pair of socks is: $" +sockCost);
        System.out.println("The sales tax on one pair of socks is: $" +sockTax);
        System.out.println("The sales tax on a purchase of " +nSocks +" pair(s) of socks is: $" +nSocks*sockTax);
        System.out.println("The subtotal of the purchase of " +nSocks +" pair(s) of socks is: $" +nSocks*sockCost);
        System.out.println("The total of the purchase of " +nSocks +" pair(s) of socks is: $" +nSocks*totalSockCost);
        System.out.println("-------------------------");
        System.out.println("Drinking Glasses");
        System.out.println("The number of drinking glasses bought is: " +nGlasses);
        System.out.println("The cost per drinking glass is: $" +glassCost);
        System.out.println("The sales tax on one drinking glass is: $" +glassTax);
        System.out.println("The sales tax on a purchase of " +nGlasses +" pair(s) of socks is: $" +nGlasses*glassTax);
        System.out.println("The subtotal of the purchase of " +nGlasses +" pair(s) of socks is: $" +nGlasses*glassCost);
        System.out.println("The total of the purchase of " +nGlasses +" drinking glass(es) is: $" +nGlasses*totalGlassCost);
        System.out.println("-------------------------");
        System.out.println("Boxes of Envelopes");
        System.out.println("The number of boxes of envelopes bought is: " +nEnvelopes);
        System.out.println("The cost per box of envelopes is: $" +envelopeCost);
        System.out.println("The sales tax on one box of envelopes is: $" +envelopeTax);
        System.out.println("The sales tax on a purchase of " +nEnvelopes +" pair(s) of socks is: $" +nEnvelopes*envelopeTax);
        System.out.println("The subtotal of the purchase of " +nEnvelopes +" pair(s) of socks is: $" +nEnvelopes*envelopeCost);
        System.out.println("The total of the purchase of " +nEnvelopes +" box(es) of envelopes is: $" +nEnvelopes*totalEnvelopeCost);
        
        
        
        
        
    }
}