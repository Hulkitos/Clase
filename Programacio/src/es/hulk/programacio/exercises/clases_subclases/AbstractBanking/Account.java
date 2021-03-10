package es.hulk.programacio.exercises.clases_subclases.AbstractBanking;

public abstract class Account{

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public  double getBalance() {return this.balance;}

    public String toString() {
        return getDescription() + ": current balance is " + balance;
    }

    public abstract boolean withdraw(double amount);

    public abstract String getDescription();


}
