public class Main {
    public static void main(String[] args) {
        IncomeTax incomeTax = new IncomeTax();
        VATax vaTax = new VATax();
        ProgressiveTax progressiveTax = new ProgressiveTax();
        Bill accounts[] = new Bill[]{
                new Bill(10_000, incomeTax),
                new Bill(150_000, progressiveTax),
                new Bill(100_000, vaTax),
                new Bill(95_000, progressiveTax)
        };
        for (int i = 0; i < accounts.length; i++){
            accounts[i].payTax();
        }
    }
}
