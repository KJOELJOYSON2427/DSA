import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class frog {
    public boolean canCross(int[] stones){
        HashSet<Integer> stoneset = new HashSet<>(stones.length);

        for (int i = 0; i < stones.length; i++) {
              stoneset.add(stones[i]);
        }

        HashMap<Integer, Set<Integer>> dp = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
             dp.put(stones[i], new HashSet<>());
        }

        dp.get(0).add(0);

        for (Integer stone : stoneset) {
            for(int jump:dp.get(stone)){
                for(int jumpDistances: new int[]{jump-1, jump+1, jump}){
                    if(jumpDistances >0 && stoneset.contains(jumpDistances+stone) ){
                        
                         dp.get((stone+jumpDistances)).add(jumpDistances);
                         System.out.println(dp);
                    }
                }
            }
        }

        return !dp.get(stones[stones.length-1]).isEmpty(); 
        // checking the last elemt in stones in dp 
        //if it contains  some  distances jump to reach it without negative s then use negation on is empty
    }

    public static void main(String[] args) {
        frog Frog = new frog();
        boolean canJump=Frog.canCross(new int[]{0,1,3,4,5,6,9,12,14});

        System.out.println(canJump);
    }

}
