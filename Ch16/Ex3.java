import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args) {
        int tankcap;
        int gageread;
        int mpg;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your Tank Capacity:");
        tankcap = scan.nexInt();

        System.out.println("What does your gage read:");
        gageread = scan.nextInt();

        System.out.println("What is your Miles per Gallon:");
        mpg = scan.nextInt();

        if (((tankcap*mpg)*(gageread/100))<200) = true){
            
            System.out.println("Safe to Proceed");
        } else {
            
            System.out.println("Get Gas");
        }

    }
}