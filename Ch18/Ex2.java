import java.util.Scanner;

public class Ex2 {
    public static void main( String [] args) {
        Scanner scan = new Scanner(System.in);
        
        int fr;
        int fl;
        int br;
        int bl;

        System.out.println("Input Right front:");
        fr = scan.nextInt();

        System.out.println("Input Front Left:");
        fl = scan.nextInt();

        System.out.println("Input Back Right");
        br = scan.nextInt();

        System.out.println("Input Back Left:");
        bl = scan.nextInt();

        if(bl == br && fr == fl) {
            System.out.println("YOU ARE GOLDEN");
        } else {
            System.out.println("NOOOOOOOOOOO");
        }
    }
}