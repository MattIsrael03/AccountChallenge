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
public class Main {
    public static void main(String[] args) {
        AccountChallenge account = new AccountChallenge(20101265, 500.00, "Matthew Israel", "matt@gmail.com", "0923-3412-1245");
        
        System.out.println("Account information:");
        System.out.println("Account Number: " + account.AccountNumber());
        System.out.println("Customer Name: " + account.CustomerName());
        System.out.println("Email: " + account.Email());
        System.out.println("Phone Number: " + account.PhoneNumber());
        System.out.println("Initial Balance:  ₱" + account.AccountBalance());

        account.deposit(1500.00);
        account.withdraw(1000.00);
        account.withdraw(500.00);  
    }
}

