/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalesv2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mai
 */
public class ExchangeItem extends Transaction{
    private int amount;
    private Item item1;
    private Item item2;
    Item first;
    Item second;
    public ExchangeItem(int tNumber, Item item1, Item item2, int amount) {
        super(tNumber);
        this.item1 = item1;
        this.item2 = item2;
        this.amount = amount;
    }
    
    @Override
    public void run() {      
      System.out.println("This is an exchange transaction.");
      System.out.println("Returning item: #" + item1.getItemNumber() + "(amount :" + item1.getItemAmount() + ")" + " and purchasing item: #" + item2.getItemNumber() + "(amount :" + item2.getItemAmount() + ")");
      if(item1.getItemNumber() < item2.getItemNumber()){
          first=item1;
          second = item2;
      }else{
          first=item2;
          second = item1;
      }
      synchronized(first){
      // Thread.yield();
           try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Waiting for item 2"); 
      synchronized(second){
      int startingAmount = item1.getItemAmount();
      int item2StartingAmount = item2.getItemAmount();
      if(amount <= startingAmount){
          item1.setItemAmount(startingAmount - amount);
          item2.setItemAmount(item2StartingAmount + amount);
          System.out.println("Item # " + item1.getItemNumber() + " has been purchased. It cost: $" + item1.getItemPrice());
          System.out.println("Item # " + item2.getItemNumber() + " has been returned.");
          System.out.println("Your final cost is :$" + (item2.getItemPrice() - item1.getItemPrice()));
          System.out.println("Inventory has: item #" + item1.getItemNumber() + " :" + item1.getItemAmount() + ", and item #" + item2.getItemNumber()+ " :" + item2.getItemAmount());
      }else{ 
      System.out.println("Item # " + item1.getItemNumber() + " is sold out.");
      return;
      }
      }
      }
     /* int item2StartingAmount = item2.getItemAmount();
      item2.setItemAmount(item2StartingAmount + amount);
      System.out.println("Item # " + item2.getItemNumber() + " has been returned.");
      */
    }
    
}
