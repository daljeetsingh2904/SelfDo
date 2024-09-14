package LinkedList;


public class reverseLinkedList {

	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public Node reverse(Node node) {
		Node prev=null;
		Node curr=node;
		Node next=null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		node =prev;
		return node;
	}
	
	public void push(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
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
		reverseLinkedList obj=new reverseLinkedList();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		
		obj.printList();
		obj.head=obj.reverse(obj.head);
		
		obj.printList();
	}
}
