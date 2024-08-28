import java.util.Collections;
import java.util.TreeSet;

public class Main {
    static TreeSet<Candidate> set = new TreeSet<>();

    public static void main(String[] args) {
        addCandidate("Ivanov Ivan Petrov", 3, 4);
        addCandidate("Gilov Kirill Genadyevich", 3, 5);
        addCandidate("Petrov Poul Nikitovich", 4, 5);
        addCandidate("Russkich Poul Aleksandrovich", 3, 3);
        addCandidate("Fedyaev Arseniy Alekseevich", 5, 5);
        addCandidate("Filipskich Ivan Michailovich", 4, 2);
        addCandidate("Yamshamova Sofya Genadyevna", 3, 2);
        addCandidate("Starodumova Anastasia Ivanova", 5, 3);
        addCandidate("Andrianova Alica Olegovna", 5, 5);
        addCandidate("Kurova Olga Michailovna", 5, 2);
        addCandidate("Kurova Olga Michailovna", 5, 1);
        showSet();
        System.out.println("The Best candidate is...\n");
        showCandidate(set.last());

    }

    public static void addCandidate(String name, Integer relevance, Integer rating) {

        Candidate candidate = new Candidate(name, relevance, rating);
        set.add(candidate);
    }

    public static void showSet() {
        for (Candidate candidate : set) {
            showCandidate(candidate);
        }
    }

    public static void showCandidate(Candidate candidate) {
        System.out.println(candidate.name + " Relevance: " + candidate.relevance + "Rating: " + candidate.rating);
    }
}
