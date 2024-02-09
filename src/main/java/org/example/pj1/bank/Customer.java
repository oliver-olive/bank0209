package org.example.pj1.bank;

import java.util.TreeSet;

public class Customer {
    private int custNo;
    private String custName;
    private int custPhone;
    private TreeSet<Account> account;

    public Customer(int custNo, String custName, int custPhone, TreeSet<Account> account) {
        this.custNo = custNo;
        this.custName = custName;
        this.custPhone = custPhone;
        this.account = account;
    }
    public void addNewAccount(Account a1){
        this.account.add(a1);
    }
    public TreeSet<Account> getAccountList(){
        return this.account;
    }
    public void printBal(Account a1){
        System.out.println(a1.getAccountBalance());
    }
}
