/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @Anith Rajakumar
 */
public class Account {
    //instance variable for class Account
    private String name;
    private int number;
    private double balance;
    
    //Constructor for Account Class
    public Account(String name, int number, double initialBalance){
        this.name = name;
        this.number = number;
        this.balance = initialBalance;
        
    }
    
    //method to to deposit money and return true if successful 
    Boolean deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }
    
    //method to withdraw money and returning true if successful
    Boolean withdraw(double amount){
        if(amount > 0 && (amount <= this.balance)){
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
    //returns the name of the account holder
    public String getName(){
        return this.name;
    }
    
    //returns the balance of the account
    public double getBalance(){
        return this.balance;
    }
    
    //returns the account number
    public int getNumber(){
        return this.number;
    }
        
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
        String.format("$%.2f", getBalance()) + ")";
    }
}
