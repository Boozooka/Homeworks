public abstract class Account {
    String name;
    protected int accAmount;
    protected abstract void pay (int amount);
    protected abstract void transfer (Account account, int amount);
    protected abstract void addMoney (int amount);
    public int getAccAmount(){
        return accAmount;
    }
    public void setAccAmount(int count){
        accAmount = count;
    }
}

