/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auctionsystem;

import java.util.Scanner;

/**
 *
 * @author Zerk Shaban
 */
public class AuctionSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bit;
        int largestbit = 0;
        int op;
        
        Auctioneer auction=new Auctioneer();
        Scanner input=new Scanner(System.in);
        
        new Bitter1(auction);
        new Bitter2(auction);
        new Bitter3(auction);
        new Bitter4(auction);
        
        while(true){
        System.out.print("Want to make a bit press 1 for Yes or press 2 for No.");
        op=input.nextInt();
        if(op==1){
        System.out.print("Please,Enter the new bit highter the the pervious(If any previous bit was made).");
        bit=input.nextInt();
        
        if(bit>=largestbit){
            largestbit=bit;
            auction.makeBit(largestbit);
        }  
     }
        else{
            System.out.print("Note:Thanks for using the Auction System.");
            break;
       
        }
       }
    }
    
}