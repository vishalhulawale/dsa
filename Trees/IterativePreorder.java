/*
Preorder Traversal

Problem Description
Given a binary tree, return the preorder traversal of its nodes' values.
NOTE: Using recursion is not allowed.


Problem Constraints
1 <= number of nodes <= 10^5


Input Format
First and only argument is root node of the binary tree, A.


Output Format
Return an integer array denoting the preorder traversal of the given binary tree.


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
[1, 2, 3]

Output 2:
[1, 6, 2, 3]


Example Explanation
Explanation 1:
The Preoder Traversal of the given tree is [1, 2, 3].

Explanation 2:
The Preoder Traversal of the given tree is [1, 6, 2, 3].
*/

package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePreorder {

    public static ArrayList<Integer> preorderTraversal(TreeNode A) {

        TreeNode root = A;

        ArrayList<Integer> result = new ArrayList<>();

        Stack<TreeNode> stk = new Stack<>();

        while (root != null || !stk.empty()) {

            if (root != null) {

                result.add(root.val);

                if (root.right != null) {
                    stk.add(root.right);
                }

                root = root.left;

            } else {
                root = stk.pop();
            }

        }

        return result;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(3);

        ArrayList<Integer> res = preorderTraversal(root);
        for (Integer integer : res) {
            System.out.println(integer);
        }

    }
}
