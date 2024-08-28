public class Main {
    public static void main(String[] args) {
        int[] comm_a = { 45, 31, 24, 22, 20, 17, 14, 13, 12, 10 };
        int[] comm_b = { 31, 18, 15, 12, 10, 8, 6, 4, 2, 1 };
        int[] comm_c = { 51, 30, 10, 9, 8, 7, 6, 5, 2, 1 };
        int [][] regional_teams = { comm_a, comm_b, comm_c };

        int [] national_team = national_team(regional_teams);
        print_arr(national_team);
    }
    public static int[] national_team (int [][] regional_teams){
        int[] team = regional_teams[0];
        for (int i = 1; i < regional_teams.length; i++){
            team = merge(team, regional_teams[i]);
        }
        return team;
    }
    public static int [] merge (int[] team, int[] regional_team){
        int[] national_team = new int[10];
        int a, b, c;
        a = 0;
        b = 0;
        c = 0;
        while (c < 10){
            if (team[a] >= regional_team[b]){
                national_team[c] = team[a];
                a++;
            } else {
                national_team[c] = regional_team[b];
                b++;
            }
            c++;
        }
        return national_team;
    }
    public static void print_arr (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
