/*
Linked-List

Problem Description
Design and implement a Linked List data structure. A node in a linked list should have the following attributes - an integer value and a pointer to the next node. It should support the following operations:
insert_node(position, value) - To insert the input value at the given position in the linked list.
delete_node(position) - Delete the value at the given position from the linked list.
print_ll() - Print the entire linked list, such that each element is followed by a single space.

Note:
If an input position does not satisfy the constraint, no action is required.
Each print query has to be executed in new line.


Problem Constraints
1 <= position <= n where, n is the size of the linked-list.


Input Format
First line contains an integer denoting number of cases, let's say t.
Next t line denotes the cases.


Output Format
When there is a case of print_ll(),  Print the entire linked list, such that each element is followed by a single space.
NOTE: You don't need to return anything.


Example Input
5
i 1 23
i 2 24
p
d 1
p


Example Output
23 24
24


Example Explanation
After first two cases linked list contains two elements 23 and 24.
At third case print: 23 24.
At fourth case delete value at first position, only one element left 24.
At fifth case print: 24.
*/

package LinkedList;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static Node head = null;
    public static int length = 0;

    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if (position > length + 1)
            return;

        if (position == 1) {
            Node temp = head;
            head = new Node(value);
            head.next = temp;

            length++;
            return;
        }

        Node temp = head;
        int i = 1;
        while (i < position - 1) {
            temp = temp.next;
            i++;
        }

        Node n1 = new Node(value);
        n1.next = temp.next;
        temp.next = n1;

        length++;
    }

    public static void delete_node(int position) {
        if (position > length)
            return;

        if (position == 1) {
            head = head.next;
            length--;
            return;
        }

        Node temp = head;
        int i = 1;
        while (i < position - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

        length--;
    }

    public static void print_ll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" ");
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // LinkedList l1 = new LinkedList();

        LinkedList.insert_node(1, 100);
        LinkedList.insert_node(2, 101);
        LinkedList.insert_node(3, 102);
        LinkedList.insert_node(4, 103);
        LinkedList.insert_node(5, 104);
        LinkedList.insert_node(6, 105);

        // LinkedList.print_ll();

        LinkedList.delete_node(6);
        LinkedList.delete_node(3);

        LinkedList.print_ll();

    }

}
