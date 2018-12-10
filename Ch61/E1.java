import java.io.* ;

public class E1
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    int totalSum = 0;
    int evenSum = 0;
    int oddSum = 0;
    
    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
        totalSum = totalSum + data[index];
        
        if(data[index]%2 == 0){
            evenSum = evenSum + data[index];
        } else if(data[index]%2 == 1){
            oddSum = oddSum + data[index];
        }
    }
      
    // write out the three sums
    System.out.println("Odd Sum: " + oddSum + " Even Sum: " + evenSum + " Total Sum: " + totalSum );

  }
}