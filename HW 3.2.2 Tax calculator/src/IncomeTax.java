public class IncomeTax extends TaxType{
    double taxAmount;
    @Override
    protected double calculateTax(double amount) {
        taxAmount = amount * 0.13;
        return taxAmount;
    }
}
