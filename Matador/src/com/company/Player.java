package com.company;

public class Player {

    private BankAccount account;
    private String name;

    public Player(String name, int balance){
        this.account = new BankAccount(balance);
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return account.getBalance();
    }

    @Override
    public String toString(){
        return this.name + ": " + account.getBalance();
    }
}
