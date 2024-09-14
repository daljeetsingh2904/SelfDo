package LinkedList;

import LinkedList.searchElementLinkedList.Node;

public class lenghtofLinkedList {

Node head;
	
	class Node{
		int data;
		Node next;
		
		 Node(int d){
			data=d;
			next=null;
		}
	}
	/**
	 * At front of Linked List
	 */
	
	public void push(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void findLength() {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		lenghtofLinkedList obj=new lenghtofLinkedList();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		
	    obj.findLength();
	}
}
