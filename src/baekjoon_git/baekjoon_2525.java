package baekjoon_git;
import java.util.Scanner;

public class baekjoon_2525 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int m = sc.nextInt();
            int order = sc.nextInt();

            int horder = order/60;
            int morder = order%60;

            h += horder;
            m += morder;

            if(m>=60){m-=60;h+=1;}
            if(h/24>=1)h=0+h%24;

            System.out.println(h+" "+m);
        }
    }


