/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingappication3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankingAppication3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank("xyz");
        int option = 0 , accountNumber = 0;
        String accountName, accountType = null;
        int number;
        double balance,amount,minimum=1000;
        
        Account account  = null;

        
        while(option!= 6  ){
        System.out.println("Main Menu");
        System.out.println("1. Display All Accounts");
        System.out.println("2. Open new Accounts");
        System.out.println("3. Close existing accounts ");
        System.out.println("4. Deposit");
        System.out.println("5. Withdraw");
        System.out.println("6. Exit");
        System.out.println();
        
            System.out.print("ENTER your Choice: ");
            option = scan.nextInt();
            scan.nextLine();
            System.out.println();
            
            switch(option ) {
                case 1:
                    bank.listAccounts();
                    break;
                case 2:
                    accountNumber = generatedAccountNumber();
                    System.out.print("Enter Account Name : ");
                    accountName = scan.nextLine();
                    System.out.print("Enter initial Balance : ");
                    balance = scan.nextDouble();
                    scan.nextLine();
                    System.out.println("Enter Account (S (SavingAcc) OR C (CurrentAcc)): ");
                    accountType = scan.nextLine();
                    
                    if (accountType.toLowerCase().equals("S")){
                    account = new SavingsAccount (accountNumber, accountName, balance );
                    }
                    else if(accountType.toLowerCase().equals("C")){
                    account = new CurrentAccount(accountNumber,  accountName,  balance);
                    } 
                   
                   bank.openAccount(account);
                  
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    number = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter Account (S (SavingAcc) OR C (CurrentAcc)): ");
                     accountType = scan.nextLine();
                     if (accountType.toLowerCase().equals("S")){
                     account = bank.getAccount(accountNumber, "SavingsAccount");
                    }
                    else if (accountType.toLowerCase().equals("C")){
                    account = bank.getAccount(accountNumber , "CurrentAccount");
                    }
                    
                    bank.closeAccount(account);
                    System.out.println("Account is deleted success");
                    break;
                case 4:
                    System.out.print("Enter "
                    + "Account Number ");
                    System.out.println("Enter Account (S (SavingAcc) OR C (CurrentAcc)): ");
                    accountType = scan.nextLine();
                    number = scan.nextInt();
                    scan.nextLine();
                     if (accountType.toLowerCase().equals("S")){
                     account = bank.getAccount(accountNumber, "SavingsAccount");
                    }
                    else if (accountType.toLowerCase().equals("C")){
                    account = bank.getAccount(accountNumber , "CurrentAccount");
                    }
                    System.out.print("Enter Amount :");
                    amount = scan.nextDouble();
                    bank.depositMoney(account , amount);                   
                    break;
                case 5:
                    System.out.print("Enter Account Number : ");
                    number = scan.nextInt();
                    scan.nextLine();
                    if (accountType.toLowerCase().equals("S")){
                     account = bank.getAccount(accountNumber, "SavingsAccount");
                    }
                    else if (accountType.toLowerCase().equals("C")){
                    account = bank.getAccount(accountNumber , "CurrentAccount");
                    }
                    System.out.print("Enter Amount :");
                    amount = scan.nextDouble();
                    bank.withdrawMoney(account, amount);
            }
           
        }
    }
    
    public static int generatedAccountNumber(){
        Random random = new Random();
        int accNumber  = 100000 + random.nextInt(900000);
        return accNumber;}
    
}
