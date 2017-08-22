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
public class CheckInventory extends Transaction {
    private Item item;
    public CheckInventory(int tNumber, Item item) {
        super(tNumber);
        this.item = item;
    }

    @Override
    public void run() {
       synchronized(this){
       Thread.yield();
       System.out.println("Item number # " +item.getItemNumber() + " cost $ :" + item.getItemPrice() + ". There are " + item.getItemAmount() + " in the inventory.");
       }
    }
    
    
}
