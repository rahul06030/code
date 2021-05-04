import java.util.*;
class GfG {
    public static int row;
    public static int[][] matrix;
    public static ArrayList<String> ans= new ArrayList<String>();
    public static boolean[][]  visited;
    public static ArrayList<String> printPath(int[][] m, int n) {
        // Your code here
        row=n;
        visited= new boolean [n][n];
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++ ) visited[i][j]=false;
        }
        matrix=new int[n][n];
        matrix=m;
        String s="";
        rute(0,0,s);
        return ans;
    }
    
    public static void rute(int x, int y, String path){

        if(isvalid(x,y) == false )return ;

        if((x==row-1 && y==row-1) && matrix[x][y]==1){
            ans.add(path); 
            return;
         }

        visited[x][y]=true ;
        if( isvalid(x+1,y ) ){
            rute(x+1, y,path+"D");
        }
        if( isvalid(x,y+1 ) ){
            rute(x, y+1,path+"R");
        }
        if( isvalid(x-1,y ) ){
            rute(x-1, y,path+"U" );
        }                
        if( isvalid(x,y-1 )  ){
            rute(x, y-1,path+"L");
        }                 
        
        visited[x][y]=false;
}
    
    
    public static boolean isvalid(int x, int y){
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
    // GfG g=new GfG();
        ArrayList<String> s1 =g.printPath(m1,5);
        System.out.println(s1.size());
        for(int i=0 ; i<s1.size(); i++)   System.out.println(s1.get(i));
}

}







    // public static ArrayList<String> printPath(int[][] m, int n) {
    //     row=n;
    //     matrix=m;
    //     String s="";


    // }