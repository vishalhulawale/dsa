/*
Identical Binary Trees

Problem Description
Given two binary trees, check if they are equal or not.
Two binary trees are considered equal if they are structurally identical and the nodes have the same value.


Problem Constraints
1 <= number of nodes <= 10^5


Input Format
The first argument is a root node of the first tree, A.
The second argument is a root node of the second tree, B.


Output Format
Return 0 / 1 ( 0 for false, 1 for true ) for this problem.


Example Input
Input 1:
   1       1
  / \     / \
 2   3   2   3

Input 2:
   1       1
  / \     / \
 2   3   3   3


Example Output
Output 1:
1

Output 2:
0


Example Explanation
Explanation 1:
Both trees are structurally identical and the nodes have the same value.

Explanation 2:
Values of the left child of the root node of the trees are different.
*/

package Trees;

public class CheckIdenticals {

    public static int isSameNode(TreeNode A, TreeNode B) {
        if (A != null && B != null && A.val == B.val)
            return 1;

        return 0;
    }

    public static int isSymmetric(TreeNode A, TreeNode B) {
        if (A == null && B == null)
            return 1;

        if (isSameNode(A, B) == 0)
            return 0;

        if (isSymmetric(A.left, A.right) == 0)
            return 0;

        return 1;
    }

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.right.left = new TreeNode(5);
        root1.right.left.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.right.left = new TreeNode(5);
        root2.right.left.right = new TreeNode(4);

        System.out.println(isSymmetric(root1, root2));

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);

        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(4);

        System.out.println(isSymmetric(root3, root4));
    }
}
