package LinkedList;


public class sortArrayOf0s1s2s {


    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node sort(Node head) {
        if (head == null || head.next == null)
            return head;

        // Dummy nodes to point to the beginning of '0', '1' and '2' lists
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);

        // Pointers to the last node of '0', '1' and '2' lists
        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;

        Node temp = head;

        // Traverse the list
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = temp;
            } else if (temp.data == 1) {
                one.next = temp;
                one = temp;
            } else if (temp.data == 2) {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }

        // Connect '0' list to '1' list, and '1' list to '2' list
        zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
        one.next = twoDummy.next;
        two.next = null;

        // The head of the new sorted list is the next node of the zeroDummy
        return zeroDummy.next;
    }

    // Utility function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a linked list with values 0, 1, 2 in random order
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);

        // Printing original list
        System.out.println("Original List:");
        printList(head);

        // Sorting the list
        head = sort(head);

        // Printing sorted list
        System.out.println("Sorted List:");
        printList(head);
    }
}
