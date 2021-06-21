import java.util.*;

class Sol {

    public static List<List<String>> Anagrams(String[] arr) {
        
        Map<String, List<String>> map=new HashMap<>();
        int n=arr.length ;
        for(int i=0;i<n ;i++){
            String s=arr[i];
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String str=String.valueOf(ch);
           if (map.containsKey(str)) {

                map.get(str).add(s);
            }
            else { 
                List<String> words = new ArrayList<>();
                words.add(s);
                map.put(str, words);
            }
        }
         List<List<String>> ans= new ArrayList<>();
        for(String s: map.keySet()) 
            ans.add(map.get(s));
          return ans;
    }


    public static void main(String[] args) {
        String[] words={"god","dog", "eat","ate","tea"};
        System.out.println(Anagrams(words));
    }
}
