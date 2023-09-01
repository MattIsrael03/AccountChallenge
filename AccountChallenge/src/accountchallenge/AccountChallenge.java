/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountchallenge;

/**
 *
 * @author User
 */
public class AccountChallenge {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public AccountChallenge(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
//Getters
    public int AccountNumber() {
        return accountNumber;
    }

    public double AccountBalance() {
        return accountBalance;
    }

    public String CustomerName() {
        return customerName;
    }
  
    public String Email() {
        return email;
    }

    public String PhoneNumber() {
        return phoneNumber;
    }
    
//    setters
    public void tAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    } 
    public void AccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void CustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void Email(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited ₱" + amount + " into the account. \nNew balance: ₱" + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawn ₱" + amount + " from the account. \nNew balance: ₱" + accountBalance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

