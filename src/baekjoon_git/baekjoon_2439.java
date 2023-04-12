package baekjoon_git;
import java.io.*;

public class baekjoon_2439 {

        public static void main(String[] args)throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int a =n;
            br.close();

            for(int i = 0; i<n;i++){
                a--;
                for(int x =0 ;x<a;x++){
                    bw.write(" ");
                }
                for(int c = -1; c<i;c++){
                    bw.write("*");
                }
                bw.write("\n");
            }
            bw.flush();
            bw.close();
        }



}
