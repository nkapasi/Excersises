import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int triangle = 0;
        int tick = 1;

        System.out.println("What is N");
        int N = scan.nextInt();

        for(int count = 0; count<N; count++) {
            triangle = triangle + count;
            for (int square = 0; square < N; square++){
                tick = square*square;
                if(tick == triangle){
                    System.out.println(triangle);
                    break;
                }
            }
        }


    }
}