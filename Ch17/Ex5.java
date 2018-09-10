import java.util.Scanner;

public class Ex5 {
    public static void main( String[] args) {
        Scanner bob = new Scanner(System.in);

        int lb;
        int total;
        int x = 0;

        System.out.println("How many pounds of trash?");
        lb = bob.nextInt();

        if(lb<200) {
            System.out.println(" 20$ for disposal of trash");
        } else if (lb > 200) {
            for(int i = 200; i<lb; i = i+100){
                x = x+1;
            }
            total = 20 + 8*x;
            System.out.println(" your price is " + total + "$");
        }
    }
}