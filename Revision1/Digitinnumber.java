package Revision1;

public class Digitinnumber {
    public static void main(String[] args) {
        // ____________________________________________________________
    //     int num=123678945;
    // int count=0;
    // int i=0;
    // while(num>=i){
    //     num=num/10;
    //     count++;
    //     num--;
    // }
    // System.out.println(count);
    // ________________________________________________________________

    int n=121;
    int orig=n;
        int rev=0;
    while(n!=0){
        int k=n%10;
        rev=rev*10+k;
        n=n/10;
       
         System.out.println(rev);
    }

if(orig==rev){
    System.out.println("yes");
}
else{
    System.out.println("No");
}

}
}
