package baekjoon_git;
import java.util.Scanner;
public class baekjoon_1065 {



        public static void main(String[] args) {
            baekjoon_1065 test = new baekjoon_1065();
            Scanner sc = new Scanner(System.in);
            int a= sc.nextInt();
            System.out.println(test.hansu(a));

        }
        public int hansu(int max){
            if(max<100) return max;
            else {
                int count = 0;
                for(int i =100; i<=max;i++){
                    if(((i/100)-(i%100/10))==((i%100/10)-i%10)) {
                        count ++;
                    }
                }
                return count+99;


        }
    }

}
