package baekjoon_git;
import java.io.*;

public class baekjoon_2292 {


        public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int a = 1;
            int x = 1;
            while(true) {
                if (n > a) {
                    a += 6 * x;
                    x++;
                }
                else break;
            }

            bw.write(x+"");
            bw.flush();


    }

}
