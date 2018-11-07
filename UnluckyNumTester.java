import java.util.Scanner;


public class UnluckyNumTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int entree = scan.nextInt();

        System.out.println(UnluckyNum.unluckyNumber(entree));
    }
}