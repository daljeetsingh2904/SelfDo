package LinkedList;

import LinkedList.removeNthNode.Node;

public class ReverseLL {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void reverse(Node head) {

		Node temp = head;
		Node next=null;
		Node prev=null;
		while(temp!=null) {
			
		}
	}

	public static int countNode(Node head) {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {
		// Creating a linked list with values 0, 1, 2 in random order
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);

		// Printing original list
		System.out.println("Original List:");
		printList(head);

		// Printing sorted list
		System.out.println("After List:");
		printList(head);
	}

}
