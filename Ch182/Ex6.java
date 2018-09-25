import java.util.Scanner;

public class Ex6 {
    public static void main( String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String username = "";
        String password = "";

        while(!username.equals("quit") && !password.equals("exit")) {
            System.out.print("What is your Username:  ");
            username = scan.nextLine();

            System.out.print("What is your password:  ");
            password = scan.nextLine();

            if (username.equals("user name") && password.equals("password")) {
                System.out.println("You have logged in with priority");
            }else if (username.equals("joy") && password.equals("sun")){
                System.out.println("You have logged in with priority 4");
            }else if (username.equals("gates") && password.equals("monopoly")){
                System.out.println("You have logged in with priority 1");
            }else if (username.equals("jobs") && password.equals("apple")){
                System.out.println("You have logged in with priority 3");
            }else if (username.equals("root") && password.equals("secret")){
                System.out.println("You have logged in with priority 5");
            } else {
                System.out.println("Logon failed");
            }


        }
    }
}