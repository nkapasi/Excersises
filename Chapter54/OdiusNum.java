public class OdiusNum{
    public static boolean binary(int number){
        int checker = number/2;
        int oneCount = 0;
        int i = 5;
        while  (i > 0) {
            
            int dividednumber = number/2;

            if ( checker == 1){
                oneCount = oneCount + 1;
            }

            if(dividednumber == 0){
                break;
            }

            checker = dividednumber%2;
        }

        if (OdiusNum.oddEven(oneCount)){
            return true;
        }else {
            return false;
        }
    }

    private static boolean oddEven(int number){
        if (number%2 == 0){
            return true;
        } else{
            return false;
        }
    }
}