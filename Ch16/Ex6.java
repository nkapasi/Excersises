import java.util.Scanner;

public class Ex6 {
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);
        int wspeed;
        int temp;

        System.out.println("What is the wind speed:");
        wspeed = scan.nextInt();

        System.out.println("What is the temperature:");
        temp = scan.nextInt();

        if (wspeed < 3) {
            System.out.println("Wind Chill is "+ temp);
        } else if (temp > 50) {
            System.out.println("Wind Chill is "+ temp);
        } else {
            double windchill = 35.74 + .6215*temp - 35.75*Math.pow(wspeed, .16) + .4275*temp*Math.pow(wspeed, .16);
            System.out.println("Chill is "+ windchill);
        }

    }
}