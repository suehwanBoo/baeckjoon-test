package baekjoon_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon_18258 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Queue<Integer>queue = new LinkedList<Integer>();
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            int recent = 0;
            for(int i = 0 ;i<n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String show = st.nextToken();
                if(show.equals("push")){
                    recent = Integer.parseInt(st.nextToken());
                    queue.add(recent);
                }
                else if(show.equals("pop")){
                    sb.append(queue.isEmpty()?-1:queue.poll());
                    sb.append("\n");
                }
                else if(show.equals("size")){
                    sb.append(queue.size());
                    sb.append("\n");
                }
                else if(show.equals("empty")){
                    sb.append(queue.isEmpty()?1:0);
                    sb.append("\n");
                }
                else if(show.equals("front")){
                    sb.append(queue.isEmpty()?-1:queue.peek());
                    sb.append("\n");
                }
                else if(show.equals("back")){
                    sb.append(queue.isEmpty()?-1:recent);
                    sb.append("\n");
                }
            }
            System.out.println(sb.toString());
        }
    }


