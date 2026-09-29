import java.util.Scanner;

public class LoginServices {

    boolean login(String username, String password) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String user = sc.nextLine();
        System.out.println("Enter your password: ");
        String pass = sc.nextLine();
        if (username.equals(user) && password.equals(pass))
            return true;
        else
            return false;
    }

}
