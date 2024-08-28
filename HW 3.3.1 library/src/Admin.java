public interface Admin {
    public abstract void remindOverdued( Reader reader, Book book);
    public abstract void takeBook ( Reader taker, Book book);
}
