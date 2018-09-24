import java.util.Scanner;

public class Ex1 {
    public static void main( String[] args) {
        int hours;
        int zones;
        int depart;
        int arrive;

        Scanner scan = new Scanner(Sytem.in);

        System.out.println("Enter the number of hours:");
        hours = scan.nextInt();

        System.out.println("Enter number of zones crossed:");
        zones = scan.nextInt();

        System.out.println("Enter the Departure time:")
        depart = scan.nextInt();

        System.out.println('Enter Arrival time');
        arrive = scan.nextInt();

        if (depart < 12 && depart > 8) {
            depart = 0;
        } else if (depart < 16 && depart > 12){
            depart = 1;
        } else if (depart < 22 && depart >16) {
            depart = 3;
        } else (depart )
    }
}