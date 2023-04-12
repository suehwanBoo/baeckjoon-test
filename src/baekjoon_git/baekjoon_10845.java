package baekjoon_git;
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_10845 {

        DoubleLinkedList list;

        public baekjoon_10845(){
            list = new DoubleLinkedList();
        }
        public void push(int X){
            list.insertAt(X,0);
        }
        public int pop(){
            return list.deleteLast();
        }
        public int size(){
            return list.size();
        }
        public int empty(){
            return list.isEmpty();
        }
        public int front(){
            return list.getLast();
        }
        public int back(){
            return list.get();
        }

        public static void main(String[] args)throws IOException {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(input.readLine());
            baekjoon_10845 queue = new baekjoon_10845();
            for(int i = 0; i<n;i++){
                String save = input.readLine();
                String []sv = save.split(" ");
                if (save.equals("pop")){
                    System.out.println(queue.pop());
                }
                else if(save.equals("size")){

                    System.out.println( queue.size());
                }
                else if (save.equals("empty")){

                    System.out.println(queue.empty());
                }
                else if (save.equals("front")){
                    System.out.println(queue.front());
                }
                else if (save.equals("back")){
                    System.out.println(queue.back());
                }
                else if(sv[0].equals("push")){
                    int f = Integer.parseInt(sv[1]);
                    queue.push(f);
                }

            }
        }

    }
    class DoubleLinkedList {
        Node head;
        Node tail;
        int count;
        public DoubleLinkedList(){
            head = null;
            tail = null;
            count = 0;
        }
        public void insertAt(int item, int index){
            if(index<0||index>count){
                Error error = new Error("잘못된 접근입니다.");
            }
            Node newNode = new Node(item);
            if(index==0){
                if(head!=null){
                    head.prev = newNode;
                    newNode.next = head;
                }
                head = newNode;
                count++;
            }
            else if(index == count){
                newNode.next = null;
                tail.next = newNode;
                newNode.prev = tail;
                count++;
            }
            else{
                Node currentNode = head;
                for(int i = 0 ;i<index-1;i++){
                    currentNode = currentNode.next;
                }
                currentNode.next.prev = newNode;
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                newNode.prev = currentNode;
                count++;
            }
            if(newNode.next ==null){
                tail = newNode;
            }
        }
        public int deleteAt(int index){
            if(index<0||index>=count){
                return -1;
            }
            if(index==0){
                Node returnNode = head;
                if(this.head.next==null){
                    this.head=null;
                    this.tail=null;
                }
                else{
                    head = head.next;}
                count--;
                return returnNode.item;
            }
            else if (index == count-1){
                Node returnNode = tail;
                tail = tail.prev;
                tail.next = null;
                count--;
                return returnNode.item;
            }
            else{
                Node currentNode = head;
                for(int i = 0; i<index-1;i++){
                    currentNode = currentNode.next;
                }
                Node returnNode = currentNode.next;
                currentNode.next = currentNode.next.next;
                currentNode.next.prev = currentNode;
                count--;
                return returnNode.item;
            }
        }
        public int deleteLast(){
            return this.deleteAt(count-1);
        }
        public int get(){
            if(count ==0)return -1;
            return head.item;
        }
        public int getLast(){
            if(count==0)return -1;
            return tail.item;
        }
        public int isEmpty(){
            return count==0?1:0;
        }
        public int size(){
            return count;
        }

    }
    class Node{
        Node next;
        Node prev;
        int item;
        public Node(int item){
            next = null;
            prev = null;
            this.item = item;
        }
    }


