package baekjoon_git;
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_1546 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int a = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            br.close();

            double [] save = new double[a];
            double max = 0;
            double count = 0;

            for(int i = 0; i<a; i++){
                save[i] = Integer.parseInt(st.nextToken());
                if(i==0)max = save[i];
                if(max<save[i])max=save[i];
            }
            for( int i =0; i<a; i++){
                count += save[i]/max*100;
            }
            double show =  count/a;

            bw.write(show+"");
            bw.flush();
            bw.close();



    }

}
