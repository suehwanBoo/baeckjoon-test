package baekjoon_git;
import java.util.Scanner;

public class baekjoon_2480 {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int[] dice = new int[3];
            int price = 0;
            for(int i =0;i<3;i++){
                dice[i]=sc.nextInt();
            }
            if((dice[0]==dice[1])&&(dice[1]==dice[2])) price = 10000+(dice[0]*1000);


            else if(dice[0]==dice[1])price =(1000+dice[0]*100);
            else if(dice[2]==dice[1])price = (1000+dice[1]*100);
            else if(dice[0]==dice[2])price = (1000+dice[0]*100);

            else {
                if(dice[0]>dice[1]&&dice[0]>dice[2]) price = dice[0]*100;
                else if(dice[1]>dice[0]&&dice[1]>dice[2])price = dice[1]*100;
                else price = dice[2]*100;


            }

            System.out.println(price);



    }

}
