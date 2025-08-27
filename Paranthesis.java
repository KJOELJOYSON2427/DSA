import java.util.ArrayList;
import java.util.List;
List<String> addParanthesisString=new ArrayList<>();
class Paranthesis {
  static void generatePossibleCombinations(int n, String s, int open, int close,List<String> result){
      
//base case
if(open+close==2*n){
    result.add(s);
    return;
}
    //open
    if(open<n){
        generatePossibleCombinations(n, s +"(", open+1, close, result);
    } 
    if(close<open){
        generatePossibleCombinations(n, s +")", open, close+1, result);
    }
  }
}
class Solution {
    public List<String> generateParenthesis(int n) {

        Paranthesis.generatePossibleCombinations(n,"",0,0,addParanthesisString);
    }
}