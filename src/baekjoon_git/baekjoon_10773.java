package baekjoon_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class baekjoon_10773 {

        Node3 head;
        int count;
        public baekjoon_10773() {
            head = null;
            count = 0;
        }

        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int length = Integer.parseInt(br.readLine());
                baekjoon_10773 stack = new baekjoon_10773();
            int sum = 0;
            for(int i =0 ; i<length;i++){
                int n = Integer.parseInt(br.readLine());
                if(n==0)stack.delete();
                else stack.insert(n);
            }
            while(stack.empty()==0){
                sum+=stack.delete();
            }
            System.out.println(sum);
        }


        public void insert(int item){
            Node3 newNode = new Node3(item);
            newNode.next = head;
            head = newNode;
            count++;
        }
        public int delete(){
            if(count==0){
                return -1;
            }
            Node3 returnNode = head;
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
    class Node3{
        Node3 next;
        int item;
        public Node3(int item){
            next = null;
            this.item = item;
        }
    }


