package LinkedList;

import LinkedList.DetectLinkedListHasCycle.Node;

public class mergeTwoSortedLinkedList {

	Node head;
	  static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	
	public static Node mergeTwoLists(Node node1, Node node2) {
		Node dummy = new Node(-1);
		Node curr = dummy;

		while (node1 != null && node2 != null) {
			if (node1.data <= node2.data) {
				curr.next = node1;
				node1 = node1.next;
			} else {
				curr.next = node2;
				node2 = node2.next;
			}
			curr = curr.next;
		}

		if (node1 != null) {
			curr.next = node1;
		} else {
			curr.next = node2;
		}
		return dummy.next;
	}

	public Node push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		mergeTwoSortedLinkedList obj=new mergeTwoSortedLinkedList();
		Node node1=null,node2=null;
		node1=obj.push(1);
		node1=obj.push(2);
		node1=obj.push(3);
		
		node2=obj.push(4);
		node2=obj.push(5);
		node2=obj.push(6);
		
		Node mergedList=mergeTwoLists(node1, node2);
		
		System.out.println("after merging list is --->>> ");
		obj.printList();
	}

}
