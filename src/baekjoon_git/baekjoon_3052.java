package baekjoon_git;
import java.util.Scanner;

public class baekjoon_3052 {

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int []save = new int[10];
            int count = 10;

            for(int i = 0; i<10;i++){
                save[i]=sc.nextInt()%42;
            }
            for(int i =0;i<10;i++){
                for( int x = i+1;x<10;x++){
                    if(save[i]==save[x]){count --; break;}
                }
            }
            System.out.println(count);
        }
    }

