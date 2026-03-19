package Revision1;

public class Gcd {
    public static void main(String[] args) {
        int a=6;
        int b=4;
        int x=a;
        int y=b;
        // while(a!=b){
        //     if(a>b){
        //         a=a-b;
        //     }
        //     else{
        //         b=b-a;
        //     }
        // }
       
        // System.out.println(a);


// ___________________________________________________
while(b!=0){
    int temp=b;
    b=a%b;
    a=temp;
}
int lcm=(x*y)/a;
System.out.println(lcm);
    }
}
