import java.util.Scanner;

public class Ex8 {
    public static void main( String[] args) {
        int age;
        int time;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your age:");
        age = scan.nextInt();

        System.out.println("What is the time:");
        time = scan.nextInt();

        if ( age<13 && time<1700) {
            System.out.println("Price is 2.00$");
        } else if ( age >13 && time <1700) {
            System.out.println("Price is 5.00$");
        } else if (age > 13 && time >1700) {
            System.out.println("Price is 8.00$");
        } else if (age < 13 && time >1700 ) {
            System.out.println("Price is 4.00$");
        }
    }
}
