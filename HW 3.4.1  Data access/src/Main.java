import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);
        String login, password;
        int age;

            System.out.println("Enter login");
            login = scanner.nextLine();
            System.out.println("Enter password");
            password = scanner.nextLine();
            userCheck(login, password);
            System.out.println("Data access allow");

    }
    public static void userCheck(String login, String password)throws UserNotFoundException, AccessDeniedException{
        User[] users = getUsers();
        for (User check : users) {
            if (check.login.equals(login) && check.password.equals(password)){
                System.out.println("User found");
                if (check.age >= 18){
                    return;
                } else {
                    throw new AccessDeniedException();
                }
            }
        }
        throw new UserNotFoundException();
    }

    public static User[] getUsers(){
        User[] users = new User[] {
            new User("boozooka", "qwerty", 14),
            new User("kech", "sosolala", 18),
            new User("n1rds", "09012007", 24)
        };
        return users;
    }
}
