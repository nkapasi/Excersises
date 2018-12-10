import java.util.Arrays;


public class E9
{
  public static boolean myEquals( int[] a, int[] b )
  {
      for( int i = 0; i < a.length; i++){
          if (a[i] == b[i]){
          } else{
              return false;
          }
      }
      return true;
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 5 };
    int[] arrayB = { 1, 2, 3, 4 };

    System.out.print("Arrays says: ")    ;
    if ( Arrays.equals( arrayA, arrayB ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      

    System.out.print("myEquals says: ")    ;
    if ( Arrays.equals( arrayA, arrayB ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      
  }
}