package baekjoon_git;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class baekjoon_1157 {



        public static void main(String[] args) throws IOException {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
            String a = bfr.readLine();
            int []arr = new int [26];
            char []b = new char[a.length()];
            for (int i = 0; i <a.length(); i++) {
                b[i] = a.charAt(i);
                if (b[i] > 96) {
                    b[i] = (char) ((int) b[i] - 32);
                }
                arr[b[i]-65]++;
            }
            int max = -1;
            char show = '?';
            for( int i=0; i<26; i++) {
                if(arr[i]>max) {max=arr[i];
                    show = (char)(i+65);}
                else if (arr[i]==max) {show ='?';}
            }
            bfw.write(show);
            bfw.flush();
            bfw.close();



    }

}
