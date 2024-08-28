public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Красная шапочка","Шарль Перро", 57, 7);
        Book book2 = new Book("Руководство по Java для начинающих", "Герберт Шилдт", 801, 10);

        book1.equalityAuthor(book2);
        book1.nameBook();
        book2.nameBook();

        book1.ratingComparison(book2);

        User ivanPetrov = new User("Ivan", "Petrov", "89539779495@mail.su", "14:38", book1.name);
        User anyaKozlova = new User("Anya", "Kozlova", "kozkozlova@yanex.ru", "15:59", book2.name);
        System.out.println("\n Total Online: " + User.totalOnline);
        ivanPetrov.userData();
        anyaKozlova.userData();
    }
}
