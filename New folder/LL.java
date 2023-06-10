import java.io.ObjectInputStream.GetField;

class LL{
    Node head;
    private int size;

    LL(){
        size =0;
    }
    public class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add First

    public void addFirst(String data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Last Node
    public void addLast(String data){
        Node newNode = new Node(data);
        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // print LL
    public void printLL(){
        Node lastNode = head;
        while(lastNode!=null){
            System.out.print(lastNode.data + " => ");
            lastNode = lastNode.next;
        }
        System.out.print("Null");
    }

//  remove reomoveLast
    public void reomoveLast(){
        Node secondLast = head;
        size--;
        if(head.next ==null){
            head =null;
            return;
        }
        Node  lastNode= head.next;

        while(lastNode.next!=null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }
    
    public int getSize(){
        return size;
    }


    public void reverseLL(){
        Node prevNode = head;
        Node currNode = prevNode .next;
        while(currNode!=null){
            // currNode= currNode.next;
            Node nextNode = currNode.next;

            // update
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;


        }
        head.next = null;
        head = prevNode;
    }
    public static void main(String args []){
     LL list  = new LL();
     list.addFirst("is");
     list.addFirst("This");
     list.addLast("a ");
     list.addLast("Text learning");
     
     list.printLL();
     System.out.println();
    //   list.reomoveLast();
     System.out.println(list.getSize());
     list.reverseLL();
     list.printLL();
    }

}