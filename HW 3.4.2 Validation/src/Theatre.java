public class Theatre extends Event{
    int rating;
    Theatre(String name, int year, int ageLimit, int rating){
        super(name, year, ageLimit);
        this.rating = rating;
    }

    @Override
    protected void validation() throws RuntimeException{
        if (name == null || year == 0 || ageLimit == 0 || rating == 0){
            throw new RuntimeException(name + " is not correct");
        }
    }
}
