import java.util.*;

public class StackWithList {
    // static class Stack{
    //    static ArrayList<Integer> list = new ArrayList<>();

    //     public static boolean isEmpty(){
    //         return list.size()==0;
    //     }

    //     // push
    //     public static void push(int data){
    //         list.add(data);
    //     }

    //     // pop
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = list.size()-1;
    //         int ele = list.get(top);
    //         list.remove(top);
    //         return ele;
    //     }

    //     public static int peek(){
    //         int top= list.size()-1;
    //         return list.get(top);
    //     }
    // }

    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void main(String args[]){
        // Stack s1 = new Stack();
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(4);
        s1.push(1);
        s1.push(7);
        s1.push(11);
        // s1.push(13);
        // pushAtBottom(10, s1);
        reverse(s1);
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}
