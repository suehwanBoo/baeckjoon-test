package baekjoon_git;
import java.util.Scanner;

public class baekjoon_2588 {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int []b1 = new int[4];

            b1[0] = a*(b%10);
            b1[1] = a*(b/10%10);
            b1[2] = a*(b/100);
            b1[3] = a*b;

            for(int i= 0; i<4;i++){
                System.out.println(b1[i]);
            }

        }
    }


