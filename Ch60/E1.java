import java.util.stream.*;

public class E1{
    public static void main (String[] args){
        int [] val = {0,1,2,3};

        int sum = IntStream.of(val).sum();

        System.out.println("Sum of all numbers = " + sum);
    }
}