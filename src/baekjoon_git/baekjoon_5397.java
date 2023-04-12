package baekjoon_git;
import java.io.*;
import java.util.Stack;
public class baekjoon_5397 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            Stack<Character>stack_1 = new Stack<>();
            Stack<Character>stack_2 = new Stack<>();

            for(int i = 0 ;i<n;i++){
                String str = br.readLine();
                for(int a = 0;a<str.length();a++) {
                    if(str.charAt(a)=='<'){
                        if(stack_1.empty())continue;
                        stack_2.push(stack_1.pop());
                    }
                    else if(str.charAt(a)=='>'){
                        if(stack_2.empty())continue;
                        stack_1.push(stack_2.pop());
                    }
                    else if(str.charAt(a)=='-'){
                        if(stack_1.empty())continue;
                        stack_1.pop();
                    }
                    else{
                        stack_1.push(str.charAt(a));
                    }
                }
                while(!stack_1.empty()){
                    stack_2.push(stack_1.pop());}
                while(!stack_2.empty()){
                    bw.write(stack_2.pop());
                }
                bw.write("\n");

            }
            bw.flush();
        }
    }


