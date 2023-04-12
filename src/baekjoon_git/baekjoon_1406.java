package baekjoon_git;
import java.io.*;
import java.util.Stack;
public class baekjoon_1406 {



        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            Stack<Character>stack_1 = new Stack<>();
            Stack<Character>stack_2 = new Stack<>();

            String str = br.readLine();

            for(int i = 0 ;i<str.length();i++){
                stack_1.push(str.charAt(i));
            }

            int n =Integer.parseInt(br.readLine());

            for(int i = 0 ;i<n;i++){
                str = br.readLine();
                switch (str.charAt(0)) {
                    case 'L':
                        if (stack_1.empty()) break;
                        stack_2.push(stack_1.pop());
                        break;

                    case 'D':
                        if (stack_2.empty()) break;
                        stack_1.push(stack_2.pop());
                        break;

                    case 'B':
                        if (stack_1.empty()) break;
                        stack_1.pop();
                        break;

                    case 'P':
                        stack_1.push(str.charAt(2));
                        break;
                }
            }
            while(!stack_1.empty()){
                stack_2.push(stack_1.pop());
            }
            while(!stack_2.empty()){
                bw.write(stack_2.pop());
            }
            bw.flush();
        }


}
