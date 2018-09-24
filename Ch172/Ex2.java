import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int squareSum = 0;
        int cubeSum = 0;

        int count = 0;

        int N;

        System.out.println("What is the Upper limit");
        N = scan.nextInt();

        while ( count < N) {
            count = count +1;

            squareSum = squareSum + (count*count);
            cubeSum = cubeSum + (count*count*count);
        }

        System.out.println("Cube sum is:" + cubeSum);

        System.out.println("Square Sum is:" + squareSum);
    }
}