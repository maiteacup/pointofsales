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
public class Item {
    int itemNumber;
    double itemPrice;
    int amount;
   public Item(int itemNumber, double itemPrice, int amount){
        this.itemNumber = itemNumber;
        this.itemPrice = itemPrice;
        this.amount = amount;
    }
   public void setItemNumber(int itemNumber){
       this.itemNumber = itemNumber;
   }
   public void setItemPrice(double itemPrice){
       this.itemPrice = itemPrice;
   }
   public int getItemNumber(){
       return this.itemNumber;
   }
   public double getItemPrice(){
       return this.itemPrice;
   }
   public void setItemAmount(int newAmount){
       this.amount = newAmount;
   }
   public int getItemAmount(){
       return amount;
   }
}
