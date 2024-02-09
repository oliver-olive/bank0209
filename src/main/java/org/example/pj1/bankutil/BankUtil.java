package org.example.pj1.bankutil;

import org.example.pj1.bank.Account;
import org.example.pj1.bank.Customer;

import java.util.Scanner;
import java.util.TreeSet;

public class BankUtil {
    public static void main(String[] args) {

        TreeSet<Account> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Customer Number: ");
        int custNo = sc.nextInt();
        System.out.print("Customer Name: ");
        String custName = sc.next();
        System.out.print("Customer Phone: ");
        int custPhone = sc.nextInt();
        Customer c1 = new Customer(custNo,custName,custPhone,ts);

        try{
            for (int i = 1; i <= 2; i++) {
                System.out.println("\nEnter details for Account " + i + ":");
                System.out.print("Account Number: ");
                String accNumber = sc.next();
                System.out.print("Account Balance: ");
                double accBalance = sc.nextDouble();
                System.out.print("Cheque Book Status (Yes/No): ");
                String chequeStatus = sc.next();
                Account account = new Account(accNumber, accBalance, chequeStatus);
                c1.addNewAccount(account);
            }
            System.out.println("\nDetails of all accounts for the customer:");
            for (Account acc : c1.getAccountList()) {
                System.out.println("Account Number: " + acc.getAccountNumber());
                System.out.println("Account Balance: " + acc.getAccountBalance());
                System.out.println("Cheque Book Status: " + acc.getChequeBookStatus());
                System.out.println("----------------------");
            }
            System.out.print("\nEnter the account number to print balance: ");
            String accToPrint = sc.next();

            for (Account acc : c1.getAccountList()) {
                if (acc.getAccountNumber().equals(accToPrint)) {
                    c1.printBal(acc);
                    break;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }  finally {
            sc.close();
        }
    }
}
