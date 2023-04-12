package baekjoon_git;
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_1712 {


        public static void main(String[] args)throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer str=  new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            int c = Integer.parseInt(str.nextToken());

            br.close();

            if(b>=c) bw.write(-1+"");
            else bw.write((-a / (b - c)+1)+ "");

            bw.flush();
            bw.close();
    }

}
