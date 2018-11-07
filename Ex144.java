import java.util.Scanner;

public class Ex144 {
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = scan.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scan.nextLine();

        String lastNameCaps = lastName.toUpperCase();

        String firstNameTrim = firstName.trim();

        System.out.println(firstName + " " + lastNameCaps.trim());
    }
}