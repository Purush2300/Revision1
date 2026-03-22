package Revision1;

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
        int []a={1,12,-5,-6,50,3};
        int k=4;
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=a[i];
        }
        int maxsum=sum;
        for (int i = k; i < a.length; i++) {
            sum=sum-a[i-k]+a[i];
            maxsum=Math.max(maxsum, sum);
        }
        System.out.println((double)maxsum/k);
    }
}
