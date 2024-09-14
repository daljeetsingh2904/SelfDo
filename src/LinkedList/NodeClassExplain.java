package LinkedList;


/**
 * 
 * Linked List is not contiguous data structure it stores the address of its next pointer in order to access the element
 *
 */
	class Node{
		int data;
		Node next;
		
		Node(int d,Node next){
			this.data=d;
			this.next=null;
		}
		
		Node(int d){
			this.data=d;
		}
	}
	
	public class NodeClassExplain {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		Node a =new Node(arr[3], null);
		System.out.println(a.data);
	}
}
