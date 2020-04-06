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
public class Bitter1 extends Observer {
    public Bitter1(Auctioneer auct){
        this.auct=auct;
        this.auct.getRegister(this);
    }

    @Override
    public void newHighestBit(int bit) {
        System.out.print("New Highest Bit Bitter 1 is:"+bit+" \n");
    }
}