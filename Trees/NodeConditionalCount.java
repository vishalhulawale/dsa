/*
Counting the Nodes

Problem Description
Given the root of a tree A with each node having a certain value, find the count of nodes which have more value than all its ancestor


Problem Constraints
1 <= Number of Nodes <= 200000
1 <= Value of Nodes <= 2000000000


Input Format
First and only argument of input is a tree node.


Output Format
Return a single integer denoting count of nodes which have more value than all of it's ancestor.

Example Input
Input 1: 
     3

Input 2:
    4
   / \
  5   2
     / \
    3   6


Example Output
Output 1:
1

Output 2:
3


Example Explanation
Explanation 1:
One node is valid

Explanation 2:
Three nodes are 4, 5 and 6.
*/

package Trees;

public class NodeConditionalCount {

    public static int countNodes(TreeNode A, int max) {
        if (A == null)
            return 0;

        int cnt = 0;
        if (A.val > max)
            cnt++;

        int newMax = Math.max(max, A.val);

        cnt += countNodes(A.left, newMax);
        cnt += countNodes(A.right, newMax);

        return cnt;
    }

    public static int solve(TreeNode A) {
        if (A == null)
            return 0;

        return countNodes(A, A.val) + 1;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        System.out.println(solve(root1));

        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(2);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);
        System.out.println(solve(root2));

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.right.left = new TreeNode(4);
        root3.right.left.right = new TreeNode(5);
        System.out.println(solve(root3));
    }
}
