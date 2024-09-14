package LinkedList;

public class removeDuplicate {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		removeDuplicate llist=new removeDuplicate();
		llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);
        
        llist.printList();
        
        llist.removeDuplicat();
        llist.printList();
	}
	
	public void removeDuplicat() {
		Node curr=head;
		while(curr!=null) {
			Node temp=curr;
			while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
			curr.next=temp;
			curr=curr.next;
		}
	}
	
	public void push(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	 void printList()
	    {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
}
