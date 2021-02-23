package es.hulk.programacio.exercises.clases_subclases.AbstractBanking;

public enum DepositLenght {

    THREE_MONTHS (90),
    SIX_MONTHS (180);

    private int days;

    private DepositLenght(int days){
        this.days = days;
    }

    public int getDays() {
        return this.days;
    }
}
