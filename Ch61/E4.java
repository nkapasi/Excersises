import java.io.*;

public class E4{
    public static void main ( String[] args ){
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] reversedData = new int[data.length];

        for( int j = 0; j<data.length; j++){
            reversedData[j] = data[data.length - j-1];
        }

        for( int i = 0; i < data.length; i++){
            System.out.println(reversedData[i]);
        }
    }
}