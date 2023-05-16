/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingappication3;

/**
 *
 * @author Student
 */
public class SavingsAccount implements Account {
    private int accountNumber;
    private String accountName;
    private double balance ;
    private final String accountType = "SavingsAccount";

    public SavingsAccount(int accountNumber, String accountName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        
    }

    SavingsAccount(int accountNumber, String accountName, double balance) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getAccountName() {
        return accountName;
    }
    @Override
    public void deposit (double amount ){
    this.balance = this.balance+amount;
    }
    @Override
    public void withdraw (double amount){
        this.balance = this.balance - amount;
    }
    @Override
    public double getBalanance(){
     return this.balance;
    }
    @Override
    public String getAccountType(){
    return this.accountType;
    }

    @Override
    public double getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
            
}
