package baekjoon_git;
import java.io.*;

public class baekjoon_2675 {

        public static void main(String[] args)throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            for( int i =0 ;i<a;i++){
                String b = br.readLine();
                String []c = new String[2];
                c=b.split(" ");
                int limit = Integer.parseInt(c[0]);
                String [] d = new String[c[1].length()];
                d = c[1].split("");
                for(int y = 0; y<c[1].length();y++){
                    for(int x =0; x<limit;x++ ){
                        bw.write(d[y]);
                    }

                } bw.write("\n");
            }
            bw.flush();
        }

}
