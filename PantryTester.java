import java.util.Scanner;


public class PantryTester
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner(System.in);
    
    
    int selection = 1;

    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );
    System.out.println( hubbard );


    while (selection != -1){
        System.out.println("Enter Your Selection (1,2 or 3)");
        selection = scan.nextInt();
        if (selection == -1){
            break;
        }
        System.out.println("Enter Amount to Spread in Ounces:");
        int oz = scan.nextInt();
        

        hubbard.select(selection);
        hubbard.spread(oz);
        System.out.println( hubbard );
    }
    
  }
}