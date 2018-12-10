import java.io.* ;

public class E3
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    int distance = Math.max(...data);
    int temporaryDistance = 0;
    int placeHolder = 0;
    
    // find the element nearest to zero
    for ( int i =0; i<data.length; i++ )
    {
        
        if (data[i] < 0){
            temporaryDistance = 0 - data[i];
            if (temporaryDistance < distance){
                distance = temporaryDistance;
                placeHolder = i;
            }
        } else if (data[i] > 0){
            temporaryDistance = data[i];
            if(temporaryDistance<distance){
                distance = temporaryDistance;
                placeHolder = i;
            }
        }
    }
      
    // write out the element nearest to zero
    System.out.println( data[placeHolder] );

  }
}