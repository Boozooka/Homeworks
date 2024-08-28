public class Book extends BookMover{
    protected String name;
    protected Status status = Status.AVAILABLE;
    Book (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Status getStatus(){
        return status;
    }

}
