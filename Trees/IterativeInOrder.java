/*
Inorder Traversal

Problem Description
Given a binary tree, return the inorder traversal of its nodes' values.
NOTE: Using recursion is not allowed.


Problem Constraints
1 <= number of nodes <= 10^5


Input Format
First and only argument is root node of the binary tree, A.


Output Format
Return an integer array denoting the inorder traversal of the given binary tree.


Example Input
Input 1:
   1
    \
     2
    /
   3

Input 2:
   1
  / \
 6   2
    /
   3



Example Output
Output 1:
[1, 3, 2]

Output 2:
[6, 1, 3, 2]


Example Explanation
Explanation 1:
The Inorder Traversal of the given tree is [1, 3, 2].

Explanation 2:
The Inorder Traversal of the given tree is [6, 1, 3, 2].
*/
package Trees;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class IterativeInOrder {

    public static ArrayList<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        Stack<TreeNode> stk = new Stack<>();

        while (root != null || !stk.empty()) {

            if (root != null) {
                stk.push(root);
                root = root.left;
            } else {
                root = stk.pop();
                result.add(root.val);
                root = root.right;
            }

        }

        return result;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(3);

        List<Integer> res = inorderTraversal(root);
        for (Integer integer : res) {
            System.out.println(integer);
        }

    }

}
