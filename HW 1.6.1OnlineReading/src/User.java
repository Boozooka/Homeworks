public class User {
    String email, name, surname, startTime, bookRead;
    static int totalOnline = 0;

    public User (String name, String surname, String email, String startTime, String bookRead){
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.startTime = startTime;
        this.bookRead = bookRead;
        totalOnline++;
    }
    public void userData(){
        System.out.println("\nUser: " + surname + name + "\neMail: " + email + "\nStart reading: " + startTime + "\nReading book: " + bookRead);
    }
}
