package com.company;

public class Player {

    BankAccount account;
    String name;

    public Player(String name, int balance){
        account = new BankAccount(balance);
        this.name = name;


    }

}
