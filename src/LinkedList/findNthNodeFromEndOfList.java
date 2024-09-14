package LinkedList;

public class findNthNodeFromEndOfList {

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

	public int findNth(int n) {
		int length = 0;
		Node temp = head;

		while (temp != null) {
			temp = temp.next;
			length++;
		}
		System.out.println("lenght is "+length+" and n is "+n);

		if (length < n) {
			return -1;
		}

		temp=head;
		
		for (int i = 1; i < length - n + 1; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public static void main(String[] args) {
       findNthNodeFromEndOfList llist=new findNthNodeFromEndOfList();
       llist.push(20);
       llist.push(4);
       llist.push(15);
       llist.push(35);
       
       System.out.println(llist.findNth(2));
	}

}
