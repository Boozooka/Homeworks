public class CreditAccount extends Account{
    String name = "Credit account";

    @Override
    public void setAccAmount(int count) {
        if (count > 0){
            System.out.println("Credit account cannot have positive balance, try add less amount");
            return;
        } else {
            accAmount = count;
        }
    }

    @Override
    protected void pay(int amount) {
        setAccAmount(getAccAmount() - amount);
        System.out.println("With " + name + " paying " + amount + " rubles");
    }

    @Override
    protected void transfer(Account account, int amount) {
            setAccAmount(getAccAmount() - amount);
            account.setAccAmount(getAccAmount() + amount);
            System.out.println("From " + name + " was transfer " + amount + " rubbles.");

    }

    @Override
    protected void addMoney(int amount) {
        if (Math.abs(getAccAmount()) <= amount){
            System.out.println("Credit account cannot have positive balance, try add less amount");
            return;
        } else {
            setAccAmount(getAccAmount() + amount);
            System.out.println("To " + name + " was added " + amount + " rubles");
        }
    }
}
