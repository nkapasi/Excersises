import java.util.Scanner;

public class Ex3 {
    public static void main( String[] args) {
        double avg;
        double avgSquare;
        double xi;
        double xixi;
        double n;
        double count = 0;
        double xisum = 0;
        double xixisum = 0;
        double sd;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is N");
        n = scan.nextDouble();

        while(count < n) {
            System.out.println("Enter a Number:");
            xi = scan.nextDouble();

            xisum = xisum + xi;
            xixisum = xixisum + (xi*xi);

            count = count + 1;
        }

        avg = xisum/n;
        avgSquare = xixisum/n;

        sd = Math.sqrt(avgSquare - (avg*avg));

        System.out.println("Standard Deviation is " + sd);


    }
}