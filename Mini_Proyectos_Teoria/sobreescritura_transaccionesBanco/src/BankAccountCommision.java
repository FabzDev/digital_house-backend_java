public class BankAccountCommision extends BankAccount {
    private Double commision;

    public BankAccountCommision(String accountOwner, Double balance, Double commision) {
        super(accountOwner, balance);
        this.commision = commision;
    }

    public void deposit(Check check) {
        super.deposit(check.getAmount());
    }

    @Override
    public void withdraw(Double amount) {
        Double realWithdraw = amount + this.commision;
        super.withdraw(realWithdraw);
    }
}
