public class ProgressiveTax extends TaxType{
    double taxAmount;
    @Override
    protected double calculateTax(double amount) {
        taxAmount = (amount < 100_000) ? amount * 0.1 : amount * 0.15;
        return taxAmount;
    }
}
