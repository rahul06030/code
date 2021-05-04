import java.util.*;
class Sol{
  public static void printCommonElements(int mat[][]){
    HashMap<Integer, Integer> map = new HashMap<>();
    HashSet<Integer> count=new HashSet<Integer>();
    for(int i[]:mat){
      for(int j:i)
        count.add(j);
      System.out.println(count);

      for(int j:count){
        int val=map.containsKey(j)?map.get(j):0;
        map.put(j,val+1);
      }count.clear();

    }
    System.out.println(map);
  }

  public static void main(String[] args){
    int mat[][] =
    {
        {1, 2, 1, 4, 8},
        {3, 7, 8, 5, 1},
        {8, 7, 7, 3, 1},
        {8, 1, 2, 7, 9},
    };

    printCommonElements(mat);

}
}
