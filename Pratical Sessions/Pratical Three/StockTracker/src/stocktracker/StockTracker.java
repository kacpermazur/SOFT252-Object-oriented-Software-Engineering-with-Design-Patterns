/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.AnObserver;
import stocktracker.stockdatamodel.PhysicalStockItem;
import stocktracker.stockdatamodel.ServiceStockItem;
import stocktracker.stockdatamodel.StockItem;

/**
 *
 * @author kmazur
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       StockItem objTestItem1 = new PhysicalStockItem("Keemstar");
       StockItem objTestItem2 = new ServiceStockItem("Dank");
       
       AnObserver aob = new AnObserver();
       
       objTestItem1.registerObserver(aob);
       objTestItem2.registerObserver(aob);
       
       System.out.println("Chaning quantity opf physical stock");
       objTestItem1.setQuantityInStock(10);
       
       System.out.println("Chaning quantity opf physical stock");
       objTestItem2.setSellingPrice(20.22);
    }
    
}
