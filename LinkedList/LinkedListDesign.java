/*
Design Linked list

Given a matrix A of size Nx3 representing operations. Your task is to design the linked list based on these operations.

There are four types of operations:
0 x -1: Add a node of value x before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
1 x -1: Append a node of value x to the last element of the linked list.
2 x index: Add a node of value x before the indexth node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
3 index -1: Delete the indexth node in the linked list, if the index is valid.
A[i][0] represents the type of operation.
A[i][1], A[i][2] represents the corresponding elements with respect to type of operation.

Note: Indexing is 0 based.


Input Format
The only argument given is matrix A.

Output Format
Return the pointer to the starting of the linked list.

Constraints
1 <= Number of operations <= 1000
1 <= All node values <= 10^9

For Example
Input 1:
    A = [   [0, 1, -1]
            [1, 2, -1]
            [2, 3, 1]   ]
Output 1:
    1->3->2->NULL

Input 2:
    A = [   [0, 1, -1]
            [1, 2, -1]
            [2, 3, 1]
            [0, 4, -1]
            [3, 1, -1]
            [3, 2, -1]
                       ]
Output 2:
    4->3->NULL
*/

package LinkedList;

public class LinkedListDesign {

    // 0 x -1: Add a node of value x before the first element of the linked list.
    // After the insertion, the new node will be the first node of the linked list.
    public ListNode insertBeforeHead(ListNode head, int value) {

        ListNode temp = new ListNode(value);
        temp.next = head;

        return temp;

    }

    // 1 x -1: Append a node of value x to the last element of the linked list.
    public void appendAfterTail(ListNode head, int value, int length) {
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        ListNode node = new ListNode(value);
        temp.next = node;

    }

    // 2 x index: Add a node of value x before the indexth node in the linked list.
    // If index equals to the length of linked list, the node will be appended to
    // the end of linked list. If index is greater than the length, the node will
    // not be inserted.
    private boolean insertBefore(ListNode head, int index, int value, int length) {
        if (index > length)
            return false;

        ListNode temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        ListNode n2 = new ListNode(value);
        n2.next = temp.next;
        temp.next = n2;

        return true;
    }

    // 3 index -1: Delete the indexth node in the linked list, if the index is
    // valid.
    private boolean removeAt(ListNode head, int index, int length) {
        if (index >= length)
            return false;

        ListNode temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

        return true;
    }

    public void printll(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" ");
            }
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public ListNode solve(int[][] A) {
        ListNode head = null;
        int length = 0;

        for (int[] row : A) {
            int opType = row[0];
            int value = row[1];
            int index = row[2];

            System.out.println(opType + " - " + value + " - " + index);

            switch (opType) {
                case 0:
                    head = insertBeforeHead(head, value);
                    length++;
                    break;

                case 1:
                    if (length == 0)
                        head = insertBeforeHead(head, value);
                    else
                        appendAfterTail(head, value, length);

                    length++;
                    break;

                case 2:
                    if (index == 0) {
                        ListNode n1 = new ListNode(value);
                        n1.next = head;
                        head = n1;
                        length++;
                        break;
                    }

                    boolean res1 = insertBefore(head, index, value, length);
                    if (res1)
                        length++;
                    break;

                case 3:
                    if (length == 0)
                        break;

                    if (value == 0) {
                        head = head.next;
                        length--;
                        break;
                    }

                    boolean res2 = removeAt(head, value, length);
                    if (res2)
                        length--;

                    break;
            }

            System.out.println(length);
            printll(head);
        }

        return head;
    }

    public static void main(String[] args) {

        LinkedListDesign l1 = new LinkedListDesign();

        // int[][] A = { { 0, 1, -1 },
        // { 1, 2, -1 },
        // { 2, 3, 1 },
        // { 0, 4, -1 },
        // { 3, 1, -1 },
        // { 3, 2, -1 }
        // };

        // ListNode head1 = l1.solve(A);

        // while (head1 != null) {
        // System.out.println(head1.val);
        // head1 = head1.next;
        // }

        // int[][] B = { { 0, 1, -1 },
        // { 1, 2, -1 },
        // { 2, 3, 1 } };

        // ListNode head2 = l1.solve(B);

        // while (head2 != null) {
        // System.out.println(head2.val);
        // head2 = head2.next;
        // }

        // int[][] A = {
        // { 1, 13, -1 },
        // { 3, 0, -1 },
        // { 3, 1, -1 },
        // { 2, 15, 0 },
        // { 3, 0, -1 },
        // { 1, 12, -1 },
        // { 3, 0, -1 },
        // { 1, 19, -1 },
        // { 1, 13, -1 },
        // { 3, 0, -1 },
        // { 0, 12, -1 },
        // { 1, 13, -1 },
        // { 3, 2, -1 }
        // };

        // ListNode head1 = l1.solve(A);

        // while (head1 != null) {
        // System.out.println(head1.val);
        // head1 = head1.next;
        // }

        // int[][] C = {
        // { 2, 1, 0 },
        // { 3, 0, -1 },
        // { 0, 15, -1 },
        // { 3, 0, -1 },
        // { 0, 8, -1 },
        // { 2, 5, 0 },
        // { 1, 2, -1 },
        // { 3, 2, -1 },
        // { 3, 1, -1 },
        // { 3, 0, -1 },
        // { 0, 1, -1 }
        // };

        int[][] C = {
                { 3, 1, -1 },
                { 1, 4, -1 },
                { 2, 5, 1 },
                { 0, 19, -1 },
                { 2, 5, 1 },
                { 3, 3, -1 },
                { 3, 2, -1 },
                { 3, 1, -1 },
                { 2, 1, 1 },
                { 1, 7, -1 },
                { 0, 2, -1 },
                { 0, 15, -1 },
        };

        ListNode head1 = l1.solve(C);

        while (head1 != null) {
            System.out.println(head1.val);
            head1 = head1.next;
        }
    }
}
