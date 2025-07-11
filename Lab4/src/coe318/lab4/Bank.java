/**
 *
 * @author Anith Rajakumar
 */
package coe318.lab4;

public class Bank {
    private String name;
    /**
     * An array of Accounts managed by
     * this bank.
     */
    private Account [] accounts;
    private int numAccounts;//number of active accounts

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }


    /**
     * @return the name
     */
    public String getName() {
        return this.name;  //Fixed to return name
    }

    /**
     * @return the numAccounts
     */
    public int getNumAccounts() {
        return this.numAccounts; //Fixed to retunr number of accounts
    }


    public Account[] getAccounts() {
        return this.accounts; //Fixed to return the array of accounts
    }

    /**
     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */
    public boolean hasAccountNumber(int accountNumber) {
        //runs through the array of accounts 
        for(int i = 0; i <= this.numAccounts; i++){
            //checks to make sure the account isnt empty
            if(accounts[i] != null){
                //checks to see if the number is the same
                if(accounts[i].getNumber() == accountNumber){
                    //returns true and acts like a break
                    return true;
                } 
            }
        }
        return false;
    }

    /**
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
        // Makes sure that the limit is not reached
        if(getAccounts().length != this.numAccounts){
            //runs through the array of accounts
            for(int i = 0; i <= this.numAccounts; i++){
                //ensures that the account is not empty
                if(accounts[i] != null){
                    // checks to see if the account numbers are equal at "i"
                    if(accounts[i].getNumber() == account.getNumber()){
                        // Once one is found return false and end this method
                        return false;
                    }
                }
            }
        } 
        //adds the account to the array
        accounts[this.numAccounts] = account;
        //adds 1 to total active account numbers
        this.numAccounts+=1;
        // if account number cant be found then return true 
        return true;
        
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }
}