package prob4E;

public class SavingsAccount extends Account{
    private double balance;
    private double interestRate;
    private String acctId;

    public SavingsAccount(String acctId, double balance, double interestRate) {
        this.acctId = acctId;
        this.balance = balance;
        this.interestRate = interestRate;
    }


    @Override
    String getAccountId() {
        return acctId;
    }

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }


}
