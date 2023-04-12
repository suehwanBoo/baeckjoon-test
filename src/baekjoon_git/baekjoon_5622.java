package baekjoon_git;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class baekjoon_5622 {


        public static void main(String[] args) throws IOException {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
            String[] num = new String[8];
            num[0] = "ABC";
            num[1] = "DEF";
            num[2] = "GHI";
            num[3] = "JKL";
            num[4] = "MNO";
            num[5] = "PQRS";
            num[6] = "TUV";
            num[7] = "WXYZ";
            String a = bfr.readLine();
            String[] save = a.split("");
            int[] remem = new int[save.length];
            for(int i = 0; i<a.length();i++) {
                for(int x = 0;x<8;x++) {
                    String [] compare = num[x].split("");
                    if(save[i].equals(compare[0])) remem[i]=x+3;

                    else if(save[i].equals(compare[1]))remem[i]=x+3;
                    else if(save[i].equals(compare[2]))remem[i]=x+3;
                    if(x==5||x==7) {if(save[i].equals(compare[3]))remem[i]=x+3;}
                }
            }
            int show = 0;
            for(int i =0; i<a.length();i++) {
                show+=remem[i];
            }
            bfw.write(show+"");
            bfw.flush();
            bfw.close();

        }
    }


