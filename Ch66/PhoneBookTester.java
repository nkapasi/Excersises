import java.util.Scanner;

public class PhoneBookTester
{
  public static void main ( String[] args )
  {
    PhoneBook pb = new PhoneBook();  

    Scanner scan = new Scanner(System.in);
    // search for "Violet Smith"
    System.out.println("Name?");
    String name = scan.nextLine();
    PhoneEntry entry = pb.search( name ); 

    if ( entry != null )
      System.out.println( entry.getName() + ": " + entry.getPhone() );
    else
      System.out.println("Name not found" );

  }
}
