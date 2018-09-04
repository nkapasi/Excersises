import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
    double discountprice;
    int purchase;

    Scanner scan = new Scanner(System.in);

    System.out.println("What is the purchase price:");
    purchase = scan.nextInt();

    if(purchase > 10) {
        discountprice = purchase - (purchase*.10);
        System.out.println("Your price is " + discountprice);
    }else {
        System.out.println("Sorry there is no discount");
    }
    }
}