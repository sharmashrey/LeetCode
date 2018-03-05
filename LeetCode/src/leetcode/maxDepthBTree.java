/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import java.*;

/**
 *
 * @author shreyas
 */
class maxDepthBTree {

    // Trivial Recursive
    public int maxDepth(TreeNode root) {
        if (root== null)return 0;
        return 1+ Math.max( maxDepth(root.left),maxDepth(root.right))  ;
    }

    // Iterative BFS/ DFS



        if (s.length()==0) return 0;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    int max=0;
        for (int i=0, j=0; i<s.length();i++){
        System.out.println( "Iteration "+i);
        if (map.containsKey(s.charAt(i))){
            System.out.println("J/Startposition = "+j);
            j = Math.max(j,map.get(s.charAt(i))+1);
            System.out.println("Map Value" + (map.get(s.charAt(i))+1));
            System.out.println("Final J/Startposition = "+j);
        }
        System.out.print("MAP PUT = "+s.charAt(i) + " i"+ i );

        max = Math.max(max,i-j+1);
        map.put(s.charAt(i),i+1);


        System.out.println("Max = "+ max);
    }
        return max;
}
