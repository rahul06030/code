class Lcs{
	public static int lcs(String s1, String s2,int m, int n){
		int[][] dp=new int[m+1][n+1];

		for(int i=0;i<m+1;i++){
			for(int j=0;j<n+1;j++){

				if(i==0||j==0) dp[i][j]=0;

				else if(s1.charAt(i-1)== s2.charAt(j-1) ) dp[i][j] =1+ dp[i-1][j-1];

				else dp[i][j]=dp[i-1][j]>dp[i][j-1]?dp[i-1][j]: dp[i][j-1];

			}
		}
		return dp[m][n];

	}
	public static void main(String[] args) {	
		String s1="Rahul", s2="Yadav";
		int m=s1.length(),n=s2.length();
		System.out.println(lcs(s1,s2,m,n));
	}
}