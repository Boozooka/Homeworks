public class CheckingAccount extends Account{
    String name = "Checking account";
    @Override
    protected void pay(int amount) {
        insFunds(amount);
        setAccAmount(getAccAmount() - amount);
        System.out.println("With " + name + " was paying " + amount + " rubles");

    }
    @Override
    protected void transfer(Account account, int amount) {
        insFunds(amount);
        int oldAmount = account.getAccAmount();
        setAccAmount(getAccAmount() - amount);
        if (oldAmount != account.getAccAmount()) {
            account.setAccAmount(getAccAmount() + amount);
            System.out.println("From " + account + " was transfer " + amount + " rubbles.");
        } else {
            System.out.println("Try add less amount");
        }
    }
    @Override
    protected void addMoney(int amount) {
        setAccAmount(getAccAmount() + amount);
        System.out.println("To " + name + " was added " + amount + " rubbles.");
    }
    protected void insFunds (int amount){
        if (getAccAmount() < amount) {
            System.out.println("Insufficient funds");
            return;
        }
    }
}
