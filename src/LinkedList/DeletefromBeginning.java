 package LinkedList;

import LinkedList.insertionInLinkedList.Node;

public class DeletefromBeginning {

static Node head;
	
	class Node{
		int data;
		Node next;
		
		 Node(int d){
			data=d;
			next=null;
		}
	}
	
	public void push(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * 
	 * Delete from beginning of list
	 */
	public void fromBeginning(Node node) {
	
		if(head==null) {
			System.out.println("list is empty , nothing to delete");
			return;
		}
		head=head.next;
	}
	
	/**
	 * Delete from End of list
	 */
	
	public void fromEnd() {
		
		if(head.next==null) {
			head=null;
			return;
		}
		
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	
	/**
	 * Delete from Middle of Linked List
	 */
	
	public void fromMiddle() {
		Node slow=head;
		Node fast=head;
		while(fast.next!=null || fast!=null) {
			fast=fast.next.next;
			
		}
	}
	
	public static Node removeTail(Node head) {
			if(head==null || head.next==null) {
				return head;
			}
			
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
			return head;
	}
}
