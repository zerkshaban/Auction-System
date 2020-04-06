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
abstract public class Observer {
    protected Auctioneer auct;
    abstract public void newHighestBit(int bit);
}