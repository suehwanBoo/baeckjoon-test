package baekjoon_git;
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_433 {

        public static void main(String[] args)throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            float []per = new float[a];
            StringTokenizer str = null;

            for( int i = 0; i<a ; i++){
                str = new StringTokenizer(br.readLine());
                int b = Integer.parseInt(str.nextToken());
                float [] person = new float[b];
                float avr = 0;
                float count = 0;
                for( int x = 0; x< b ; x++){
                    person[x]=Integer.parseInt(str.nextToken());
                    avr +=person[x];
                }
                avr /=b;
                for( int x = 0; x< b ; x++){
                    if(person[x]>avr)count++;
                }
                per[i]=count/b*100;
                bw.write(String.format("%.3f",per[i])+"%\n");

            }
            br.close();
            bw.flush();
            bw.close();


    }
}
