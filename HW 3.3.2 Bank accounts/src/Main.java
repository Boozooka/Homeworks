public class Main {
    public static void main(String[] args) {
        Account savingAccount = new SavingAccount();
        Account creditAccount = new CreditAccount();
        Account checkingAccount = new CheckingAccount();

        creditAccount.pay(500);
        savingAccount.addMoney(1000);
        System.out.println("Before");
        System.out.println(savingAccount.getAccAmount());
        System.out.println(creditAccount.getAccAmount());
        savingAccount.transfer(creditAccount, 800);
        System.out.println("Later");
        System.out.println(savingAccount.getAccAmount());
        System.out.println(creditAccount.getAccAmount());
        savingAccount.transfer(creditAccount, 200);
        System.out.println("Later 2");
        System.out.println(savingAccount.getAccAmount());
        System.out.println(creditAccount.getAccAmount());


    }
}
