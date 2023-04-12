package baekjoon_git;
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_10818 {

        public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();

            int num = Integer.parseInt(str);



            int max=0;
            int min=0;

            StringTokenizer sst = new StringTokenizer(br.readLine());

            br.close();

            for(int i =0; i<num;i++){
                int n = Integer.parseInt(sst.nextToken());

                if(i==0){max = n; min = n;}
                else {
                    if(n>max)max = n;
                    if(n<min)min = n;
                }

            }
            bw.write(min+" "+max);

            bw.flush();
            bw.close();

    }

}
