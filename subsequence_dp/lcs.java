
class Solution {
    public int lcs(int index1,int index2,String s1, String s2) {


        //base case
        if(index1 <0 || index2 <0){
            return 0;
        }
        //aba and bac go from last so if there is any lcs in front thhen it will propagate to last
        if(s1.charAt(index1)==s2.charAt(index2)){
               return 1 + lcs(index1-1, index2-1, s1, s2);
        }

        return Math.max(lcs(index1-1, index2, s1, s2), lcs(index1, index2-1, s1, s2));
        
    }
}
