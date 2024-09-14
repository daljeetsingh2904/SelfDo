package LinkedList;

import LinkedList.insertionInLinkedList.Node;

public class searchElementLinkedList {

static Node head;
	
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
	
	
		public void search(int dataToSearch) {
		   Node temp=head;
		   boolean found=false;
		   while(temp!=null) {
			   if(temp.data==dataToSearch) {
				   System.out.println("element present in the list");
				   found=true;
				   break;
			   }
			   temp=temp.next;
		   
		   }
		   if(!found) {
			   System.out.println("not present");
		   }
		}
		
		public static void main(String[] args) {
			searchElementLinkedList obj=new searchElementLinkedList();
			obj.push(1);
			obj.push(2);
			obj.push(3);
			
		     obj.search(5);
		}
}
