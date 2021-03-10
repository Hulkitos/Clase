package es.hulk.programacio.exercises.clases_subclases.AbstractBanking;

public class CheckingAcount extends Account{

    private double overDraftLimit;

    public CheckingAcount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    public CheckingAcount(double balance) {
        super(balance);
        this.overDraftLimit = 0;
    }

    public boolean withdraw(double amount) {
        if (amount <= (balance + overDraftLimit)) {
                balance -= amount;
                return true;
            }
        return false;
    }

    public String getDescription () {
        return "Over Draft Limit Account " + overDraftLimit;
    }


}
