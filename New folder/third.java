import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class third {
    public static void main(String [] args){
        int rows =3;
        int cols = 4;

        int [][] number = {{2,5,3,6}, {6, 7,5,3}, {8,4,7,9}};
        // int [][] number = new int [rows][cols];

        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //             number[i][j]= i+j;
        //     }
        // }

        // spiral matrix
    // int top =0, down=rows-1, left=0, right=cols-1, dir=0;
    //     while(top!=down && left!=right){
    //         if(dir ==0){
    //             for(int i = left; i<=right; i++){
    //                 System.out.print(number[top][i]);
    //             }
    //             top++;
              
    //             System.out.println();
    //         }else if(dir ==1){
    //             for(int i = top; i<=down; i++){
    //                 System.out.print(number[i][right]);
    //                 System.out.print("why not print");
    //             }
    //             right--;
              
    //             System.out.println();
    //         }else if(dir ==2){
    //             for(int i = right; i>=left; i--){
                    
    //                 // System.out.println("i"+i);
    //                 // System.out.print(i);

    //                 System.out.print(number[down][i]);
    //             }
    //             down++;
              
    //             System.out.println();
    //         }else if(dir ==3){
    //             for(int i = down; i>=top; i--){
    //                 System.out.println("j"+ i);
    //                 System.out.print(number[i][left]);
    //             }
    //             left++;
              
    //             System.out.println();
    //         }
    //         dir = dir+1;
    //         dir = (dir+1)%4;
    //     }
    }
}