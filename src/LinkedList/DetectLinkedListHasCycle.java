package LinkedList;

import java.util.HashSet;


public class DetectLinkedListHasCycle {

	Node head;
	  static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

		//For this space complexity is O(n) and 
		//Time complexity is O(n)
	  
	public static boolean detectCycle(Node head) {
		HashSet<Node> hs = new HashSet<>();
		Node curr = head;
		while (curr != null) {
			if (hs.contains(curr)) {
				return true;
			}
			hs.add(curr);
			curr=curr.next;
		}
		return false;
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	
	//For this space complexity is O(1) and 
	//Time complexity is O(n)
	
	public boolean detectCycleUsingFloydd(Node head) {
		
		if(head==null) {
			return false;
		}
		
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}


	public static void main(String[] args) {

		DetectLinkedListHasCycle obj = new DetectLinkedListHasCycle();
		obj.push(1);
		obj.push(2);
		obj.push(3);

		obj.head.next.next.next = obj.head.next.next;
		
		System.out.println(detectCycle(obj.head));
		System.out.println(obj.detectCycleUsingFloydd(obj.head));
	}
}
