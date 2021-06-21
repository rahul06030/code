import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        int count[]=new int[n];
        Arrays.fill(count,1);
        arr[0]=1;
        for(int i=1;i<n; i++)
            if(arr[i]>arr[i-1]) count[i]=count[i-1]+1;
                
        for(int i=n-2;i>0; i--)
            if(arr[i]>arr[i+1] && count[i]<count[i+1]) count[i]=count[i+1]+1;
        /* for(int i=0; i<n;i++){
            System.out.println(count[i]);
        }*/ 
        int sum=0;
        for(int i : count) sum+=i;
        System.out.println(sum);
 }