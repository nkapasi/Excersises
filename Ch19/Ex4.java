import java.util.Scanner;

public class Ex4 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String input = scan.nextLine();

        int count = 0;

        while( count < input.length()) {
            System.out.println(input.charAt(count));
            count = count +1;
        }
    }
}