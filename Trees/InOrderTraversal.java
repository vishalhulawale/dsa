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

import java.util.ArrayList;

public class InOrderTraversal {

    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        if (A == null)
            return result;

        inorderTraversal(A.left);
        result.add(A.val);
        inorderTraversal(A.right);

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InOrderTraversal iot = new InOrderTraversal();
        ArrayList<Integer> result = iot.inorderTraversal(root);
        for (Integer num : result) {
            System.out.println(num);
        }
    }
}
