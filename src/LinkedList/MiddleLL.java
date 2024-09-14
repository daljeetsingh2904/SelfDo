package LinkedList;

public class MiddleLL {

	public static Node findMiddle(Node head) {
		Node temp = head;
		Node fast = head, slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		Node head1;
		head1 = new Node(10);
		head1.next = new Node(3);
		head1.next.next = new Node(4);
		 
		 
		 Node head=findMiddle(head1);
//            head=head.next;
            
            printList(head);
	}
}
