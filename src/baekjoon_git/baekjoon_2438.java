package baekjoon_git;
import java.io.*;

public class baekjoon_2438 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());

            br.close();

            for(int i =0; i<n; i++){
                for(int x = -1;x<i;x++){
                    bw.write("*");

                }bw.write("\n");
            }
            bw.flush();
            bw.close();
        }

    }


