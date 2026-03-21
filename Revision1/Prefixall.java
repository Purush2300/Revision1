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



// int []a={1,1,1,0,0,0,1,1,1,1,0};
// int left=0;
// int len=0;
// int count=0;
// for (int right = 0; right < a.length; right++) {
//     if(a[right]==0){
//         count++;
//     }
//     while(count>2){
//         if(a[left]==0){
//             count--;
//         }
//         left++;
//     }
//     len=Math.max(len,right-left+1);
// }
// System.out.println(len);
// _______________________________________________________
// int []a={-5,1,5,0,-7};
// int altitude=0;
// int max=0;
// for (int i = 0; i < a.length; i++) {
//     altitude=altitude+a[i];
//     if(altitude>max){
//     max=altitude;
// }
// }

// System.out.println(max);
// _______________________________________________________________________________________
// int []a={10,5,2,6};
// int k=100;
// int left=0;
// int count=0;
// int mul=1;
// for (int right= 0; right < a.length; right++) {
//     mul*=a[right];
//     while(mul>=k){
//         mul/=a[left];
//         left++;
//     }
//     count+=(right-left+1);
// }
// System.out.println(count);
// ___________________________________________________________
int []a={1,2,3,4,5,6,1};
int k=3;
int sum=0;
int max=0;
for (int i = 0; i <k; i++) {
    sum+=a[i];
}
max=sum;
int last=a.length-1;
for (int i = k-1; i>=0; i--) {
    sum=sum-a[i]+a[last];
    last--;
    max=Math.max(max, sum);
}
System.out.println(max);
    }
}
