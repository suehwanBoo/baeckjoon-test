package baekjoon_git;
import java.util.Scanner;

public class baekjoon_2884 {

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int h = sc.nextInt();
            int m = sc.nextInt();

            if(h==0&&m<45){h=23; m=60+(m-45);}
            else if(m<45){h-=1; m=60+(m-45);}
            else m-=45;
            System.out.println(h+" "+m);
        }

}
