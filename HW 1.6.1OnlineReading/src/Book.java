public class Book {
    String name;
    String author;
    int countPage;
    int rating;

   public Book (String name, String author, int countPage, int rating) {
        this.name = name;
        this.author = author;
        this.countPage = countPage;
        this.rating = rating;
    }
    public void nameBook (){
        System.out.println("\nName: " + name + "\nAuthor: " + author);
    }
    public void ratingComparison (Book book){
       if (rating > book.rating){
           System.out.println("\nBetter book is " + name);
       } else if (book.rating > rating){
           System.out.println("\nBetter book is " + book.name);
       } else {
           System.out.println("Books equally good");
       }
    }
    public void equalityAuthor(Book book){
        if (author.equals(book.author)) System.out.println("Книги от одного автора");
        else System.out.println("Книги от разных авторов");
    }
}
