package baekjoon_git;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_10809 {


        public static void main(String[] args)throws IOException {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
            String S = bfr.readLine();
            String [] Save = S.split("");
            int [] show = new int [26];

            for( int i = 0 ; i<26;i++) {
                show[i]=-1;
                for(int x = 0; x<S.length();x++) {
                    char b =(char)( 97 + i);
                    if(Save[x].equals(b+"")) {
                        show[i]=x; break;
                    }

                }
                bfw.write(show[i]+" ");
            }

            bfw.flush();
            bfw.close();


        }



}
