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
public class PointOfSalesV2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        ArrayList<Item> items = new ArrayList<Item>();
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        
        for(int i = 0; i < 200; i++){
            items.add(new Item(100+i, i+1.50, 10));
            System.out.println("Item number #:" + items.get(i).getItemNumber() + " Cost: $" + items.get(i).getItemPrice());
        }
        

        
    /*  for(int j=0; j < 10; j++){
           transactions.add(new CheckInventory(4*j, items.get(j)));
            transactions.add(new SaleItem(4*j+1, items.get(j), j));
           transactions.add(new ReturnItem(4*j+2, items.get(j), 1));
            transactions.add(new ExchangeItem(4*j+3, items.get(j), items.get(j+1), 1));
        }

            
            
       for(int k = 0; k < 40; k++){
            
            transactions.get(k).start();
          //  Thread.sleep(1000);
            
       }
       */

       transactions.add(new ExchangeItem(0, items.get(11), items.get(12), 1));
       transactions.add(new ExchangeItem(1, items.get(12), items.get(11), 1));
       transactions.get(0).start();
       transactions.get(1).start();
  /*    for(int k = 0; k <41; k++){
            try{
                transactions.get(k).join();
            }catch(Exception e){
                System.out.println("interrupted");
            }
            
        }

    
      for(int k = 0; k <13; k++){
           System.out.println("The amount of item # " + items.get(k).getItemNumber() + " is " + items.get(k).getItemAmount());
     }

*/
    }


}