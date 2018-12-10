import java.util.Arrays;

public class E10
{
  public static boolean sameElts( int[] a, int[] b )
  {
    int [] a2 = a.clone();
    int [] b2 = b.clone();
    Arrays.sort(a2);
    Arrays.sort(b2); 
    
    if( Arrays.equals(a2, b2)){
          return true;
      } else{
          return false;
      }
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4, 2 };
    int[] arrayB = { 4, 2, 3, 2, 1 };

    if ( sameElts( arrayA, arrayB ) )
      System.out.println( "Same Elements" );
    else
      System.out.println( "DIFFERENT elements" );      
 
  }
}