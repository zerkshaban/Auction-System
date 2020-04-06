/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auctionsystem;

/**
 *
 * @author Zerk Shaban
 */
public class Bitter4 extends Observer {
    public Bitter4(Auctioneer auct){
    this.auct=auct;
    this.auct.getRegister(this);
    }
    @Override
    public void newHighestBit(int bit) {
     System.out.print("New Highest Bit Bitter 4 is:"+bit+" \n");  
    }
}