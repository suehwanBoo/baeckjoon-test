package baekjoon_git;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class baekjoon_2493 {


        public static void main(String[] args)throws IOException {
            BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
            Stack<Integer>stack1 = new Stack<>();
            Stack<Integer>stack2 = new Stack<>();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer str= new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            int first = Integer.parseInt(str.nextToken());
            stack1.push(first);
            stack2.push(1);
            sb.append("0 ");
            for(int i = 2; i<=n;i++){
                int value = Integer.parseInt(str.nextToken());
                while(!stack1.empty()) {
                    if (stack1.peek() > value) {
                        sb.append(stack2.peek() + " ");
                        break;
                    }
                    stack1.pop();
                    stack2.pop();
                }
                if(stack1.isEmpty()){
                    sb.append("0 " );
                }
                stack1.push(value);
                stack2.push(i);
            }
            System.out.println(sb);

        }
    }


