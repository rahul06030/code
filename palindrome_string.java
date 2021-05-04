import java.util.*;
import java.lang.*;
import java.io.*;

class Sol {

 public static String longestPalindrome(String s) {
        String out="",check,c;
        for(int i=0 ; i<s.length(); i++){
            check=pal(s,i,i);
            c=pal(s,i,i+1);
            check=check.length()>c.length()? check:c;
            if(out.length()<check.length()) out=check;

        }
         return out;
    }
    public static String pal( String s, int a,int b){
       while( (a>=0 && b<s.length()) && s.charAt(a)==s.charAt(b)){
            a--;
            b++;
        }
        return s.substring(a+1,b);
    }


	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());

        for(int p=0;p<n;p++){
            String str=sc.nextLine();
            System.out.println(longestPalindrome(str));
        }

	}
}
