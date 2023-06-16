public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            
        }
    }

 public static Node create(Node root, int values){
    if(root ==null){
        root = new Node(values);
        return root;
    }
    if(root.data> values){
        root.left = create(root.left, values);
        
    }else{
        root.right = create(root.right, values);
    }
        return root;
 }      

//  Search

public static boolean search(Node root , int key){
    if(root ==null){
        return false;
    }

    if(root.data > key){
        return search(root.left, key);
    }else if(root.data ==key){
        return true;
    }else{
        return search(root.right, key);
    }
}

 public static void inorder(Node root) {
    if(root ==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
    
 }


//  Deletion

public static Node delete(Node root, int val){
    if(root.data > val){
        root.left = delete(root.left, val);
    }else if(root.data < val){
        root.right = delete(root.right, val);
    }else{
        // case 1
        if(root.left ==null && root.right ==null){
            return null;
        }
        // case 2
        if(root.left ==null){
            return root.right;

        }else if(root.right == null){
            return root.left;
        }
        // case 3
        Node IS = inorderSucc(root.right);
        root.data = IS.data;
        root.right = delete(root.right, IS.data);
    }
    return root;
}

public static Node inorderSucc(Node root){
    while(root.left!= null){
        root = root.left;
    }
    return root;
}
public static void main(String args[]){
        int values[]= {3, 2, 1, 4, 5, 6};
        Node root = null;

        for(int i=0; i<values.length; i++){
          root =  create(root, values[i]);
        }
        inorder(root);
        // if(search(root, 7)){
        //     System.out.println("found");
        // }else{
        //     System.out.println("Not found");
        // }
        System.out.println();
        delete(root, 2);
        // System.out.println(); 
        inorder(root);
    }
}
