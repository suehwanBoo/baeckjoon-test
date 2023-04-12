package baekjoon_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_10828 {

        Node4 head;
        int count;
        public baekjoon_10828(){
            head = null;
            count = 0;
        }

        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int length = Integer.parseInt(br.readLine());
            baekjoon_10828 stack = new baekjoon_10828();
            StringBuilder sb = new StringBuilder();
            for(int i =0 ; i<length;i++){
                StringTokenizer str = new StringTokenizer(br.readLine());
                String test = str.nextToken();
                if(test.equals("push")){
                    stack.insert(Integer.parseInt(str.nextToken()));
                }
                else if (test.equals("pop")){
                    sb.append(stack.delete()+"\n");
                }
                else if(test.equals("size")){
                    sb.append(stack.size()+"\n");
                }
                else if(test.equals("empty")){
                    sb.append(stack.empty()+"\n");
                }
                else if(test.equals("top")){
                    sb.append(stack.get()+"\n");
                }
            }
            System.out.println(sb);
        }
        public void insert(int item){
            Node4 newNode = new Node4(item);
            newNode.next = head;
            head = newNode;
            count++;
        }
        public int delete(){
            if(count==0){
                return -1;
            }
            Node4 returnNode = head;
            head = head.next;
            count--;
            return returnNode.item;
        }
        public int size(){
            return count;
        }
        public int empty(){
            return count==0?1:0;
        }
        public int get(){
            if(count==0)return -1;
            return head.item;
        }


    }
    class Node4{
        Node4 next;
        int item;
        public Node4(int item){
            next = null;
            this.item = item;
        }
    }


