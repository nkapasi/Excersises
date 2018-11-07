public class UnluckyNum {
    
    public static boolean unluckyNumber(int number){
        boolean shit = true;
        String str = Integer.toString(number);
        for (int i=0; (i+2)<str.length(); i++){
            if (str.substring(i, i+2).equals("13")){
                shit = false;
            } else {
                shit = true;
            }
        }

        return shit;
    }
}