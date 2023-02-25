import java.util.*;
public class DoWhile {

    // public static int  powerOfInteger(int a, int power){
    //     int res=1;
    //     for(int i=1; i<=power; i++){
    //         res = res*a;
    //     }
    //     return res;
    // }
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);

        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();

        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {1,8,9}};

        int row=3, col=3; 
        int top=0, down=row-1, left=0, right=col-1, dir=0;


        while(top<=down && left<=right){

            if(dir==0){
                for(int i =left; i<=right; i++){
                    System.out.println(matrix[top][i]);
                    top++;
                }
            }  else if(dir==1){
                for(int i =top; i<=down; i++){
                    System.out.println(matrix[i][right]);
                    right--;
                }
            }  else if(dir==2){
                for(int i =right; i>=left; i--){
                    System.out.println(matrix[down][i]);
                    down--;
                }
            }  else if(dir==3){
                for(int i =down; i>=top; i--){
                    System.out.println(matrix[i][left]);
                    left++;
                }
                
                
                dir = (dir+1)%4;
            }

        }

        // System.out.println("provide col one no");
        // // for rows
        // for(int i=0; i<n1; i++){
        //     System.out.println("provid rows no");
        //     for(int j=0; j<n2; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("Provid search");
        // int search = sc.nextInt();
        // System.out.println("Your Matrix");


        // for(int i=0; i<n1; i++){
        //     // System.out.println("provid rows no");
        //     for(int j=0; j<n2; j++){
        //         if(matrix[i][j]==search){
        //             System.out.println("At index : "+ i+" "+ j);
        //         }
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        // int a =0;
        // int b=1;
        // int sum;
        // System.out.println(a+"\n"+b);
        // for(int i=1; i<=n1; i++){
        //     sum = a+b;
        //     a=b;
        //     b= sum;
        //     System.out.println(b);
        // }

        // int n2 = sc.nextInt();
        // int orgN1=n1;
        // int orgN2=n2;
        // int rem, lcm;
        // while(n1%n2!=0){
        //     rem = n1%n2;
        //     n1 = n2;
        //     n2= rem;
        // }
        // lcm = (orgN1*orgN2)/n2;
        // System.out.println(lcm);
        // System.out.println(n2);

        // System.out.println(powerOfInteger(num, power));

        // boolean prime =true;

        // for(int i=2; i<num/2; i++){
        //     if(num%i==0){
        //         prime = false;
        //     }
        // }
        // if(num==1){
        //     System.out.println("1 is niether prime nor composite");
        // }else if(num==0){
        //     System.out.println("0 or less than zero not a prime nor composite");
        // }else if(prime){
        //     System.out.println(" The no is not Prime");
        // }else{
        //     System.out.println(" The no is Prime");

        // }




        // int input;

        // do{
        //     if(num>90){
        //         System.out.println("Excellent");
        //     }else if(num>80 && num< 90){
        //         System.out.println("Too good");
        //     }else if(num<80 ){
        //         System.out.println(" Ok ");
        //     }else{
        //         System.out.println("Provide valid no");
        //     }
        //     input = sc.nextInt();
        // }
        // while(input ==1);
        
    }
}
