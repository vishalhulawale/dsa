/*
Postorder Traversal

Problem Description
Given a binary tree, return the Postorder traversal of its nodes' values.
NOTE: Using recursion is not allowed.


Problem Constraints
1 <= number of nodes <= 10^5


Input Format
First and only argument is root node of the binary tree, A.


Output Format
Return an integer array denoting the Postorder traversal of the given binary tree.


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
[3, 2, 1]

Output 2:
[6, 3, 2, 1]


Example Explanation
Explanation 1:
The Preoder Traversal of the given tree is [3, 2, 1].

Explanation 2:
The Preoder Traversal of the given tree is [6, 3, 2, 1].
*/

package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePostOrder {

    public static ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(A);

        while (!s1.empty()) {

            TreeNode node = s1.pop();

            s2.push(node);

            if (node.left != null)
                s1.push(node.left);

            if (node.right != null)
                s1.push(node.right);
        }

        while (!s2.empty()) {
            TreeNode node = s2.pop();
            result.add(node.val);
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(3);

        ArrayList<Integer> res = postorderTraversal(root);
        for (Integer integer : res) {
            System.out.println(integer);
        }
    }

}
