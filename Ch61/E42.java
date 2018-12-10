import java.io.*;

public class E42{
    public static void main (String[] args ){
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int temp[] = {0};
    for( int i = 0; i < data.length/2; i ++){
        temp[0] = data[i];
        data[i] = data[data.length-1-i];
        data[data.length-1-i] = temp[0];
        
    }
    for (int j=0; j<data.length;j++){
        System.out.println(data[j]);
    }
}
}