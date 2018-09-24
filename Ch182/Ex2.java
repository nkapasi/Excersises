import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int initmiles;
        int finalmiles;

        int gallons;
        int mpg;

        System.out.println(" Initial Miles: ");
        initmiles = scan.nextInt();

        System.out.println("Final Miles :");
        finalmiles = scan.nextInt();

        System.out.println("Gallons");
        gallons = scan.nextInt();


        while(initmiles>=0) {
            
            mpg = (finalmiles - initmiles)/gallons;

            System.out.println("Miles per Gallon: " + mpg + "\n");
            
            System.out.println("Initial Miles: ");
            initmiles = scan.nextInt();

            System.out.println("Final Miles :");
            finalmiles = scan.nextInt();

            System.out.println("Gallons");
            gallons = scan.nextInt();


        }
    }
}