/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankentities;

/**
 *
 * @author kmazur
 */
public class BankAccount {
    private double balance;
    private double overdraft;
    private String holder;
    
    public BankAccount(String holder)
    {
        this.holder = holder;
        this.overdraft = 500;
        this.balance = 100;
    }
    
    public void depositMoney(int amount)
    {
        balance += amount;
    }
}
