package Revision1;

public class Recursion {
    static int factorial(int a) {
      
     if(a==0||a==1){
        return 1;
     }
        
        return factorial(a-1)+factorial(a-2);
           
        
        
    }
    public static void main(String[] args) {
        int a=5;
       int k= factorial(a);
       System.out.println(k);
        
    }
}
