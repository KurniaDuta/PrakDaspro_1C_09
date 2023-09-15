package P3;
import java.util.Scanner;

public class Login {

    private static String[] usernames = {"admin", "user1", "user2"};
    private static String[] passwords = {"password", "password1", "password2"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean isLoginSuccessful = false;
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                isLoginSuccessful = true;
                break;
            }
        }

        if (isLoginSuccessful) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
    }
}