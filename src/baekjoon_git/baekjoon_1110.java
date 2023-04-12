package baekjoon_git;
import java.io.*;
public class baekjoon_1110 {

        public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            int save = Integer.parseInt(str);
            if(save<10)save*=10;
            int a =save/10;
            int b = save%10;
            int c = 0;
            int count = 0;

            while(true){
                count ++;
                c=a+b;
                a=b;
                b=c%10;
                if(save==(a*10+b))break;
            }
            br.close();

            bw.write(count+"");

            bw.flush();
            bw.close();

    }
}
