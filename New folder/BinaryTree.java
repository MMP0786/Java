import java.util.*;

public class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class BinaryT{
        static int idx =-1;
        public static Node buildTree(int node[]){
            idx++;
            if(node[idx]== -1){
                return null;
            }

            Node newNode = new Node(node[idx]);
        
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }

    //     public static void preOrder(Node root){
    //         if(root == null){
    //             return;
    //         }
    //         System.out.print(root.data+" ");
    //         preOrder(root.left);
    //         preOrder(root.right);
    //     }

        
    //     public static void inOrder(Node root){
    //         if(root == null){
    //             return;
    //         }
    //         inOrder(root.left);
    //         System.out.print(root.data+" ");
    //         inOrder(root.right);
    //     }


    //     public static void postOrder(Node root){
    //         if(root == null){
    //             return;
    //         }
    //         postOrder(root.left) ;
    //         postOrder(root.right);
    //         System.out.print(root.data+" ");
    //     }
    // }

    // public static void levelOfOrder(Node root){
    //     if(root == null){
    //         return;
   //     }
    //     Queue<Node> q = new LinkedList<>();{
    //     q.add(root);
    //     q.add(null);

    //     while(!q.isEmpty()){
    //         Node currNode = q.remove();
    //         if(currNode==null){
    //             System.out.println();
    //             if(q.isEmpty()){
    //                 break;
    //             }else{
    //                 q.add(null);
    //             }
    //         }else{
    //             System.out.print(currNode.data+" ");
    //             if(currNode.left !=null){
    //                 q.add(currNode.left);
    //             }
    //             if(currNode.right !=null){
    //                 q.add(currNode.right);
    //             }
                
    //         }
    //     }
    // }
    // }
    // public static int countOfNodes(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int countLeft = countOfNodes(root.left);
    //     int countRight = countOfNodes(root.right);

    //     return countLeft +countRight +1;
    // }
    // public static int sumOfNodes(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int sumLeft = sumOfNodes(root.left);
    //     int sumRight = sumOfNodes(root.right);

    //     return sumLeft +sumRight + root.data;
    // }
    // public static int heightOfNodes(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int heightLeft = heightOfNodes(root.left);
    //     int heightRight = heightOfNodes(root.right);

    //     return Math.max(heightLeft, heightRight) + 1;


}
 
public static int diameter(Node root){
    if(root == null){
        return 0;
    }
    int diam1 = diameter(root.left);
    int diam2 = diameter(root.right);
    int diam3 = diameter(root.left)+diameter(root.right) +1;

    return Math.max(diam3, Math.max(diam1, diam2));

}
static class TreeInfo{
    int ht;
    int diam;

    TreeInfo(int ht, int diam){
        this.ht =ht;
        this.diam = diam;
    }
}
public static TreeInfo diameter2(Node root){
    if(root ==null){
        return new TreeInfo(0, 0);
    }
    
    TreeInfo left = diameter2(root.left);
    TreeInfo right = diameter2(root.right);

    int myHeight = Math.max(left.ht, right.ht)+1;

    int diam1 = left.diam;
    int diam2 = right.diam;
    int diam3 = left.ht + right.ht +1;

    int mydiam = Math.max(Math.max(diam1, diam2), diam3);

    TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
    return myInfo;
}

    public static void main(String args[]){
        int nodes[]= {1, 2, 4, -1,-1, 5, -1, -1, 3, -1, 6,-1,-1};
        BinaryT tree = new BinaryT();

        Node root = tree.buildTree(nodes);
        // tree.preOrder( root);
        // System.out.println();
        // tree.inOrder( root);
        // System.out.println();
        // tree.postOrder( root);
        // System.out.println();

        // levelOfOrder(root);
        // System.out.println(countOfNodes(root));
        // System.out.println();
        // System.out.println(sumOfNodes(root));
        // System.out.println();
        // System.out.println(heightOfNodes(root));
        
        // System.out.println(root.data);
        // System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
    }
    
}