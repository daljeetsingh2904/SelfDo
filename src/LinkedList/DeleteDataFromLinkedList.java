package LinkedList;

public class DeleteDataFromLinkedList {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Node head=convertToLL(arr);
		head=deleteFromPos(head, 1);
		printList(head);
	
	}
	
	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	private static Node convertToLL(int[] arr) {
		Node head=new Node(arr[0]);
		Node curr=head;
		for(int i=0;i<arr.length;i++) {
			Node temp=new Node(arr[i]);
			curr.next=temp;
			curr=curr.next;
		}
		return head;
	}
	
	public static Node deleteFromPos(Node head,int k) {
		if(head==null)return null;
		
		if(k==1) {
			return head.next;
		}
		
		int count=0;
		Node temp=head;
		Node prev=null;
		
		while(temp!=null) {
			count++;
			if(count==k) {
				prev.next=prev.next.next;
				break;
			}
			prev=temp;
			temp=temp.next;
		}
		return head;
	}
}
