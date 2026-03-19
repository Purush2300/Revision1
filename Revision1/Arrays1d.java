
package Revision1;
import java.util.*;
public class Arrays1d {
    static void printarray(int []a){
        Scanner sc=new Scanner(System.in);
        int count=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
           count+=a[i];
        }
         System.out.println(count);
    }
    public static void main(String[] args) {

        int size=5;
        int [] a=new int [size];
        printarray(a);
    }
}
