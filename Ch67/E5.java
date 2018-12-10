import java.io.* ;

public class ArrayMaxMin
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    // declare and initialize the max and the min
    
    
    //  
    for ( int row=0; row < data.length; row++)
    {
      int max = 0;
      for ( int col=0; col < data[i].length; col++) 
      {
         if (data[i][j]>max){
             max = data[i][j]
         }
      }
      System.out.println( "max = " + max );
    }
      
    // write out the results
    System.out.println( "max = " + max + "; min = " + min );

  }
}