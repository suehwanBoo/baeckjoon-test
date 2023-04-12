package baekjoon_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_6198 {

        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            Stack<Integer>stack1 = new Stack<>();
            long sum = 0;
            for(int i = 0 ;i<n;i++){
                int temp =Integer.parseInt(br.readLine());
                while(!stack1.isEmpty()&&stack1.peek()<=temp){
                    stack1.pop();
                }
                stack1.push(temp);
                sum +=stack1.size()-1;
            }
            System.out.print(sum);
        }
    }


