public abstract class BankAccount {
    private String accountOwner;
    private Double balance;

    public BankAccount(String accountOwner, Double balance) {
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount){
        if(canIWithdraw(amount))
            this.balance -= amount;
    }

    public Double getBalance() {
        return balance;
    }

    public Boolean canIWithdraw(Double amount){
        return amount <= this.balance;
    }
}
