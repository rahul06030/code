import java.util.*;
class Solution{
		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in 	);
		int t;
		t=Integer.parseInt(sc.nextLine());
		for(int p=0; p<t; p++){
			int n= Integer.parseInt(sc.nextLine());
			int one=0,sum=0, two=0,x=-1;
			int a[]=new int[n];
			
			for(int j=0; j<n; j++){
				 a[j]=Integer.parseInt(sc.nextLine());
				 sum+=a[j];}
			if(sum%2==0){
			    sum=sum/2;
			}for(int i = 0; i<n ; i++)
		        if(one+a[i]<=sum)
                    one+=a[i];
            
			if(one==sum) System.out.println("YES");
			else System.out.println("NO");	
		}
	}
}