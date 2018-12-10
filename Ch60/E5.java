public class E5
{
  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3}; 
    int[] temp = val.clone();
    int y = 0;
 
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // reverse the order of the numbers in the array
    for(int i = val.length-1; i>=0;i--){
        val[y] = temp[i];
        y++;
    }
 
    
 
    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}