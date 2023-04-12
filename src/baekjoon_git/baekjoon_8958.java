package baekjoon_git;
import java.io.*;
public class baekjoon_8958 {

        public static void main(String[] args)throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            String []save = new String[a];
            int [] total = new int[a];
            int [] score = new int[a];

            for(int i = 0; i<a;i++){
                save[i]= br.readLine();
                String [] test = save[i].split("");
                for(int x = 0; x<save[i].length();x++){

                    if(x!=0&&test[x-1].equals("O")&&test[x].equals("O")){
                        score[i]++;
                        total[i]+=score[i];

                    }
                    else if(test[x].equals("O")){
                        score[i]++;
                        total[i]+=score[i];
                    }
                    else if(test[x].equals("X")){
                        score[i]=0;}
                }
                bw.write(total[i]+"\n");
            }
            br.close();
            bw.flush();
            bw.close();
        }
    }

