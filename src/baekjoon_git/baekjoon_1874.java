package baekjoon_git;
import java.io.*;
import java.util.Stack;

public class baekjoon_1874 {


        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb= new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            Stack<Integer>stack = new Stack<>();
            int value;
            int start = 0;
            while(n-->0){
                value = Integer.parseInt(br.readLine());
                if(value>start){
                    for(int i =start+1;i<=value;i++){
                        stack.push(i);
                        sb.append("+"+"\n");
                    }
                    start = value;
                }
                else if(stack.peek()!=value){
                    System.out.println("NO");
                    System.exit(0);
                }
                stack.pop();
                sb.append("-"+"\n");
            }
            System.out.println(sb);
    }

}
