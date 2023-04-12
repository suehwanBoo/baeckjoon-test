package baekjoon_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon_2164 {

        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Queue<Integer>queue = new LinkedList<Integer>();
            int n = Integer.parseInt(br.readLine());
            for(int i = 1; i<=n; i++){
                queue.offer(i);
            }
            for(int i = 0; i<n-1;i++){
                queue.poll();
                int a = queue.poll();
                queue.offer(a);
            }
            System.out.println(queue.peek());

    }

}
