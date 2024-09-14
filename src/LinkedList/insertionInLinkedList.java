package LinkedList;

public class insertionInLinkedList {

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
	
	/**
	 * After a given node in linked list
	 */
	
	public void push(int data,Node prev) {
		if(prev==null) {
			System.out.println("Previpus node cannot be null");
			return;
		}
		
		Node newNode=new Node(data);
		newNode.next=prev.next;
		prev.next=newNode;
	}
	
	/**
	 * At end of linked list
	 */
	
	public void append(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=new Node(data);
			return;
		}
		
		newNode.next=null;
		
		Node last=head;
		while(last.next!=null) 
			last=last.next;
			
		last.next=newNode;
		return;
			
		
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
		insertionInLinkedList obj=new insertionInLinkedList();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		
		obj.printList();
		
		Node fourthNode=obj.head.next;
		obj.push(4, fourthNode);
		
		System.out.println("after insertion is ");
		obj.printList();
		
		obj.append(5);
		obj.printList();
	}
}
