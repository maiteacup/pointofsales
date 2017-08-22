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
public class ReturnItem extends Transaction{
        
    private int amount;
    private Item item;
    
    public ReturnItem(int tNumber, Item item, int amount) {
        super(tNumber);
        this.item = item;
        this.amount = amount;
    }

    @Override
    public void run() {
       System.out.println("This is the return transaction");  
       synchronized(item){
 
       int startingAmount = item.getItemAmount();
       item.setItemAmount(startingAmount + amount);
       System.out.println("You have returned " + amount + " of item #" + item.getItemNumber());
       }
    
}
}

