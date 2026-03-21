package Revision1;

public class Prefixall {
    public static void main(String[] args) {
        
//        int[] prefix=new int[a.length];
//         prefix[0]=a[0];
//         for (int i = 1; i < a.length; i++) {
//             prefix[i]=prefix[i-1]+a[i];
//         }
//         int l=2;
//         int right=4;
//         if(l==0){
//             System.out.println(prefix[right]);
//         }
//    else{
//     System.out.println(prefix[right]-prefix[l-1]);
//    }
// // ______________________________________________________________________
// int []a={1,7,3,6,6,5};
// int sum=0;

// for (int i = 0; i < a.length; i++) {
//     sum+=a[i];
// }
// int left=0;
// for (int i = 0; i < a.length; i++) {
//    int right=sum-a[i]-left;
//    if(right==left){
//     System.out.println(i);
//     return;
//    }
//    left+=a[i];
// }
// System.out.println(-1);



int []a={1,1,1,0,0,0,1,1,1,1,0};
int left=0;
int len=0;
int count=0;
for (int right = 0; right < a.length; right++) {
    if(a[right]==0){
        count++;
    }
    while(count>2){
        if(a[left]==0){
            count--;
        }
        left++;
    }
    len=Math.max(len,right-left+1);
}
System.out.println(len);
    }
}
