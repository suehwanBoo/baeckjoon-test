package baekjoon_git;
import java.io.*;
public class baekjoon_1193 {



        public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            int a = 1; int b = 1;
            int max_a = 1; int max_b = 2;
            char compare_a = '-'; char compare_b = '+';
            int i = 1;

            while(true){
                if(n>i){
                    if(a==1 && compare_a == '-'){
                        compare_a = '+';
                        a = 1;
                        max_a +=2;
                    }
                    else if(max_a == a){
                        compare_a = '-';
                        a--;
                    }
                    else if(compare_a == '-') a--;
                    else if(compare_a == '+') a++;

                    if(b==1 && compare_b =='-'){
                        compare_b = '+';
                        b = 1;
                        max_b +=2;
                    }
                    else if (max_b == b){
                        compare_b = '-';
                        b--;
                    }
                    else if (compare_b == '-') b--;
                    else if (compare_b == '+') b++;
                    i++;
                }
                else break;
            }
            bw.write(a+"/"+b+"");
            bw.flush();

    }

}
