public class permutation{
    public static int x=0;
    public static String arr[]= new String[150];

    public static  String swap(String aa, int i, int j){
        char a[]=aa.toCharArray();
        char ch=a[i];
        a[i]=a[j];
        a[j]=ch;
        return String.valueOf(a);
    }
    /**
        Useful
        in 
        generating 
        permutations
    */
    public static void generate(String str, int start , int end){
        if(start== end-1){
            arr[x]=str;
            x++;
        }else{
        for(int i=start; i<end; i++){
            str=swap(str,start,i);
            generate(str, start+1, end);
            str=swap(str,start , i);
         }
    }
    
        
    }
    
    public static String[] findPermutations(String str){
        generate(str,0,str.length());
        
        return arr;
    }
    
    public static void main(String args[]){
        String str = "abc";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
    }
}


