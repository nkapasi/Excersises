import java.util.Scanner;

public class Ex2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the number of guests?");
        int n = scan.nextInt();

        double storage = 1;

        for(int count = 0; count<n; count++){
            
            double probability = ((365.0 - count)/365.0);
            
            storage = storage * probability;
        }

        System.out.println(storage);
    }
}