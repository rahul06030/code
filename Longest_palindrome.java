import java.util.*;
class Sol{

	public static String longestPalindrome(String s){
		String out="", s1,s2;
		for(int i=0 ; i<s.length(); i++){
			s1=help(s,i,i);
			s2=help(s,i,i+1);
			s1=s1.length()>s2.length()?s1:s2;
			out=out.length()>s1.length()?out:s1;		
		}
		return out;
	}

	public static String help(String s, int i, int j){
		while(i>=0  && j<s.length() && s.charAt(i)==s.charAt(j)){
			i--; j++;
		}
		return s.substring(i+1,j);
	}

    public static void main(String[] args) {
    	String s="lplplplpqqqqqqqqrrrrrrrrtrtrtrtrtrtrtrtrtrcrcfgvttybplplpllplplpl";
    	System.out.println(longestPalindrome(s));
    }

}					