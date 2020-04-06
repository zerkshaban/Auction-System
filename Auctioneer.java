/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auctionsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zerk Shaban
 */
public class Auctioneer {
    List<Observer>observer=new ArrayList<Observer>();
    private int bit;
    
    public void makeBit(int bit){
        this.bit=bit;
      //  if(bit>this.bit){
        notifyToAll();
      //  }
    }
    public void getRegister(Observer addBitter){
        observer.add(addBitter);
    }
    public void notifyToAll(){
    for(Observer observer:observer){
            observer.newHighestBit(bit);
        }
    }
    
}