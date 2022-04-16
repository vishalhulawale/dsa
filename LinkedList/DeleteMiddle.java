/*
Delete middle node of a Linked List

Given a singly linked list, delete middle of the linked list.
For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5
If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.
For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.
Return the head of the linked list after removing the middle node.
If the input linked list has 1 node, then this node should be deleted and a null node should be returned.


Input Format
The only argument given is the node pointing to the head node of the linked list
*/
package LinkedList;

public class DeleteMiddle {
    public static ListNode solve(ListNode A) {
        if (A == null || A.next == null) {
            return null;
        }

        ListNode curNode = A;
        ListNode fastPtr = A;
        ListNode prevNode = null;

        while (fastPtr != null && fastPtr.next != null) {
            prevNode = curNode;
            curNode = curNode.next;
            fastPtr = fastPtr.next.next;
        }

        prevNode.next = prevNode.next.next;

        return A;
    }

    public static void main(String[] args) {
        ListNode zero = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(5);

        zero.next = one;
        one.next = two;
        two.next = three;
        three.next = four;

        ListNode head = solve(zero);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
