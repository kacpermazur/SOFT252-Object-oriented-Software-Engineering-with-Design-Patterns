/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratical.pkg1;

/**
 *
 * @author kmazur
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cm = 100;
        double inches = cm/2.54;
        double feet = inches/12;
        
        double numI = inches%12;
                
        System.out.println("inches " + inches);
        System.out.println("feet " + feet);
        System.out.println("numI " + numI);
        
    }
    
}
