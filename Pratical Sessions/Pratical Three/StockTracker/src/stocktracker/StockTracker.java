/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.PhysicalStockItem;
import stocktracker.stockdatamodel.ServiceStockItem;

/**
 *
 * @author kmazur
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        PhysicalStockItem objPhysicalitem = new PhysicalStockItem("Snuff; A Diskworld book by Terry Prachett", 100);
        ServiceStockItem objVirtualItem = new ServiceStockItem("Ya Yeet");
        
        String strMessage = objPhysicalitem.getName()
                + ", is in stock = " + objPhysicalitem.isInStock()
                + ", qty in stock: " + objPhysicalitem.getQuantityInStock();
        System.out.println(strMessage);
        
        strMessage = objVirtualItem.getName()
                + ", is in stock = " + objVirtualItem.isInStock()
                + ", qty in stock: " + objVirtualItem.getQuantityInStock();
        System.out.println(strMessage);
    }
    
}
