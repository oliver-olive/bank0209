package org.example.pj1.bank;

import org.example.pj1.exceptions.InvalidDataException;

public class Account implements Comparable<Account> {


    private String accountNumber;
    private double accountBalance;
    private String chequeBookStatus;

    public Account(String accountNumber, double accountBalance, String chequeBookStatus) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.chequeBookStatus = chequeBookStatus;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) throws InvalidDataException {
        if(accountNumber.startsWith("ACC")){
            this.accountNumber = accountNumber;
        }else{
            throw new InvalidDataException();
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) throws InvalidDataException {
        if(accountBalance > 1000) {
            this.accountBalance = accountBalance;
        }else{
            throw new InvalidDataException();
        }
    }

    public String getChequeBookStatus() {
        return chequeBookStatus;
    }

    public void setChequeBookStatus(String chequeBookStatus) throws InvalidDataException {
        if(chequeBookStatus.equalsIgnoreCase("Yes") || chequeBookStatus.equalsIgnoreCase("No")){
            this.chequeBookStatus = chequeBookStatus;
        }else{
            throw new InvalidDataException();
        }
    }

    @Override
    public int compareTo(Account o) {
        return this.accountNumber.compareTo(o.accountNumber);
    }
}

