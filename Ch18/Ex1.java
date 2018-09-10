import java.util.Scanner;

public class Ex1 {
    public static void main( String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int balance;
        boolean yay;

        System.out.println("What is the balance in the account");
        balance = scan.nextInt();

        System.out.println("Is the account checking? True, or False");
        yay = scan.nextBoolean();

        if(yay && balance>1000) {
            System.out.println("Your service charge is  15 cents per check");
        } else if(yay && balance<1000){
            System.out.println("Congrats, you have no service charge");
        } else if(balance>1500) {
            System.out.println("Your service charge is none");
        } else {
            System.out.println("Your service charge is 15 cents per check");
        }
    }
}