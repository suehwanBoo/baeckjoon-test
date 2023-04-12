package baekjoon_git;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
public class baekjoon_1316 {



        public static void main(String[] args) throws IOException {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
            int a = Integer.parseInt(bfr.readLine());
            String[] save = new String[a];
            int[] count = new int[a];
            for (int i = 0; i < a; i++) {
                save[i] = bfr.readLine();
                String[] compare = save[i].split("");
                for (int x = 0; x < compare.length - 1; x++) {
                    if (!compare[x].equals(compare[x + 1])) {
                        for (int y = x + 1; y < compare.length; y++) {
                            if (compare[x].equals(compare[y]))
                                count[i] += 1;
                        }
                    }
                }
            }
            int show = 0;
            for( int i = 0; i<a;i++) {
                if(count[i]==0)show +=1;

            }
            bfw.write(show+"");
            bfw.flush();
            bfw.close();




    }

}
