package Revision1;

public class Funny {
    public static void main(String[] args) {
      int []a={1,1,2,2,3,3};
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if(a[i]==a[j]){
                    System.out.println("duplicate found "+a[j]);
                    return;
                }
            }
        }
        System.out.println("no duplicate");
    }
}
