// import java.util.HashSet;

// public class Seventh {
//     // public static void toweOfHanoi(int n, String src, String helper, String des){
//     //     if(n==1){
//     //         System.out.println("Transfer disk "+n+ " from "+ src +" to "+des);
//     //         return;
//     //     }
//     //     toweOfHanoi(n-1, src, des, helper);
//     //     System.out.println("Transfer disk "+n+ " from "+ src +" to "+des);
//     //     toweOfHanoi(n-1, helper, src, des);

//     // }

//     // public static void reverseString(int idx, String str){
//     //     if(idx ==0){
//     //         System.out.print(str.charAt(idx));
//     //         return;
//     //     }
//     //     System.out.print(str.charAt(idx));
//     //     reverseString(idx-1, str);
//     // }
//     // public static int firstInd = -1;
//     // public static int lastInd = -1;

//     // public static void fistAndLastIndex(String str, int idx, char a){
//     //     if(idx == str.length()){
//     //         // if(str.charAt(idx)==a){
//     //             // System.out.println("Last ind is "+ idx);
//     //         // }
//     //         System.out.println("Last index is "+ lastInd);
//     //         System.out.println("First index is "+ firstInd);
//     //         return;
//     //     }
//     //     char currChar = str.charAt(idx);
//     //     if(currChar ==a){
//     //         if(firstInd ==-1){
//     //             firstInd = idx;
//     //         }else{
//     //             lastInd = idx;
//     //         }
//     //     }
//     //     fistAndLastIndex(str, idx+1, a);
//     // }

//     // public static boolean strictlySort(int [] arr, int idx){
//     //     if(arr.length-1 ==idx){
//     //         System.out.println("This arr is strictlySort");
//     //         return true;
//     //     }
//     //     if(arr[idx+1]< arr[idx])
//     //         return false;
        
//     //     return strictlySort(arr, idx+1);
//     // }

//     // public static int count =0;

//     // public static void moveX(String str, String newString, int idx){
//     //     if(str.length()==idx){
//     //         for(int i=0; i<count; i++){
//     //             newString +='a';
//     //            }
//     //            System.out.println(newString);
//     //         return;
//     //     }
//     //     if(str.charAt(idx)=='a'){
//     //         count++;
//     //         moveX(str, newString, idx+1);
//     //     }else{
//     //         newString += str.charAt(idx);
//     //         moveX(str, newString, idx+1);
//     //     }
//     // }

//     // public static boolean[] arr = new  boolean[26];
//     // public static void removeDuplicates(String str, int idx, String newString){
//     //     if(idx == str.length()){
//     //         System.out.print(newString);
//     //         return;
//     //     }
//     //     char current = str.charAt(idx);
//     //     if(arr[current - 'a']){  
//     //         removeDuplicates(str, idx+1, newString);
//     //     }
//     //     if(!(arr[current - 'a'])){
//     //         newString +=current;
//     //         arr[current-'a'] = true;
//     //         removeDuplicates(str, idx+1, newString);
//     //     }
//     // }

//     // public static void Subsequences(String str, String newString, int idx){
//     //     if(idx == str.length()){
           
//     //             System.out.print(newString + " ");
//     //             return;
        
            
//     //     }
//     //     char currentChar = str.charAt(idx);
//     //     Subsequences(str, newString+currentChar, idx+1);
        
//     //     Subsequences(str, newString, idx+1);
        
//     // }
//     // public static void Subsequences(String str, String newString, int idx, HashSet<String> set){
//     //     if(idx == str.length()){
//     //         if(set.contains(newString)){
//     //             return;
//     //         }else{
//     //             set.add(newString);
//     //             System.out.println(newString);
//     //             return;
//     //         }
            
//     //     }
//     //     char currentChar = str.charAt(idx);
//     //     Subsequences(str, newString, idx+1, set);

//         // Subsequences(str, newString+=currentChar, idx+1, set);
//     // }

//     public static String keypad [] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vw", "xyz"};
//     public static void printComb(String str, int idx, String combination){
//         if(idx==str.length()){
//             System.out.println(combination);
//             return;
//         }
//         char currChar = str.charAt(idx);

//         String mapping = keypad[currChar-'0'];
//         for(int i=0; i<mapping.length(); i++){
//             printComb(str, idx+1, combination+mapping.charAt(i));
//         }

//     }

//     public static boolean arr [] = new boolean[26];
//     public static void removeDuplicates(String str, String newStr, int idx){
//         if(idx== str.length()){
//             System.out.println(newStr);
//             return;
//         }
//         char current = str.charAt(idx);
//         if(arr[current-'a']){
//             removeDuplicates(str, newStr, idx+1);
//         }else{
//             // newStr +=current;
//             arr[current-'a'] = true;
//             removeDuplicates(str, newStr+current, idx+1);
//         }
//     }
//     public static void main(String [] args){
//         String str = "abcccbjfhf";
//         int idx = str.length()-1;
//         HashSet<String> set = new HashSet<>();
//         printComb("23", 0, "");
//         // Subsequences(str, "", 0);
//         // Subsequences(str, "", 0, set);
//         // fistAndLastIndex(str, 0, 'a');
//         // reverseString(idx, str);
//         // int arr []= {1, 2, 4,5};
//         // removeDuplicates(str, "", 0);

//         // moveX(str, "", 0);

//         // System.out.println(strictlySort(arr, 0));
//         // int n =2;
//         // toweOfHanoi(n, "S", "H","D" );
        
//     }
// }

