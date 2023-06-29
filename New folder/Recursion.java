import java.util.ArrayList;

public class Recursion {

    public static void pritFiveNo(String x, int idx){
        if(idx==x.length()-1){
            System.out.println(x.charAt(idx));
            return;
        }
        System.out.print(x.charAt(idx)+" ");
       pritFiveNo(x, idx+1);
    }

    public static void towerOfHannoi(int disk, String src, String help, String des){
        if(disk ==1){
            System.out.println("Disk "+ disk + " is transfer from "+ src + " to "+ des);
            return;
        }
        towerOfHannoi(disk-1, src, des, help);
        System.out.println("Disk "+ disk + " is transfer from "+ src + " to "+ des);
        towerOfHannoi(disk-1, help, src, des);

    }
    
    public static int firstIdx = -1;
    public static int lastIdx =-1;

    public static void fistAndLastIdx(String str, int idx, char x){
        if(idx==str.length()-1){
            System.out.println("first idx "+firstIdx + " and Last Idx "+lastIdx);
            return;
        }
        if(str.charAt(idx)==x && firstIdx==-1){
            firstIdx = idx;
        }else if(str.charAt(idx)==x){
            lastIdx = idx;
        }
        fistAndLastIdx(str, idx+1, x);
    }

    public static boolean isSorted(int arr[], int idx){
        if(idx==arr.length-1){
            System.out.println(idx);
            return true;
        }
        if(arr[idx]< arr[idx+1]){
           return isSorted(arr, idx+1);
        }else{
            return false;
        }

    }

    public static void moveAllX(String str, int idx, String newStr, int count){
        if(idx == str.length()-1){
            for(int i=0; i<count; i++){
                newStr +="x";
            }
            System.out.println(newStr);
            return;
        }
        if(str.charAt(idx)=='a'){
            count++;
            moveAllX(str, idx+1, newStr, count);
        }else{
            newStr += str.charAt(idx);
            moveAllX(str, idx+1, newStr, count);
        }
    }
    
    public static boolean[] map = new boolean[26];
    public static void removeDup(String str, String newString, int idx){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
             removeDup(str, newString, idx+1);
        }else{
        newString +=currChar;
        map[currChar-'a']=true;
        removeDup(str, newString, idx+1);
       }
    }
    
    public static void subSequence(String str, String newStr,  int idx){
        if(str.length()==idx){
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(idx);
        int count =0;
        count = count+1;
        subSequence(str, newStr+curr, idx+1);
        subSequence(str, newStr, idx+1);
    }
    public static String keypad [] = {".", "abc", "def", "ghi", "jklm", "no", "pqrs", "tuvw", "xyz"};

    public static void printlnComb(String str, int idx, String com){
        if(str.length()==idx){
            System.out.println(com);
            return;
        }
        char currChar = str.charAt(idx);
        String map = keypad[currChar - '0'];

        for(int i=0; i<map.length(); i++){
            printlnComb(str, idx+1, com+map.charAt(i));
        }
    }

    public static void printPer(String str, String per){
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        for(int i=0; i<str.length(); i++){

            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            printPer(newStr, per+currChar);
        }
    }

    public static void printPermutation(String str, String per) {
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr= str.substring(0, i)+ str.substring(i+1);
            printPermutation(newStr, per+currChar);

        }
    }
    // public static void 

    public static int totalPathInMaze(int i, int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n || j==m){
            return 0;
        }

        // downPath
        int downPath=   totalPathInMaze(i+1, j, n, m);

        // rightPath
        int rightPath= totalPathInMaze(i, j+1, n, m);

        return downPath + rightPath;
    }

    public static int TotalTiles(int n, int m){
        if(n<m){
            return 1;
        }
        if(n==m){
            return 2;
        }
        // horijontal
        int hori= TotalTiles(n-m, m);

        int ver = TotalTiles(n-1, m);

        return hori + ver;
    }
    public static void main(String args []){
        String str = "musharrafpanwarhahab";
        int len = str.length();
        int arr [] = {1, 2, 3, 4,5};
        // ArrayList<String> set = new ArrayList<>();
        // System.out.println(isSorted(arr, 0));
        // pritFiveNo(str, 0);
        // fistAndLastIdx(str, 0, 'a');
        // towerOfHannoi(3, "S", "H", "D");
        // moveAllX(str, 0, "",0);
        String st = "abc";
        // removeDup(str, "", 0);
        String s = "23";
        // subSequence(st, "", 0);
        // printlnComb(s, 0, "");
        // printPer(st, "");
        System.out.println(totalPathInMaze(0, 0, 3, 3));
        System.out.println(TotalTiles( 4 , 2));
    }
}
