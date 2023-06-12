public class stackClass {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            next =null;
        }
    }

    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head =newNode;
            }
            
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
    
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;
        }
    }
    public static void main(String args[]){
     Stack s1 =new Stack();
     s1.push(1);
     s1.push(2);
     s1.push(5);
     s1.push(4);

     System.out.println(s1);
     int i =0;
     while(i<5){
        System.out.println(s1.peek());
        s1.pop();
        i++;
     }
    }
}
