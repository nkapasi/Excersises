import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){

        int stars;
        int count;

        Scanner scan = new Scanner(System.in);

        System.out.println("Initial Number of stars");
        stars = scan.nextInt();
        count = stars;

        int ticker = stars;

        while( count <= stars && count >0) {
            while( ticker >0){
                System.out.print("*");
                ticker = ticker - 1;
            }
            count = count -1;
            System.out.println("");
            stars = stars-1;
            ticker = stars;
        }
    }
}