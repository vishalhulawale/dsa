/*
Level Order

Problem Description
Given a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).


Problem Constraints
1 <= number of nodes <= 10^5


Input Format
First and only argument is root node of the binary tree, A.


Output Format
Return a 2D integer array denoting the zigzag level order traversal of the given binary tree.


Example Input
Input 1:
    3
   / \
  9  20
    /  \
   15   7

Input 2:
   1
  / \
 6   2
    /
   3


Example Output
Output 1:
 [
   [3],
   [9, 20],
   [15, 7]
 ]

Output 2:
 [ 
   [1]
   [6, 2]
   [3]
 ]


Example Explanation
Explanation 1:
Return the 2D array. Each row denotes the traversal of each level.
*/

package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;;

public class LevelOrderTraversal {
    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode n = queue.peek();
                queue.remove();
                temp.add(n.val);

                if (n.left != null)
                    queue.add(n.left);

                if (n.right != null)
                    queue.add(n.right);
            }

            ans.add(temp);
        }

        return ans;
    }

    public static void print(ArrayList<ArrayList<Integer>> list) {
        for (ArrayList<Integer> innerList : list) {
            for (Integer num : innerList) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        TreeNode tree1Root = new TreeNode(3);
        TreeNode tree1L1N1 = new TreeNode(9);
        TreeNode tree1L1N2 = new TreeNode(20);
        tree1L1N2.left = new TreeNode(15);
        tree1L1N2.right = new TreeNode(7);
        tree1Root.left = tree1L1N1;
        tree1Root.right = tree1L1N2;

        TreeNode tree2Root = new TreeNode(1);
        TreeNode tree2L1N1 = new TreeNode(6);
        TreeNode tree2L1N2 = new TreeNode(2);
        tree2L1N2.left = new TreeNode(3);
        tree2Root.left = tree2L1N1;
        tree2Root.right = tree2L1N2;

        ArrayList<ArrayList<Integer>> res1 = levelOrder(tree1Root);
        ArrayList<ArrayList<Integer>> res2 = levelOrder(tree2Root);

        print(res1);
        System.out.println("");
        print(res2);
    }

}
