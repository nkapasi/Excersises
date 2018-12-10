import java.util.Scanner;

public class E5 {
    public static void main ( String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input a Sentence");
        String Panagram = scan.nextLine();

        Character[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int[] length = new int[26];

        for( int i = 0; i < Panagram.length(); i++){
            for( int j = 0; j<letters.length; j++){
                if (letters[j] == Panagram.charAt(i)){
                    length[j] = 1;
                }
            }
        }
        boolean check = false;

        for( int k = 0; k<letters.length;k++){
            if (length[k] == 1){
                check = true;
            } else if(length[k] != 1){
                check = false;
                break;
            }
        }

        System.out.println(check);
    }
}