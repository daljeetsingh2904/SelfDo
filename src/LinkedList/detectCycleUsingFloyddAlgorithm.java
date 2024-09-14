package LinkedList;

import java.util.HashSet;
import java.util.Set;

import LinkedList.detectAndRemoveCycle.Node;

/*1 2 3 4 5 

Floydd Cycle Algorithm:
slow - will be one ahead at a time 
fast - will be moved two ahead at a time

if loop exists in linked list ,the fast and slow are bound to meet at same point.*/

public class detectCycleUsingFloyddAlgorithm {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public boolean detectCycle() {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null && slow != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				System.out.println(slow.data);
				return true;
			}
		}
		return false;
	}
	
	public Node detectCycleUsingHash() {
		Set<Node> visitedNode=new HashSet<>();
		Node curr=head;
		while(curr!=null) {
			if(visitedNode.contains(curr)) {
				return curr;
			}
			visitedNode.add(curr);
			curr=curr.next;
		}
		return null;
	}

	public static void main(String[] args) {
		detectCycleUsingFloyddAlgorithm llist = new detectCycleUsingFloyddAlgorithm();
		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		/* Create loop for testing */
		llist.head.next.next = llist.head;

		System.out.println(llist.detectCycle());
	}
}
