import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class Solution {
    public int MaximumDept(TreeNode root) {
         Queue<TreeNode>  queue = new LinkedList<>();

       
         int depth=0;

queue.add(root);
         while (true) {
             int NodeCountAtLevel = queue.size();
                    if(NodeCountAtLevel==0){
                        return depth;
                    }

                    while(NodeCountAtLevel>0){
                        TreeNode node = queue.poll();
                           if(node.left!=null){
                            queue.append(node.left);
                           }
                           if(node.right!=null){
                            queue.append(node.right);
                           }
                           NodeCountAtLevel--;
                    }
                    depth++;
         }
    }
}
