public class Bill {
    private double amount;
    private TaxType taxType;
    public Bill (double amount, TaxType taxType){
        this.amount = amount;
        this.taxType = taxType;
    }
    public void notificTax (double taxAmount){
        System.out.println("Заплачен налог в размере " + taxAmount);
    }
    public void payTax (){
        double taxAmount = taxType.calculateTax(amount);
        notificTax(taxAmount);
    }
}
