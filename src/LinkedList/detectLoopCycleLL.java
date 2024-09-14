package LinkedList;

import java.util.HashSet;

public class detectLoopCycleLL {

	public static void main(String[] args) {
		Node head1;
		head1 = new Node(10);
		head1.next = new Node(3);
		head1.next.next = new Node(4);
		head1.next.next.next = new Node(5);
		head1.next.next.next.next = new Node(6);

		// Creating a cycle by pointing the next of the last node to the second node (3)
		head1.next.next.next.next.next = head1.next;

		System.out.println(detectLoop(head1));

	}

	public static int detectLoop(Node head) {
		Node temp = head;int len=0;
		HashSet<Node> hs = new HashSet<>();
		while (temp != null) {
			if (hs.contains(temp)) {
				System.out.println("cycle is detected and element is " + temp.data);
				len++;
				return len;
			}
			hs.add(temp);
			temp = temp.next;
		}
		return 0;
	}

}
