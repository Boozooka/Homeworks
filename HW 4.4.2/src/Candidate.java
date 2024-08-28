public class Candidate implements Comparable<Candidate> {
    String name;
    Integer relevance, rating;

    public Candidate(String name, Integer relevance, Integer rating) {
        this.name = name;
        this.relevance = relevance;
        this.rating = rating;
    }

    @Override
    public int compareTo(Candidate o) {
        if (name.equals(o.name)) {
            return 0;
        }
        if (relevance > o.relevance) {
            return 1;
        } else if (relevance < o.relevance) {
            return -1;
        } else if (relevance == o.relevance) {
            if (rating > o.rating) {
                return 1;
            } else if (rating < o.rating) {
                return -1;
            }
        }
        return name.compareTo(o.name);
    }
}
