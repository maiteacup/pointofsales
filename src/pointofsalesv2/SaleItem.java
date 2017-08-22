/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalesv2;

import java.util.ArrayList;

/**
 *
 * @author Mai
 */
public class SaleItem extends Transaction{
    private Item item;
    private int amount;
    private ItemList itemList = new ItemList();
    public SaleItem(int tNumber, Item item, int amount) {
        super(tNumber);
        this.item = item;
        this.amount = amount;

        
    }

    @Override
    public void run() {
        System.out.println("This is the sale transaction.");
        synchronized(item){
        
        int startingAmount = item.getItemAmount();
     
        if(amount <= startingAmount){
            item.setItemAmount(startingAmount - amount);
            System.out.println("You have purchased " + amount + " of item: #" + item.getItemNumber() + ". There are " + item.getItemAmount() + " in the inventory.");
        }else{
            System.out.println("There is less than " + amount + " of " + item.getItemNumber());
        }
        }
       
       }
    }
    

    

