import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> stack = new ArrayList<>();

        for(int i=0; i<asteroids.length; i++){
            
            if(asteroids[i]>0){
                stack.addLast(asteroids[i]);
            }else{
                while(!stack.isEmpty() && stack.getLast()<Math.abs(asteroids[i]) && stack.getLast()>0){
                    stack.removeLast();
                }

                if(!stack.isEmpty() && stack.getLast() == Math.abs(asteroids[i])){
                    stack.removeLast();
                }else if(stack.isEmpty() && stack.getLast()<0){
                    stack.addLast(asteroids[i]);
                }
            }
            
        }
        return stack.stream().mapToInt(Integer:: intValue).toArray();
    }
}
public class Main {
    public static void main(String[] args) {
        
    }
}