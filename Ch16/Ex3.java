import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args) {
        int tankcap;
        int gageread;
        int mpg;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your Tank Capacity:");
        tankcap = scan.nextInt();

        System.out.println("What does your gage read:");
        gageread = scan.nextInt();

        System.out.println("What is your Miles per Gallon:");
        mpg = scan.nextInt();

        if (((tankcap*gageread/100)*(mpg))<200){
            
            System.out.println("Get Gas");
        } else {
            
            System.out.println("Safe to Proceed");
        }

    }
}