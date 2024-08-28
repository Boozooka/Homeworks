public class VATax extends TaxType{
    double taxAmount;
    @Override
    protected double calculateTax(double amount) {
        taxAmount = amount * 0.18;
        return taxAmount;
    }
}
