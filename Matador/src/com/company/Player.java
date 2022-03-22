package com.company;

public class Player {

    private BankAccount account;
    private String name;
    private int currentPosition = 1;

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

    public void buyProperty(int amount, int id){
        this.account.doTransaction(-amount);
    }

    public void receiveMoney(int amount){
        this.account.doTransaction(amount);
    }

    public void payRent(int amount, Player recipient){
        boolean result = this.account.doTransaction(-amount);
        if(result == true) {
            recipient.account.doTransaction(amount);
        }
    }

    public int getCurrentPosition(){
        return currentPosition;
    }

    public int updatePosition(int roll){
        currentPosition += roll;
        if(currentPosition > 40){
            currentPosition -= 40;
        }
        return currentPosition;
    }






}
