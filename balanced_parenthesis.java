import java.util.*;
class Solution
{
    static boolean isbalanced(String x)
    {
        Stack<Character > stk = new Stack<Character >();  
        ArrayList<Character > open=  new ArrayList<Character >(Arrays.asList('{','[','('));        
        // ArrayList<String> close=  new ArrayList<String>(Arrays.asList("}","]",")"));
        if(x.length()%2!=0)return false;
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(open.contains(ch)) stk.push(ch);
            else{
                if(stk.size()==0)return false;
                char pp=stk.pop();
                if(pp=='{'&& ch!='}') return false;                
                if(pp=='['&& ch!=']') return false;                
                if(pp=='('&& ch!=')') return false;
            }
        }return true;
    }

    public static void main(String args[]){
    System.out.println(isbalanced("{{{{{{{}}}{}{}{}{}{}{}{}}}}}}()()()(){}{}{}[][][]]]]]]]](((()))))"));
    }
}
