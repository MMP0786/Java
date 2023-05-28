public class five {
    public static int fn(int x, int n){
        if(x==0){ 
            return 0;
        }
        if(n==0){ 
            return 1;
        }
        if(n%2!=0){
            return x*fn(x, n/2)*fn(x, n/2);

        }else{
            return fn(x, n/2)*fn(x, n/2);
        }
        
        // System.out.println(n);
        // System.out.println(a);
        // sum *=n;
        // fn(b, a+b, fab-1);
    }
    public static void main(String [] args){
    
        System.out.println(fn(2, 4));
        
    }
  }
