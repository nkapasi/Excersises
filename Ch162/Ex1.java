import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int numnum;


        
        System.out.println("How many Integers will be added:");
        numnum = scan.nextInt();
        double count = 0;
        double total = 0;
        
        while (count < numnum){
            System.out.println("Enter an integer");
            total = total + scan.nextInt();
            count = count + 1; 
        }
        System.out.println("The sum is " + total);
    }
}