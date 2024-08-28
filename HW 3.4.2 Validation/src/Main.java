public class Main {
    public static void main (String[] args){
        for (Cinema cinema : getCinema()) {
            cinema.validation();
        }
        for (Theatre theatre : getTheatre()) {
            theatre.validation();
        }
        System.out.println("All events is correct");
    }
    public static Cinema[] getCinema (){
        return new Cinema[]{
                new Cinema("Star Wars ", 1999, 16, 250),
                new Cinema("Wasteland", 2005, 12, 180),
                new Cinema("Birth of Gods", 2008, 16, 250)
        };
    }
    public static Theatre[] getTheatre (){
        return new Theatre[]{
                new Theatre("Inferno", 2008, 16, 10),
                new Theatre("Mount olympus", 2015, 18, 9),
                new Theatre("Rabbit and Friends", 2020, 6, 7)
        };
    }
}

