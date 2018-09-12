import java.util.Scanner;

public class Ex2 {
    public static void main( String[] args) {
        int count = 2;
        Scanner scan = new Scanner(System.in);
    
        double sum = 1.0/1;
        int sumn;
    
        System.out.println("Enter N");
        sumn = scan.nextInt();
       
        while((count-1)<sumn) {
            sum = sum + 1.0/count;
            count = count+1;

        }

        System.out.println("Sum is :" +sum);
    }

}