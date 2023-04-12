package baekjoon_git;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class baekjoon_1152 {




        public static void main(String[] args) throws IOException {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

            String question = bfr.readLine();
            String[] count = question.split(" ");
            int show = 0;
            for(int i= 0; i<count.length;i++) {
                if(count[i]!="")show++;
            }
            bfw.write(show+"");
            bfw.flush();
            bfw.close();



    }

}
