/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingappication3 ;

/**
 *
 * @author Student
 */
public class CurrentAccount implements Account{
    private int accountNumber;
    private String accountName;
    private double balance;
    private double minimum;
    private String accountType= "CurrentAccount";

    public CurrentAccount(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.minimum = 1000 ;
    }

    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public String getAccountName() {
        return this.accountName;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    public double getMinimum() {
        return this.minimum;
    }

    public double setMinimum(double minimum) {
        return this.minimum = minimum;
    }
    
    @Override
    public void deposit (double amount ){
    this.balance = this.balance + amount;
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
    
    
    
    
    
    
    
}
