import java.util.*;
class GfG {
     public static int row;
    public static ArrayList<String> ans;
    public static ArrayList<String> printPath(int[][] m, int n) {
        // Your code here
        row=n;
        boolean[][]  visited= new boolean [n][n];
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++ ) visited[i][j]=false;
        }
        // matrix=m;
        String s="";
        ans= new ArrayList<String>();
        rute(0,0,s,visited, m);
        return ans;
    }
    
    public static void rute(int x, int y, String path, boolean[][] visited,  int[][] matrix){

        if(isvalid(x,y,visited ,matrix) == false )return ;

        if((x==row-1 && y==row-1) && matrix[x][y]==1){
            ans.add(path); 
            return;
         }

        visited[x][y]=true ;
        if( isvalid(x+1,y ,visited, matrix) ){
            rute(x+1, y,path+"D",visited ,matrix );
        }
        if( isvalid(x,y-1 ,visited ,matrix)  ){
            rute(x, y-1,path+"L",visited ,matrix);
        }       
        if( isvalid(x,y+1 ,visited ,matrix) ){
            rute(x, y+1,path+"R",visited ,matrix);
        }
        if( isvalid(x-1,y ,visited ,matrix) ){
            rute(x-1, y,path+"U",visited ,matrix );
        }                
          
        
        visited[x][y]=false;
}
    
    
    public static boolean isvalid(int x, int y, boolean[][] visited, int[][] matrix){
        return (x>=0&& x<row && y>=0&& y<row && visited[x][y]==false  && matrix[x][y]==1 );
    }
}

class Ans{
public static void main(String[] args){
        int[][] m = {{1, 0, 0, 0},
                    {1, 1, 0, 1}, 
                    {1, 1, 0, 0},
                    {0, 1, 1, 1}};
    
    GfG g=new GfG();
        ArrayList<String> s=g.printPath(m,4);
        System.out.println(s.size());
        for(int i=0 ; i<s.size(); i++)   System.out.println(s.get(i));

    int[][] m1 = {{1,0,0,0,0}, 
                {1,1,1,1,1}, 
                {1,1,1,0,1}, 
                {0,0,0,0,1}, 
                {0,0,0,0,1}};
    GfG g1=new GfG();
        ArrayList<String> s1 =g1.printPath(m1,5);
        System.out.println(s1.size());
        for(int i=0 ; i<s1.size(); i++)   System.out.println(s1.get(i));
}

}







    // public static ArrayList<String> printPath(int[][] m, int n) {
    //     row=n;
    //     matrix=m;
    //     String s="";


    // }