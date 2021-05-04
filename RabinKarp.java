import java.util.*;

class Rabin{
	public static final int d=256;
	static void search(String pat, String text ){

		int p_len=pat.length(), t_len=text.length();
		int p_hash=0, t_hash=0;
		int i,j,h=1;
		int q=101;

		for (i = 0; i < p_len-1; i++) 
            h = (h*d)%q; 

		for(i=0; i<p_len; i++){
			p_hash= (d*p_hash + pat.charAt(i))%q;
			t_hash= (d*t_hash + text.charAt(i))%q;
		}

		for(i=0; i<=t_len-p_len; i++){
			if(p_hash==t_hash){
				for(j=0; j<p_len; j++)
					if(pat.charAt(j)!=text.charAt(j)) break;
					if(j==p_len) System.out.println("Pattern Found at "+i);
			}

			if(i<t_len-p_len){
				t_hash=(d*(t_hash- text.charAt(i)*h ) + text.charAt(i+p_len))%q;
				if(t_hash<0) 	t_hash+=q;
			}
		}
	}
    public static void main(String[] args) 
    { 
        String txt = "GEEKS FOR GEEKS"; 
        String pat = "GEEK"; 
            
          // A prime number 
    System.out.println("Finding Pattern");
        
          // Function Call 
        search(pat, txt); 
    } 
}