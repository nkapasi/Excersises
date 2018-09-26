public class Ex1 {
    public static void main (String[] args) {
        
        double t = 1.0;

        for(int count = 0; count<25; count++) {
            double N;
            N = (220/(1+10*(Math.pow(.83,t))));
            t = t+1;
            System.out.println(N);
        }
    }
}