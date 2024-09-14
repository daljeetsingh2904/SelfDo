package LinkedList;

import java.util.HashSet;

import LinkedList.reverseLinkedList.Node;

public class detectAndRemoveCycle {

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

	 void removeLoop(Node head) {
		HashSet<Node> hs = new HashSet<Node>();
		Node prev = null;
		while (head != null) {
			if (hs.contains(head)) {
				prev.next = null;
				return;
			} else {
				hs.add(head);
				prev = head;
				head = head.next;
			}

		}
	}

	public static void main(String[] args) {

		
		detectAndRemoveCycle obj=new detectAndRemoveCycle();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		
		obj.head.next.next.next=obj.head.next.next;
		obj.removeLoop(obj.head);
		
		obj.printList();
	}
}
