package baekjoon_git;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_2908 {


        public static void main(String[] args)throws IOException {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
            String a = bfr.readLine();
            String[] sanguen = a.split(" ");
            int[] sangsu = new int[2];
            int [] save = new int [3];
            for(int i =0; i<3;i++) {
                save[i]=Integer.parseInt(sanguen[0].split("")[i]);

            }
            sangsu[0] = save[2]*100+save[1]*10+save[0];
            for(int i =0; i<3;i++) {
                save[i]=Integer.parseInt(sanguen[1].split("")[i]);

            }
            sangsu[1] = save[2]*100+save[1]*10+save[0];
            if(sangsu[0]>sangsu[1])bfw.write(sangsu[0]+"");
            else bfw.write(sangsu[1]+"");

            bfw.flush();
            bfw.close();



        }

    }


