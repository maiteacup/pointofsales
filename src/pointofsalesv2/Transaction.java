/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalesv2;

/**
 *
 * @author Mai
 */
public abstract class Transaction extends Thread {
    protected int transactionNumber; // So subclass can access
    public Transaction(int tNumber){
        transactionNumber = tNumber;
    }

    abstract public void run();
}
