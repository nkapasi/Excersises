public class E3{
    public static void main(String[] args){
        int [][] array = {{3, 2, 5}, 
                          {1, 4, 4, 8, 13},
                          {9, 1, 0, 2},
                          {0, 2, 6, 3, -1, -8} };
        
        int [] colSum;
        
        for (int i = 0; i < array.length; i++){   
            colSum =new int[array[i].length];
            for (int j = 0; j < array[i].length; j++){
                colSum[j] = colSum[j]+ array[i][0];
            }
            for(int k=0;k<colSum.length;k++){
                System.out.println("Print the sum of columns =" + colSum[k]);
            } 
        }  
    }
}