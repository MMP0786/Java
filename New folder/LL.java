public class LL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }

    }
// Add First
    public void AddFirst(String data){
        Node newNode = new Node(data);

        if(head ==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head =newNode;
    }

    // Add Last
    public void AddLast(String data){
        Node newNode = new Node(data);

        Node currNode = head;
        if(head ==null){
            head = newNode;
            return;
        }
        while(currNode.next!= null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void print(){
        Node currNode = head;
        if(head ==null){
            System.out.println("Node is empty");
            return;
        }
        while(currNode!= null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        // System.out.println("Null");
    }

    public static void main(String args[]){
        LL list = new LL();
        list.AddFirst("Musharraf");
        list.AddLast("is a");
        list.AddLast("Good Boy");
        list.print();
    }
}