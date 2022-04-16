/*
Path to Given Node

Problem Description
Given a Binary Tree A containing N nodes, you need to find the path from Root to a given node B.

NOTE:
No two nodes in the tree have the same data values.
You can assume that B is present in tree A and a path always exists.


Problem Constraints
1 <= N <= 10^5
1 <= Data Values of Each Node <= N
1 <= B <= N


Input Format
First Argument represents pointer to the root of binary tree A.
Second Argument is an integer B denoting the node number.


Output Format
Return an one-dimensional array denoting the path from Root to the node B in order.


Example Input
Input 1:
A =     
           1
         /   \
        2     3
       / \   / \
      4   5 6   7 

B = 5

Input 2:
A = 
            1
          /   \
         2     3
        / \ .   \
       4   5 .   6

B = 1   


Example Output
Output 1:
[1, 2, 5]

Output 2:
[1]


Example Explanation
Explanation 1:
We need to find the path from root node to node with data value 5.
So the path is 1 -> 2 -> 5 so we will return [1, 2, 5]

Explanation 2:
We need to find the path from root node to node with data value 1.
As node with data value 1 is the root so there is only one node in the path.
So we will return [1]
*/

package Trees;

import java.util.ArrayList;
import java.util.Collections;

public class PathFinder {

    static boolean pathExists(TreeNode root, int A, ArrayList<Integer> B) {

        if (root == null)
            return false;

        if (root.val == A) {
            B.add(root.val);
            return true;
        }

        if (pathExists(root.left, A, B) || pathExists(root.right, A, B)) {
            B.add(root.val);
            return true;
        }

        return false;

    }

    public static ArrayList<Integer> solve(TreeNode A, int B) {

        ArrayList<Integer> result = new ArrayList<>();

        pathExists(A, B, result);

        Collections.reverse(result);

        return result;

    }

    public static void main(String[] args) {

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        ArrayList<Integer> res = solve(a, 5);
        for (Integer num : res) {
            System.out.println(num);
        }
    }

}
