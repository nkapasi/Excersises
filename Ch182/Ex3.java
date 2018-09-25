import java.util.Scanner;

public class Ex3 {
    public static void main( String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Low End of Range:");
        int lowend = scan.nextInt();

        System.out.println("High End of Range:");
        int highend = scan.nextInt();

        int sumofrange = 0;
        int sumoutofrange = 0;
        
        System.out.println("Enter Data:");
        int value = scan.nextInt();

        while(value != 0) {
            if (value<highend && value>lowend){
                sumofrange = sumofrange + value;
            } else {
                sumoutofrange = sumoutofrange + value;
            }
            System.out.println("Enter Data:");
            value = scan.nextInt();
        }

        System.out.println("Sum of in range values: " + sumofrange);
        System.out.println("Sum of out of range values: " + sumoutofrange);
    }
}