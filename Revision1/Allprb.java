package Revision1;

public class Allprb {
    public static void main(String[] args) {
        // int []a={1,10,55,0,-2,35};
        // int max=Integer.MAX_VALUE;
        // for (int i = 0; i < a.length; i++) {
        //     if(a[i]<max){
        //         max=Math.min(max, a[i]);
        //     }
        // }
        // System.out.println(max);
    //   ______________________________________
    // int count=0;
    // for (int i = a.length-1; i>=0; i--) {
    // count+=a[i];
    // }
    // System.out.println(count);
    //     int max=0;int index=0;
    // for (int i = 0; i < a.length; i++) {
    //     if(a[i]>max){
    //         max=a[i];
    //         index=i;
    
  
    //     }
    // }
    // System.out.println(index);
    // __________________________________
//     int sl=Integer.MIN_VALUE;
//     int l=Integer.MIN_VALUE;
  
//  int i=0;
//  while(i<a.length){
//     if(a[i]>l){
//         sl=l;
//         l=a[i];
//     }
//     else if (a[i]>sl && a[i]!=l){
//         sl=a[i];
//     }
//     i++;
// }
//     System.out.println(sl);
// ___________________________________________________________
int []a={3,2,7,5,1,4,10,6};
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
for (int i = 0; i < a.length; i++) {
    if(a[i]>max){
        max=Math.max(max, a[i]);
    }
    else if(a[i]<min){
        min=Math.min(max, a[i]);
    }
}
System.out.println(min+max);
    }
}
