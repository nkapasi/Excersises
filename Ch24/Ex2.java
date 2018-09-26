import java.util.Scanner;


public class Ex2 {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter N:");

        int N = scan.nextInt();
        int sum = 0;

        for ( int count = 1; count < N; count=count+2) {
            sum = sum + count;
        }

        System.out.println(sum);
        System.out.println((N*N));
    }
}