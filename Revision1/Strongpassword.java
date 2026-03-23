package Revision1;

public class Strongpassword {
    public static void main(String[] args) {
        String a="2bb";
        int count=0;
       
            for (int i = 0; i < a.length(); i++) {
                 char ch = a.charAt(i);
                 if(ch>='A' && ch<='Z'){
                    count++;
                 }
                 else if(ch>='a' && ch<='z'){
                    count++;
                 }
                 else if(ch>='0' && ch<='9'){
                    count++;
                 }
                 else{
                    count++;
                 }
            }
        
       System.out.println(count);
    }
}
