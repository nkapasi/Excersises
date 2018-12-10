public class E1
{
  private int[] data;
  
  // Constructor
  public void Weight(int[] init)
  {
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j=0; j<init.length; j++)
    {
      data[j] = init[j];
    }
  }
  
  //Print
  public String toString()
  {
      return data.toString();
  }


  public int average(int[] data){
      int sum = 0;
      for(int i = 0; i<data.length; i++){
          sum = data[i] + sum;
      }
      return (sum/data.length);
  }

  public int subAverage(int start, int end){
      int sum = 0;
      for(int i = start; i < end; i ++){
          sum = sum + data[i];
      }
      return(sum/(end-start));
  }
}

