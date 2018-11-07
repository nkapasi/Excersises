import java.util.Scanner;

public class PasswordCheck {
    public static void main( String[] args) {
        Scanner scan = new Scanner(System.in);


        char ch;
        boolean lowerCaseFlag = false;
        boolean upperCaseFlag = false;
        boolean numberFlag = false;
        boolean passwordFlag = false;

        while (!passwordFlag) {
            System.out.println("Enter Password:");
            String password = scan.nextLine();

            for(int i = 0; i < password.length(); i++){
                ch = password.charAt(i);

                if(Character.isDigit(ch)){
                    numberFlag = true;
                }else if (Character.isUpperCase(ch)){
                    upperCaseFlag = true;
                } else if (Character.isLowerCase(ch)){
                    lowerCaseFlag = true;
                }
                if (upperCaseFlag && lowerCaseFlag && numberFlag && password.length()>=7){
                    passwordFlag = true;
                    System.out.println("Acceptable");
                    break;
                }
            }

        }
    }
}