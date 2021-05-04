import java.util.*;
class Solution
{   
    static int dp[][];

    static int help(String s, String t, int i, int j){
        if(i==0)return j;
        if(j==0)return i;
        if(dp[i-1][j-1]!=-1)
            return dp[i-1][j-1];
        if(s.charAt(i-1)==t.charAt(j-1))return  help(s,t,i-1,j-1);

        dp[i-1][j-1]=1+Math.min( Math.min(help(s,t,i,j-1), help(s,t,i-1,j)) ,help(s,t,i-1,j-1) );
        return dp[i-1][j-1];
    }
    static int editDistance(String s, String t){
        dp = new int[s.length()][t.length()];
        for(int i[]: dp) Arrays.fill(i,-1);
        return help(s,t, s.length(), t.length());
    }
    public static void main(String[] args) {

        String s="asdfghjklllpoiuytrewq";
        String t="zxcvbnmlkjhgfdserfvbhyujklop";
        int n=editDistance(s,t);
        System.out.println(n);
        s="asdfghjklasdfghjkl";
        t= "zxcfghjiopkjhgfd";   
        int p=editDistance(s,t);
        System.out.println(p);

    }

}