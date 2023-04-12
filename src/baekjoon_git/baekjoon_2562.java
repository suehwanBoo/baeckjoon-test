package baekjoon_git;
import java.util.Scanner;

public class baekjoon_2562 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] save = new int [9];
            int max=0;
            int line =0;

            for(int i = 0; i<9;i++){
                save[i]=sc.nextInt();

                if(i==0){max=save[i];
                    line = i+1;}
                else{
                    if(save[i]>max){
                        max=save[i];
                        line = i+1;
                    }
                }
            }
            System.out.println(max+"\n"+line);
        }
    }


