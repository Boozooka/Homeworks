public class Main {
    public static void main(String[] args) {

        int vasyaAge = 44;
        int anyaAge = 23;
        int mishaAge = 18;

        int min = -1;
        int mid = -1;
        int max = -1;

        if (vasyaAge < anyaAge && vasyaAge < mishaAge) {
            min = vasyaAge;
        } else if (anyaAge < vasyaAge && anyaAge < mishaAge) {
            min = anyaAge;
        } else if (mishaAge < vasyaAge && mishaAge < anyaAge) {
            min = mishaAge;
        }

        if (vasyaAge > anyaAge && vasyaAge > mishaAge) {
            max = vasyaAge;
        } else if (anyaAge > vasyaAge && anyaAge > mishaAge) {
            max = anyaAge;
        } else if (mishaAge > vasyaAge && mishaAge > anyaAge) {
            max = mishaAge;
        }

        if (vasyaAge > min && vasyaAge < max) {
            mid = vasyaAge;
        } else if (anyaAge > min && anyaAge < max) {
            mid = anyaAge;
        } else if (mishaAge > min && mishaAge < max){
            mid = mishaAge;
        }

        System.out.println("Minimal: " + min);
        System.out.println("Middle: " + mid);
        System.out.println("Maximum: " + max);
    }
}
