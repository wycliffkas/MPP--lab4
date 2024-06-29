package prob4E;

public class CheckingAccount extends Account{
    private double balance;
    private double monthlyFee;
    private String acctId;


    public CheckingAccount(String acctId, double fee, double startBalance) {
        this.acctId = acctId;
        this.balance = startBalance;
        this.monthlyFee = fee;
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
        return balance - monthlyFee;
    }
}
