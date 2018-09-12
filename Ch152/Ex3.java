import java.util.Scanner;

public class Ex3 {
    public static void main( String[] args) {
        Scanner scan = new Scanner(System.in);

        String fword;
        String sword;
        
        System.out.println("Enter first word");
        fword = scan.next();

        System.out.println("Enter Second word:");
        sword = scan.next();
        
        String foit = "";
        String slit = fword;

        while (foit.length()<30) {
             slit = slit + ".";
             foit = slit + sword;
        }
        System.out.println(foit);
    }
}