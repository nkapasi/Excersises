import java.util.Scanner;

import java.util.Random;

import java.lang.Math; 







class E5 {



    public static void main(String[] args) {

        

        Random rand = new Random(); 
        int changeNegative = 0;
        int change = 0;

        int[] fireFly1 = {1,2,3 };
        int[] fireFly2 = {5,7,8 };
        int[] fireFly3 = {6,9,3};
        int[] fireFly4 = {2,5,9};
        int[] fireFly5 = {10,12,11};





        for(int i = 0; i > -1; i++){
            for(int a = 0; a < fireFly1.length; a++){
                changeNegative = rand.nextInt(2);
                
                if(changeNegative == 0){
                    change = rand.nextInt(10 - fireFly1[a]);

                    fireFly1[a] = fireFly1[a] + change;
                }

                if(changeNegative == 1){
                    change = rand.nextInt(10 - fireFly1[a]) * -1;
                    fireFly1[a] = fireFly1[a] + change;
                }
                System.out.println(fireFly1[a]);
            }

            for(int a = 0; a < fireFly2.length; a++){

                changeNegative = rand.nextInt(2);

                

                if(changeNegative == 0){
                    change = rand.nextInt(10 - fireFly2[a]);
                    fireFly2[a] = fireFly2[a] + change;
                }

                if(changeNegative == 1){
                    change = rand.nextInt(10 - fireFly2[a]) * -1;
                    fireFly2[a] = fireFly2[a] + change;
                }

                System.out.println(fireFly2[a]);

            }
            if(Math.sqrt((fireFly1[0] - fireFly2[0]) * (fireFly1[0] - fireFly2[0]) + (fireFly1[1] - fireFly2[1]) * (fireFly1[1] - fireFly2[1]) + (fireFly1[2] - fireFly2[2]) * (fireFly1[2] - fireFly2[2])) <= 1){
                System.out.println("Dead!");
                break;



            }





        }

















    }















}