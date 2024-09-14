package LinkedList;

//class Node{
//	int data;
//	Node next;
//	
//	Node(int d,Node next){
//		this.data=d;
//		this.next=null;
//	}
//	
//	Node(int d){
//		this.data=d;
//	}
//}

public class ConvertArr2LL {


	 static Node convertToLL(int[] arr) {
		Node head=new Node(arr[0]);
		Node curr=head;
		for(int i=0;i<arr.length;i++) {
			Node temp=new Node(arr[i]);
			curr.next=temp;
			curr=curr.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Node head=convertToLL(arr);
		System.out.println(head);
	}
	
}
