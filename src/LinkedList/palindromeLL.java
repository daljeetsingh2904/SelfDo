package LinkedList;

public class palindromeLL {

	public static boolean checkPalindrome(Node head) {
		if (head == null)
			return true;

		//Find the middle of LL
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		
		 // Reverse the second half
		Node prev=null;
		while(slow!=null) {
			Node nextNode=slow.next;
			slow.next=prev;
			prev=slow;
			slow=nextNode;
		}
		
        // Compare the first half and the reversed second half

		Node left=head,right=prev;
		while(right!=null) {
			if(left.data!=right.data) {
				return false;
			}
			left=left.next;
			right=right.next;
		}
		return true;
	}
	
	public static Node createLLUsingArray(int[] arr) {
		if(arr.length==0)
			return null;
		
		Node head=new Node(arr[0]);
		Node curr=head;
		for(int i=1;i<arr.length;i++) {
			curr.next=new Node(arr[i]);
			curr=curr.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 1};
          Node head=createLLUsingArray(arr);
          System.out.println(checkPalindrome(head));
	}
}
