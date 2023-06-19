// public class NewLL {
//     Node head;
//     private int size;

//     NewLL (){
//         size =0;
//     }
//     class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data= data;
//             this.next = null;
//         }
//     }

//     // add first
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head =newNode;
//     }

//     // AddLast
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         Node currNode = head;
//         while(currNode.next!=null){
//             currNode = currNode.next;
//         }
//         currNode.next =newNode;
//     }

//     // printNewLL

//     public void printNewLL(){
//         Node currNode = head;
//         while(currNode!=null){
//             System.out.print(currNode.data +" ");
//             currNode= currNode.next;
//         }
//     }

//     // removeFirst

//     public void removeFirst(){
//         if(head ==null){
//             System.out.println("Node is already empty");
//             return;
//         }

//         head= head.next;

//     }

//     // removeLast

//     public void removeLast(){
//         if(head==null || head.next ==null){
//             return;
//         }
//         if(head ==null || head.next ==null){
//             head = null;
//             return;
//         }
//         Node curNode = head;
//         Node lastNode = head.next;

//         while(lastNode.next !=null){
//             lastNode = lastNode.next;
//             curNode = curNode.next;
//         }
//         curNode.next = null;
//     }

//     // reverseLL

//     public void reverseLL(){
//         Node prev =head;
//         Node curr = head.next;
//         while(curr!=null){
//             Node nextNode = curr.next;
//             curr.next =prev;

//             // update
//             prev = curr;
//             curr = nextNode;
        
//         }
//         head.next = null;
//         head = prev;
//     }

//     public Node middleOfNode(Node head){
//         Node here =head;
//         Node turtle =head;

//         while(here.next!=null && here.next.next!=null){
//             here = here.next.next;
//             turtle = turtle.next;
//         }
//         return turtle;
//     }
//     public Node reverse(Node head){
//         Node pre = null;
//         Node curr= head;
//         while(curr!=null){
//             Node nextNode = curr.next;
//             curr.next = pre;

//             // update
//             pre = curr;
//             curr = nextNode;
//         }
//         return pre;
//     }
//     public void nthDelete(int n){
//         Node currNode =head;
//         while(currNode!=null){
//             currNode = currNode.next;
//             size++;
//         }
//         int indexTolast = size -n;
//         Node curr =head;
//         int i=1;
//         while(i<indexTolast){
//             curr = curr.next;
//             i++;
//         }
//         curr.next = curr.next.next;
//         printNewLL();
//     }

//     public boolean isPaliandrom(){
//         if(head.next==null || head==null){
//             return true;
//         }

//         Node middle = middleOfNode(head);
//         Node secondHalf = reverse(middle.next);

//         Node firstHalf =head;
//         while(secondHalf!=null){
//             if(firstHalf.data !=secondHalf.data){
//                 return false;
//             }
//             firstHalf = firstHalf.next;
//             secondHalf = secondHalf.next;
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         NewLL list = new NewLL();
//         list.addFirst("Musharraf");
//         list.addFirst("is");
//         list.addLast("is");
//         // list.addLast("Good");
//         // list.addLast("boy");
//         // list.removeFirst();
//         // list.removeLast();
//         // list.removeLast();
//         // list.reverseLL();
//         // list.printNewLL();
//         // list.nthDelete(2);
//         System.out.println(list.isPaliandrom());
//         // ans.printNewLL();
        
//     }
// }
