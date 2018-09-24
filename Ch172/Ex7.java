import java.util.Scanner;

public class Ex7 {
    public static void main( String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int N;
        int R;


        System.out.println("What is N");
        N = scan.nextInt();


        System.out.println("What is R");
        R = scan.nextInt();


        int count = N;
        int factorial = 1;
        int minusfactorial = N-R;

        
        while (count >0) {
            if (R<=N && R>=0){
                factorial = factorial * count;
                count = count - 1;
                minusfactorial = minusfactorial * (minusfactorial-1);
                minusfactorial=minusfactorial-1;
            } else {
                System.out.println("Value for R and N is unnacceptable");
            }
            
           
        }
        System.out.println(factorial/minusfactorial);
    }
}