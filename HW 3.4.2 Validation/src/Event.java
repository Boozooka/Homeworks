public abstract class Event {
    String name;
    int year, ageLimit;

    Event (String name, int year, int ageLimit){
    this.name = name;
    this.year = year;
    this.ageLimit = ageLimit;
    }
    protected abstract void validation ();
}
