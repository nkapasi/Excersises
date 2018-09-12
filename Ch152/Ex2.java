import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        int character;

        System.out.println("Enter a word:");
        input = scan.next();

        character = input.length();

        int i = 0;

        while (i<character) {
            System.out.println(input);
            i = i+1;

        }

    }
}