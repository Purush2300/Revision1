package Revision1;
import java.util.HashMap;
public class Slidingwindow {
    public static void main(String[] args) {
        // int []a={2,3,1,2,4,3};
        // int i=0;
        // int j=0;
        // int sum=0;
        // int target=7;
        // int min=Integer.MIN_VALUE;
        // while (j<a.length) {
        //     sum+=a[j];
        //     while(sum>=target){
        //        sum-=a[i];
        //         i++;
        //     }
        //      min=Math.max(min, j-i+1);
        //     j++;
        // }
        // System.out.println(min);
        // _________________________________________________________________________
        // int []a={1,12,-5,-6,50,3};
        // int k=4;
        // int sum=0;
        // for (int i = 0; i < k; i++) {
        //     sum+=a[i];
        // }
        // int maxsum=sum;
        // for (int i = k; i < a.length; i++) {
        //     sum=sum-a[i-k]+a[i];
        //     maxsum=Math.max(maxsum, sum);
        // }
        // System.out.println((double)maxsum/k);
        // ______________________________________________________________________________
HashMap <Character,Integer> map=new HashMap<>();
// int []a={1,2,1};
// int l=0;
// int len=0;
// for (int r = 0; r< a.length; r++) {
//     map.put(a[r], map.getOrDefault(a[r], 0)+1);
//     if(map.size()>2){
//        map.put(a[l],map.get(a[l])-1);
//        if(map.get(a[l])==0){
//         map.remove(a[l]);
//        }
//         l++;
//     }
   
//     len=Math.max(len, r-l+1);
// }
// System.out.println(len);

// String a="saveChangesInTheEditor";
// int count=1;
// for (int i = 0; i <a.length(); i++) {
   
//     if(a.charAt(i)>='A' && a.charAt(i)<='Z'){
//         count++;
//     }
// }
// System.out.println(count);
// _________________________________________________________
String s="aaabccddd";
String t="";
for (int i = 0; i < s.length()-1; i++) {
    if(s.charAt(i)==s.charAt(i+1)){
        
    }
    else {
        t=t+s.charAt(i);
    }
}
System.out.println(t);
    }
}
