public class Main {

    public static void main(String[] args){
        BankAccountOverdraft overdraftAccount = new BankAccountOverdraft("FabioDeel", 1000.0, 200.0);
        BankAccountCommision commisionAccount = new BankAccountCommision("FabioAcc", 1000.0, 5.0);

        overdraftAccount.withdraw(1100.0);
        commisionAccount.withdraw(500.0);

        Check eugenioCheck = new Check("Eugenio R.", 1000.0);

        commisionAccount.deposit(eugenioCheck);
    }
}
