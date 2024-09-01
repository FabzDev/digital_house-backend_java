public class BankAccountOverdraft extends BankAccount {
    private Double overdraftAmount;

    public BankAccountOverdraft(String accountOwner, Double balance, Double overdraftAmount) {
        super(accountOwner, balance);
        this.overdraftAmount = overdraftAmount;
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
    }

    @Override
    public Boolean canIWithdraw(Double amount) {
        return amount <= getBalance() + overdraftAmount;
    }
}
