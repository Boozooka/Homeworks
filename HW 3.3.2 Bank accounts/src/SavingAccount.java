public class SavingAccount extends Account{
    String name = "Saving account";
    @Override
    protected void pay(int amount) {
        System.out.println("It's forbidden paying with saving account");
    }

    @Override
    protected void transfer(Account account, int amount) {
        if (getAccAmount() >= amount) {
            int oldAmount = account.getAccAmount();
            account.setAccAmount(account.getAccAmount() + amount);
            if (account.accAmount != oldAmount) {
                setAccAmount(getAccAmount() - amount);
                System.out.println("From " + name + " was transfer " + amount + " rubbles.");
            } else {
                System.out.println("Try add less amount");
                return;
            }
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    protected void addMoney(int amount) {
        setAccAmount(getAccAmount() + amount);
        System.out.println("On " + name + " was added " + amount + " rubbles.");
    }
}

