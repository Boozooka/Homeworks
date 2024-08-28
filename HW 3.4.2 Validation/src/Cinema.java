public class Cinema extends Event{
    double tickPrice;
    Cinema (String name, int year, int ageLimit, double tickPrice){
        super(name, year, ageLimit);
        this.tickPrice = tickPrice;
    }

    @Override
    protected void validation() throws RuntimeException{
        if(name == null || year == 0 || ageLimit == 0 || tickPrice == 0){
            throw new RuntimeException(name + " is not correct");
        }
    }
}
