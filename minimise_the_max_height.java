import java.util.*;
class Sol{
public static int minHeight(int arr[],int n , int k){
  if(n==1) return 0;
  Arrays.sort(arr);

  int difference=arr[n-1]-arr[0];
  int min=arr[0]+k, max=arr[n-1]-k;
  int diff,sum;
  if(min>max){
    int temp=min;
    min=max;
    max=temp;
  }
  for(int i=1; i<n-1; i++){
    diff=arr[i]-k;
    sum=arr[i]+k;
    if(diff>=min||sum<=max) continue;
    if(max-diff<=sum-min) min=diff;
    else max=sum;

  }return Math.min(difference,max-min);
}

  public static void main(String[] args) {
    int[] arr={6, 1, 9 ,1 ,1, 7, 9, 5, 2, 10};
    int k=4;
    int n=arr.length;
    System.out.println(minHeight(arr,n,k));
  }
}
