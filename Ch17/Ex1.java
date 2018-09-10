 import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        double price;
        int delivery;

        System.out.println("what is the item cost");
        price = scan.nextDouble();

        System.out.println("Do you want overnight delivery, 0==no, 1== yes");
        delivery = scan.nextInt();

        if (price > 10.0 && delivery == 0) {
            System.out.println("Your cost is "+ price);
        } else if (price < 10 && delivery == 0) {
            double total = price + 2.0;
            System.out.println(" Your price is " + total);
    } else if (delivery == 1) {
        double total = price + 3.0;
        System.out.println("Price is " + total);
    }

    }
}